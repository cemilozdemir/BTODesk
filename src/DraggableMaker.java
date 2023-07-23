import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.*;

public class DraggableMaker
        extends JComponent implements ActionListener {

    private volatile int screenX = 0;
    private volatile int screenY = 0;
    private volatile int myX = 0;
    private volatile int myY = 0;
    private OnButtonClickLİstener onButtonClickListener;
    JButton button = new JButton();
    JLabel counterLabel;
    Timer timer;
    private LaunchPage launchPage;
    public int masaNo;
    String department = "" +
            "";

    String rehber = "" + "";
    public static ArrayList<MasaInfo> busyRehberler = new ArrayList<MasaInfo>();
    int second, minute;
    String ddSecond, ddMinute;
    DecimalFormat dFormat = new DecimalFormat("00");
    int status; // status 0 == bos, status == 1 aranıyor, status == 2 anlatıyor


    public DraggableMaker(OnButtonClickLİstener listener, int masaNo) {
        this.masaNo = masaNo;
        this.onButtonClickListener = listener;
        status = 0;
        setBorder(new LineBorder(Color.GREEN, 3));
        setBackground(Color.WHITE);
        setBounds(0, 0, 100 , 50);
        setOpaque(false);
        setLayout(new BorderLayout());
        button.setBounds(0,0, 100,50);
        button.setText("M-" + masaNo);
        button.addActionListener(this);
        counterLabel = new JLabel("");
        counterLabel.setHorizontalAlignment(JLabel.CENTER);
        counterLabel.setText("00:00");
        add(button, BorderLayout.SOUTH);
        add(counterLabel, BorderLayout.NORTH);






        second =0;
        minute =0;
        normalTimer();

        addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) { }

            @Override
            public void mousePressed(MouseEvent e) {
                screenX = e.getXOnScreen();
                screenY = e.getYOnScreen();

                myX = getX();
                myY = getY();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) { }

            @Override
            public void mouseExited(MouseEvent e) { }

        });


        addMouseMotionListener(new MouseMotionListener() {

            @Override
            public void mouseDragged(MouseEvent e) {
                int deltaX = e.getXOnScreen() - screenX;
                int deltaY = e.getYOnScreen() - screenY;

                setLocation(myX + deltaX, myY + deltaY);
            }

            @Override
            public void mouseMoved(MouseEvent e) { }

        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MasaInfo temp = new MasaInfo();



        if (status == 0 ){

            Departments newWindow = new Departments();
            department = newWindow.getDepartment();



            if (department != null){


            RehberListForDep rehberListForDep = new RehberListForDep(masaNo, department, 2);


            if (rehberListForDep.getFound()){
                rehber = rehberListForDep.giveRehber();

                if (rehber != null){

                    try {
                        File dosya = new File("beklemeSureler.txt");
                        FileWriter fw = new FileWriter("beklemeSureler.txt", true);
                        fw.write("Bolum: " + department + " - Sure: " + ddMinute + ":" + ddSecond + "\n");


                        if (fw != null){
                            fw.flush();
                            fw.close();
                        }
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                    button.setText("M-" + masaNo);
                    temp.setName(rehber);
                    temp.setDepart(department);
                    temp.setDeskNo(masaNo);

                    busyRehberler.add(temp);
                    for (Rehber item: LaunchPage.rehbers){
                        if (item.getName() == rehber){

                            item.setFree(2);
                        }
                    }
                    setBorder(new LineBorder(Color.ORANGE, 3));
                    status = 2;
                    counterLabel.setText("00:00");
                    second = 0;
                    minute = 0;
                    timer.start();
                    if(onButtonClickListener != null){
                        onButtonClickListener.onButtonClick("Rehber: " + rehber + " - Department: " + department);
                    }
                }
            }
            else if (rehberListForDep.getIptal()){

                    setBorder(new LineBorder(Color.GREEN, 3));
                    status = 0;
                    counterLabel.setText("00:00");
                    second = 0;
                    minute = 0;
                    timer.stop();
                }
            else {

                if (department != null) {
                    setBorder(new LineBorder(Color.RED, 3));
                    status = 1;
                    button.setText(department + "-" + masaNo);

                    timer.start();
                }
            }
            }




        }
        else if (status == 1){

            RehberListForDep rehberListForDep = new RehberListForDep(masaNo,department, 2);


            if (rehberListForDep.getFound()){
                    rehber = rehberListForDep.giveRehber();

                if (rehber != null){

                    try {
                        File dosya = new File("beklemeSureler.txt");
                        FileWriter fw = new FileWriter("beklemeSureler.txt", true);
                        fw.write("Bolum: " + department + " - Sure: " + ddMinute + ":" + ddSecond + "\n");


                        if (fw != null){
                            fw.flush();
                            fw.close();
                        }
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                    button.setText("M-" + masaNo);
                    temp.setName(rehber);
                    temp.setDepart(department);
                    temp.setDeskNo(masaNo);

                    busyRehberler.add(temp);
                    for (Rehber item: LaunchPage.rehbers){
                        if (item.getName() == rehber){

                            item.setFree(2);
                        }
                    }
                    setBorder(new LineBorder(Color.ORANGE, 3));
                    status = 2;
                    counterLabel.setText("00:00");
                    second = 0;
                    minute = 0;
                    timer.start();
                    if(onButtonClickListener != null){
                        onButtonClickListener.onButtonClick("Rehber: " + rehber + " - Department: " + department);
                    }
                }

            }
            if (rehberListForDep.getIptal()){

                setBorder(new LineBorder(Color.GREEN, 3));
                status = 0;
                counterLabel.setText("00:00");
                second = 0;
                minute = 0;
                timer.stop();
            }




        }
        else if (status == 2){
            try {
                File dosya = new File("anlatmaSureler.txt");
                FileWriter fw = new FileWriter("anlatmaSureler.txt", true);
                fw.write("Rehber: " + rehber + " Bolum: " + department +  " - Sure: " + ddMinute + ":" + ddSecond + "\n");


                if (fw != null){
                    fw.flush();
                    fw.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            DraggableMaker.busyRehberler.removeIf(item -> item.getName().equals(rehber));
            for (Rehber item: LaunchPage.rehbers){
                if (item.getName() == rehber){
                    item.setFree(1);

                }
            }
            setBorder(new LineBorder(Color.GREEN, 3));
            status = 0;
            counterLabel.setText("00:00");
            second = 0;
            minute = 0;
            timer.stop();

            if(onButtonClickListener != null){
                onButtonClickListener.onButtonClick("Rehber: " + rehber + " - Department: " + department);
            }

        }




    }


    public void normalTimer() {

        timer = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                second++;

                ddSecond = dFormat.format(second);
                ddMinute = dFormat.format(minute);
                counterLabel.setText(ddMinute + ":" + ddSecond);

                if(second==60) {
                    second=0;
                    minute++;

                    ddSecond = dFormat.format(second);
                    ddMinute = dFormat.format(minute);
                    counterLabel.setText(ddMinute + ":" + ddSecond);
                }
            }
        });
    }

    public void setButtonText(String text){
        button.setText(text);
    }




}