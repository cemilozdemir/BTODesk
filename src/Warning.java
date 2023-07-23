import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Warning implements ActionListener {

    JDialog d1 = new JDialog();
    JDialog frame = new JDialog(d1,Dialog.ModalityType.DOCUMENT_MODAL);
    JButton button = new JButton("Yaptığım hatanın farkındayım. Uygun rehber bulacağım");
    JLabel label = new JLabel("Eğer uygunsa da, o masayı kapatıp buraya ekleyeceğim.");

    String department;
    Warning(){


        button.setSize(390, 40);
        label.setSize(390,40);

        button.setLocation(50,90);
        label.setLocation(50, 140);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        frame.add(button);
        frame.add(label);


        frame.setSize(500,260);

        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public String getDepartment(){
        return department;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton o = (JButton) e.getSource();
        String name = o.getText();
        department = name;

        frame.dispose();


    }
}
