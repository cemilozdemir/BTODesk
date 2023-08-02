import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Comparator;

public class allRehbers implements ActionListener {

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




    allRehbers(){

        frame.add(northPanel);
        frame.add(southPanel);



        northPanel.setSize(800, 400);


        northPanel.setLocation(50, 10);

        int i = 0;
        ArrayList<Rehber> temp = LaunchPage.rehbers;
        temp.sort(Comparator.comparing(Rehber::getOriginalDepartment));
        for (Rehber item: temp){
            i++;
            JButton label = new JButton(item.getName() + " - " + item.getOriginalDepartment() + "\t");

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

                    if (item.isFree() == 1){
                        item.setFree(3);
                        label.setForeground(Color.ORANGE);
                        frame.repaint();
                    }
                    else if (item.isFree() == 3){
                        item.setFree(1);
                        label.setForeground(new Color(6, 115, 17));
                        frame.repaint();

                    }
                }
            });
            System.out.println(i);
        }



        temp.sort(Comparator.comparing(Rehber::getName));

        frame.setSize(900,320);

        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

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
