import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RehberlerFull implements ActionListener {

    JDialog d1 = new JDialog();
    JDialog frame = new JDialog(d1,Dialog.ModalityType.DOCUMENT_MODAL);
    JButton button1 = new JButton("CS");
    JButton button2 = new JButton("CTIS");
    JButton button3 = new JButton("EE");
    JButton button4 = new JButton("IE");
    JButton button5 = new JButton("MAN");
    JButton button6 = new JButton("ARCH");
    JButton button7 = new JButton("comd");
    JButton button8 = new JButton("ECON");
    JButton button9 = new JButton("HART");
    JButton button10 = new JButton("IAED");
    JButton button11 = new JButton("IR");
    JButton button12 = new JButton("LAW");
    JButton button13 = new JButton("MBG");
    JButton button14 = new JButton("ME");
    JButton button15 = new JButton("POLS");
    JButton button16 = new JButton("PSYC");
    JButton button17 = new JButton("TRIN");
    JButton button18 = new JButton("LAUD");
    JButton button19 = new JButton("GRA");
    JButton button20 = new JButton("CHEM");
    JButton button21 = new JButton("MATH");
    JButton button22 = new JButton("AMER");
    JButton button23 = new JButton("ELIT");
    JButton button24 = new JButton("PHIL");
    JButton button25 = new JButton("THM");

    String department;
    RehberlerFull(){
        button1.setBounds(0,0,70,35);
        button1.addActionListener( this);

        button2.setBounds(70,0,70,35);
        button2.addActionListener(this);

        button3.setBounds(140, 0, 70, 35);
        button3.addActionListener(this);

        button4.setBounds(210, 0 ,70, 35);
        button4.addActionListener(this);

        button5.setBounds(280, 0 , 70 ,35);
        button5.addActionListener(this);

        button6.setBounds(0, 35 , 70 ,35);
        button6.addActionListener(this);

        button7.setBounds(70, 35 , 70 ,35);
        button7.addActionListener(this);

        button8.setBounds(140, 35 , 70 ,35);
        button8.addActionListener(this);

        button9.setBounds(210, 35 , 70 ,35);
        button9.addActionListener(this);

        button10.setBounds(280, 35 , 70 ,35);
        button10.addActionListener(this);

        button11.setBounds(0, 70 , 70 ,35);
        button11.addActionListener(this);

        button12.setBounds(70, 70 , 70 ,35);
        button12.addActionListener(this);

        button13.setBounds(140, 70 , 70 ,35);
        button13.addActionListener(this);

        button14.setBounds(210, 70 , 70 ,35);
        button14.addActionListener(this);

        button15.setBounds(280, 70 , 70 ,35);
        button15.addActionListener(this);

        button16.setBounds(0, 105 , 70 ,35);
        button16.addActionListener(this);

        button17.setBounds(70, 105 , 70 ,35);
        button17.addActionListener(this);

        button18.setBounds(140, 105 , 70 ,35);
        button18.addActionListener(this);

        button19.setBounds(210, 105 , 70 ,35);
        button19.addActionListener(this);

        button20.setBounds(280, 105 , 70 ,35);
        button20.addActionListener(this);

        button21.setBounds(0, 140 , 70 ,35);
        button21.addActionListener(this);

        button22.setBounds(70, 140 , 70 ,35);
        button22.addActionListener(this);

        button23.setBounds(140, 140 , 70 ,35);
        button23.addActionListener(this);

        button24.setBounds(210, 140 , 70 ,35);
        button24.addActionListener(this);

        button25.setBounds(280, 140 , 70 ,35);
        button25.addActionListener(this);



        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(button10);
        frame.add(button11);
        frame.add(button12);
        frame.add(button13);
        frame.add(button14);
        frame.add(button15);
        frame.add(button16);
        frame.add(button17);
        frame.add(button18);
        frame.add(button19);
        frame.add(button20);
        frame.add(button21);
        frame.add(button22);
        frame.add(button23);
        frame.add(button24);
        frame.add(button25);


        frame.setSize(365,220);

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

        RehberListForDep newFrame = new RehberListForDep(-1, department, false);


    }
}
