import javax.imageio.ImageIO;
import javax.sound.sampled.Line;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LaunchPage implements OnButtonClickLİstener  {

    @Override
    public void onButtonClick(String label) {
        buildPanel();

    }


    public ArrayList<MasaInfo> arrayList = DraggableMaker.busyRehberler;
    JFrame frame = new JFrame("Acar Systems v1.1");
    JButton masadakiler = new JButton("Extra Durum");
    JButton availableRehberler = new JButton("Rehberler");
    public static ArrayList<Rehber> rehbers = new ArrayList<Rehber>();
    DraggableMaker mc = new DraggableMaker(this,1);
    DraggableMaker mc1 = new DraggableMaker(this,2);
    DraggableMaker mc2 = new DraggableMaker(this,3);
    DraggableMaker mc3 = new DraggableMaker(this,4);
    DraggableMaker mc4 = new DraggableMaker(this,5);
    DraggableMaker mc5 = new DraggableMaker(this,6);
    DraggableMaker mc6 = new DraggableMaker(this,7);
    DraggableMaker mc7 = new DraggableMaker(this,8);
    DraggableMaker mc8 = new DraggableMaker(this,9);
    DraggableMaker mc9 = new DraggableMaker(this,10);
    DraggableMaker mc10 = new DraggableMaker(this,11);
    DraggableMaker mc11 = new DraggableMaker(this,12);
    DraggableMaker mc12 = new DraggableMaker(this,13);
    DraggableMaker mc13 = new DraggableMaker(this,14);
    DraggableMaker mc14 = new DraggableMaker(this,15);
    DraggableMaker mc15 = new DraggableMaker(this,16);
    DraggableMaker mc16 = new DraggableMaker(this,17);
    DraggableMaker mc17 = new DraggableMaker(this,18);
    DraggableMaker mc18 = new DraggableMaker(this,19);
    DraggableMaker mc19 = new DraggableMaker(this,20);
    DraggableMaker mc20 = new DraggableMaker(this,21);
    DraggableMaker mc21 = new DraggableMaker(this,22);
    DraggableMaker mc22 = new DraggableMaker(this,23);
    DraggableMaker mc23 = new DraggableMaker(this,24);
    DraggableMaker mc24 = new DraggableMaker(this,25);
    DraggableMaker mc25 = new DraggableMaker(this,26);
    DraggableMaker mc26 = new DraggableMaker(this,27);
    JPanel sidePanel = new JPanel();




    LaunchPage(){

        addToRehbers("Cemil", "CS");
        addToRehbers("Alper", "CS");
        addToRehbers("Anıl", "CS");
        addToRehbers("Bengisu", "CS");
        addToRehbers("Berkin", "CS");
        addToRehbers("Beyza", "CS");
        addToRehbers("E.Kerem", "CS");
        addToRehbers("Kubilay", "CS");
        addToRehbers("Lara", "CS");
        addToRehbers("Zehra", "CS");
        addToRehbers("Sude", "AMER");
        addToRehbers("Bensu", "ARCH");
        addToRehbers("Doğa K", "ARCH");
        addToRehbers("Başak", "CHEM");
        addToRehbers("O.Faruk", "CHEM");
        addToRehbers("EgeBarış","comd");
        addToRehbers("Ece", "CTIS");
        addToRehbers("Alpin", "ECON");
        addToRehbers("Burak","ECON");
        addToRehbers("Başak D", "EE");
        addToRehbers("Boray", "EE");
        addToRehbers("Çipek","EE");
        addToRehbers("Mert","EE");
        addToRehbers("O.Burak","EE");
        addToRehbers("Yağız","EE");
        addToRehbers("Başak S", "IAED");
        addToRehbers("Irem", "IAED");
        addToRehbers("Dilara","IE");
        addToRehbers("Doğa I", "IE");
        addToRehbers("Ece B","IE");
        addToRehbers("Egehan", "IE");
        addToRehbers("Elif","IE");
        addToRehbers("Taha B","IE");
        addToRehbers("Arzum","IR");
        addToRehbers("Meriç","IR");
        addToRehbers("Taha E","IR");
        addToRehbers("Ege İ","LAW");
        addToRehbers("Ezgi","LAW");
        addToRehbers("Nart","LAW");
        addToRehbers("Yağmursan","LAW");
        addToRehbers("Alperen","MAN");
        addToRehbers("Dilge","MAN");
        addToRehbers("Fatma","MAN");
        addToRehbers("Göksü","MAN");
        addToRehbers("Berk","ME");
        addToRehbers("Dicle","ME");
        addToRehbers("Umut","ME");
        addToRehbers("Zeynep","PHYS");
        addToRehbers("Bora","POLS");
        addToRehbers("Eylül","POLS");
        addToRehbers("Dilanur","PSYC");
        addToRehbers("Melis","PSYC");
        addToRehbers("Dilay","TRIN");

        rehbers.sort(Comparator.comparing(Rehber::getName));

        for (Rehber item: rehbers){
            if (item.getOriginalDepartment() == "CS"){
                item.addDep("EE");
                item.addDep("MBG");
                item.addDep("CTIS");
            }
            else if (item.getOriginalDepartment() == "EE"){
                item.addDep("CS");
            }
            else if (item.getOriginalDepartment() == "IE"){
                item.addDep("ME");
                item.addDep("MAN");
                item.addDep("THM");
            }
            else if (item.getOriginalDepartment() == "ME"){
                item.addDep("IE");
            }
            else if (item.getOriginalDepartment() == "CHEM"){
                item.addDep("MATH");
                item.addDep("MBG");
                item.addDep("PHYS");
            }
            else if (item.getOriginalDepartment() == "PHYS"){
                item.addDep("MATH");
                item.addDep("MBG");
                item.addDep("CHEM");
            }
            else if (item.getOriginalDepartment() == "ARCH"){
                item.addDep("IAED");
                item.addDep("LAUD");
                item.addDep("comd");
                item.addDep("GRA");
            }
            else if (item.getOriginalDepartment() == "IAED"){
                item.addDep("ARCH");
                item.addDep("LAUD");
                item.addDep("comd");
                item.addDep("GRA");
            }
            else if (item.getOriginalDepartment() == "LAUD"){
                item.addDep("IAED");
                item.addDep("ARCH");
                item.addDep("comd");
                item.addDep("GRA");
            }
            else if (item.getOriginalDepartment() == "comd"){
                item.addDep("IAED");
                item.addDep("LAUD");
                item.addDep("ARCH");
                item.addDep("GRA");
            }
            else if (item.getOriginalDepartment() == "GRA"){
                item.addDep("IAED");
                item.addDep("LAUD");
                item.addDep("comd");
                item.addDep("ARCH");
            }
            else if (item.getOriginalDepartment() == "POLS"){
                item.addDep("IR");
                item.addDep("PSYC");
                item.addDep("LAW");
            }
            else if (item.getOriginalDepartment() == "IR"){
                item.addDep("POLS");
                item.addDep("PSYC");
                item.addDep("LAW");
            }
            else if (item.getOriginalDepartment() == "ECON"){
                item.addDep("MAN");
                item.addDep("THM");
                item.addDep("POLS");
                item.addDep("IR");
            }
            else if (item.getOriginalDepartment() == "PSYC"){
                item.addDep("POLS");
                item.addDep("IR");
            }
            else if (item.getOriginalDepartment() == "MAN"){
                item.addDep("ECON");
                item.addDep("THM");
            }
            else if (item.getOriginalDepartment() == "LAW"){
                item.addDep("HART");
                item.addDep("AMER");
                item.addDep("ELIT");
                item.addDep("TRIN");
                item.addDep("PHIL");
            }
            else if (item.getOriginalDepartment() == "HART"){
                item.addDep("AMER");
                item.addDep("ELIT");
                item.addDep("TRIN");
                item.addDep("PHIL");
            }
            else if (item.getOriginalDepartment() == "AMER"){
                item.addDep("HART");
                item.addDep("ELIT");
                item.addDep("TRIN");
                item.addDep("PHIL");
            }
            else if (item.getOriginalDepartment() == "TRIN"){
                item.addDep("HART");
                item.addDep("ELIT");
                item.addDep("AMER");
                item.addDep("PHIL");
            }
            else if (item.getOriginalDepartment() == "PHIL"){
                item.addDep("HART");
                item.addDep("ELIT");
                item.addDep("TRIN");
                item.addDep("AMER");
            }






        }

        ;


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setLayout(null);
       // set BoxLayout to sidePanel to align labels vertically


        try {
            frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("photo.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        sidePanel.setLayout(new BoxLayout(sidePanel, BoxLayout.Y_AXIS));
        frame.add(sidePanel);
        sidePanel.setSize(300, frame.getHeight());
        masadakiler.setSize(120, 35);
        frame.add(masadakiler);
        masadakiler.setLocation(680,20);
        availableRehberler.setSize(120,35);
        frame.add(availableRehberler);
        availableRehberler.setLocation(800,20);
        frame.add(mc);
        mc.setLocation(902,556);
        frame.add(mc1);
        mc1.setLocation(800,516);
        frame.add(mc2);
        mc2.setLocation(712,495);
        frame.add(mc3);
        mc3.setLocation(621,498);
        frame.add(mc4);
        mc4.setLocation(516, 470);
        frame.add(mc5);
        mc5.setLocation(418,456);
        frame.add(mc6);
        mc6.setLocation(516,399);
        frame.add(mc7);
        mc7.setLocation(628, 393);
        frame.add(mc8);
        mc8.setLocation(733,385);
        frame.add(mc9);
        mc9.setLocation(838,392);
        frame.add(mc10);
        mc10.setLocation(937,391);
        frame.add(mc11);
        mc11.setLocation(980,332);
        frame.add(mc12);
        mc12.setLocation(886,324);
        frame.add(mc13);
        mc13.setLocation(772,303);
        frame.add(mc14);
        mc14.setLocation(666,301);
        frame.add(mc15);
        mc15.setLocation(536,306);
        frame.add(mc16);
        mc16.setLocation(530,217);
        frame.add(mc17);
        mc17.setLocation(658,209);
        frame.add(mc18);
        mc18.setLocation(762, 201);
        frame.add(mc19);
        mc19.setLocation(882,146);
        frame.add(mc20);
        mc20.setLocation(735,130);
        frame.add(mc21);
        mc21.setLocation(581,106);
        frame.add(mc22);
        mc22.setLocation(1361,15);
        frame.add(mc23);
        mc23.setLocation(1361,15);
        frame.add(mc24);
        mc24.setLocation(1361,15);
        frame.add(mc25);
        mc25.setLocation(1361,15);
        frame.add(mc26);
        mc26.setLocation(1361,15);

        masadakiler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Masadakiler newMasa = new Masadakiler();
            }
        });

        availableRehberler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RehberlerFull newRehberlerFull = new RehberlerFull();
            }
        });






        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);



    }



    public void addToRehbers(String name, String department){
        Rehber temp = new Rehber(name, department);
        rehbers.add(temp);

    }


    public void buildPanel() {
        // First, remove all existing components
        sidePanel.removeAll();
        rehbers.sort(Comparator.comparing(Rehber::getName));
        arrayList.sort(Comparator.comparing(MasaInfo::getName));
        // Then, add a label for each item in the array list
        for (MasaInfo item : arrayList) {
            if (item != null){
                JLabel label = new JLabel(item.getName() + "  /  " + item.getDepart() + "  /  M-" + item.getDeskNo());
                sidePanel.add(label);
            }
        }

        // This will refresh the panel and show the new labels
        sidePanel.revalidate();
        sidePanel.repaint();
    }




}
