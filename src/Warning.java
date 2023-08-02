import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Warning implements ActionListener {

    JDialog d1 = new JDialog();
    JDialog frame = new JDialog(d1,Dialog.ModalityType.DOCUMENT_MODAL);
    JButton button = new JButton();
    JLabel label = new JLabel();

    String department;
    Warning(String hata, String expl){


        ImageIcon icon = new ImageIcon("cemil.jpeg");
        JLabel photoLabel = new JLabel(icon);
        photoLabel.setSize(250,250);
        photoLabel.setLocation(125, 20);

        button.setSize(390, 40);
        label.setSize(390,40);
        button.setText(hata);
        label.setText(expl);
        button.setLocation(50,290);
        label.setLocation(50, 340);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        frame.add(button);
        frame.add(label);
        frame.add(photoLabel);




        frame.setSize(500,500);

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
