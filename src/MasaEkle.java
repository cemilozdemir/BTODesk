import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MasaEkle implements ActionListener {

    JDialog d1 = new JDialog();
    JDialog frame = new JDialog(d1,Dialog.ModalityType.DOCUMENT_MODAL);
    JTextArea nameArea = new JTextArea();
    JLabel masaIsmi = new JLabel("Masa İsmi (Yalnızca bir harf gir):");
    JLabel masaNumarası = new JLabel("Masa Numarası:");
    JTextArea noArea = new JTextArea();
    JButton ekle = new JButton("Ekle");

    public char getIsim() {
        return isim;
    }

    public void setIsim(char isim) {
        this.isim = isim;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    char isim = ' ';
    int numara = -1;
    String department;
    MasaEkle(){

        masaIsmi.setSize(200,20);
        masaIsmi.setLocation(80,20);
        masaNumarası.setSize(100,40);
        masaNumarası.setLocation(80, 60);
        nameArea.setSize(200, 20);
        nameArea.setLocation( 80,40);
        noArea.setSize(200,20);
        noArea.setLocation(80, 90);
        ekle.setSize(80, 40);
        ekle.setLocation( 140, 120);
        frame.add(masaIsmi);
        frame.add(ekle);
        frame.add(nameArea);

        ekle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (nameArea.getText().length() > 0 && noArea.getText().length() > 0){
                    isim = nameArea.getText().trim().charAt(0);
                    numara = Integer.parseInt(noArea.getText());

                    frame.dispose();
                }
                else{
                    Warning warn = new Warning("Yaptığım hatanın farkındayım, alanları boş bırakmayacağım", "");
                }
            }
        });
        frame.add(masaNumarası);
        frame.add(noArea);

        frame.setSize(360,220);

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
