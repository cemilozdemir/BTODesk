import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RehberListForDep implements ActionListener {

    JDialog d1 = new JDialog();
    JDialog frame = new JDialog(d1,Dialog.ModalityType.DOCUMENT_MODAL);
    JPanel northPanel = new JPanel();
    JPanel soutButtonPanel = new JPanel();
    public boolean addButtonBool;
   public JPanel southPanel = new JPanel();
   public boolean found = false;
   public String rehber = "";
   public boolean iptal = false;
   JButton label = new JButton();




    RehberListForDep(int masaNo, String department, int buttonChoice){

        frame.add(northPanel);
        frame.add(southPanel);
        frame.add(soutButtonPanel);
        if (masaNo != -1)
        frame.setTitle("Masa - " + masaNo);


        northPanel.setSize(250, 200);
        southPanel.setSize(250, 200);
        soutButtonPanel.setSize(250, 100);

        JLabel label1 = new JLabel("Has kendi bölümü olanlar:                    ");
        northPanel.add(label1);

        JLabel label2 = new JLabel("Bölümü değil ama anlatır: ");
        southPanel.add(label2);

        northPanel.setLocation(125, 30);
        southPanel.setLocation(125, 300);
        soutButtonPanel.setLocation(125, 500);
        for (Rehber item: LaunchPage.rehbers){
            if (department == item.getOriginalDepartment()){
                final JButton label = new JButton(item.getName() + " / ");
                if (item.isFree() == 1){
                    label.setForeground(new Color(6, 115, 17));
                }
                else if (item.isFree() == 2){
                    label.setForeground(Color.RED);
                }
                else if (item.isFree() == 3){
                    label.setForeground(Color.ORANGE);
                }
                northPanel.add(label);
                label.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (item.isFree() == 2 || item.isFree() == 3){
                            Warning warn = new Warning("Yaptığım hatanın farkındayım. Uygun rehber bulacağım","Eğer uygunsa da, o masayı kapatıp buraya ekleyeceğim." );
                        }
                        else{
                            found = true;
                            rehber = item.getName();
                            frame.dispose();
                        }
                    }
                });
            }
            if (item.otherDeps.contains(department)){
                final JButton label = new JButton(item.getName() + " / ");
                southPanel.add(label);
                if (item.isFree() == 1){
                    label.setForeground(new Color(6, 115, 17));
                }
                else if (item.isFree() == 2){
                    label.setForeground(Color.RED);
                }
                else if (item.isFree() == 3){
                    label.setForeground(Color.ORANGE);
                }
                label.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (item.isFree() == 2){
                            Warning warn = new Warning("Yaptığım hatanın farkındayım. Uygun rehber bulacağım","Eğer uygunsa da, o masayı kapatıp buraya ekleyeceğim.");
                        }
                        else{
                            found = true;
                            rehber = item.getName();
                            frame.dispose();
                        }

                    }
                });
            }
        }


        addButtons(buttonChoice);

        frame.setSize(500,600);

        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }



    public void addButtons(int num){
        if (num == 1){
            JButton beklemedeyiz = new JButton("Hala gelmedi");
            JButton geldi = new JButton("Geldi çok şükür");

            beklemedeyiz.setSize(100,60);
            geldi.setSize(100, 60);

            soutButtonPanel.add(beklemedeyiz);


            beklemedeyiz.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    found = false;
                    frame.dispose();

                }
            });
        }
        if (num == 2){
            JButton belliDegil = new JButton("Rehber Belli Değil");
            JButton iptalEt = new JButton("İptal Et");

            belliDegil.setSize(100,60);

            iptalEt.setSize(100,60);


            soutButtonPanel.add(belliDegil);
            soutButtonPanel.add(iptalEt);


            belliDegil.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    found = false;
                    frame.dispose();

                }
            });

            iptalEt.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    iptal = true;
                    frame.dispose();
                }
            });
        }


    }

    public void setAddButtonBool(boolean bool){
        this.addButtonBool = bool;
    }

    public boolean getFound(){
        return this.found;
    }

    public boolean getIptal(){return this.iptal;}

    public String giveRehber(){
        return this.rehber;
    }



    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
