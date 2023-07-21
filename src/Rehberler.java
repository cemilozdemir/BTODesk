import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Rehberler implements ActionListener {

    JDialog d1 = new JDialog();
    JDialog frame = new JDialog(d1,Dialog.ModalityType.DOCUMENT_MODAL);
    public int deskNo;




    String rehber;
    Rehberler(){
        // Create a dropdown list with items

        String[] items = new String[LaunchPage.rehbers.size()];

        for (int i = 0; i < LaunchPage.rehbers.size() ; i++) {
            items[i] = LaunchPage.rehbers.get(i).getName();
        }



        JComboBox<String> dropdown = new JComboBox<>(items);
        JButton button = new JButton("OK");

        frame.setSize(365,220);
        dropdown.setSize(350, 40);
        button.setSize(100, 40);
        dropdown.setLocation(0,40);
        button.setLocation(120, 120);
        frame.add(dropdown);
        frame.add(button);



        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String selectedOption = (String) dropdown.getSelectedItem();
                rehber = selectedOption;
                frame.dispose();
            }
        });

        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public String getRehber(){
        return rehber;
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        JButton o = (JButton) e.getSource();
        String name = o.getText();
        rehber = name;
        frame.dispose();
    }
}
