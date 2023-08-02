import javax.sound.sampled.Line;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Desk  extends JComponent implements ActionListener {

    String val;
    int status;
    DraggableMaker desk = new DraggableMaker(null, 0, 'M');

    JButton myButton = new JButton();

    JLabel counterLabel;
    Timer timer;
    int second, minute;
    String ddSecond, ddMinute;
    DecimalFormat dFormat = new DecimalFormat("00");

    public Desk(String val, int status){
        setLayout(new BorderLayout());
        setOpaque(false);
        setBackground(Color.white);
        setBounds(0,0, 80,50);



        if (status == 0){
            desk.setBorder(new LineBorder(Color.GREEN, 3));
        }
        else if (status == 1){
            desk.setBorder(new LineBorder(Color.red, 3));
        }
        else{
            desk.setBorder(new LineBorder(Color.orange, 3));
        }



        myButton.setFocusable(false);
        myButton.addActionListener(this);
        myButton.setText(val);


        counterLabel = new JLabel("");
        counterLabel.setHorizontalAlignment(JLabel.CENTER);
        counterLabel.setText("00:00");

        desk.add(myButton, BorderLayout.SOUTH);
        desk.add(counterLabel, BorderLayout.NORTH);
        add(desk);

        second =0;
        minute =0;
        normalTimer();


    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    public void actionPerformed(ActionEvent e) {
        counterLabel.setText("00:00");
        second =0;
        minute =0;
        timer.start();

        desk.setBorder(new LineBorder(Color.red,3 ) );

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


}
