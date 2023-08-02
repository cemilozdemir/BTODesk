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
    JButton masaEkle = new JButton("Masa ekle");
    public static ArrayList<Rehber> rehbers = new ArrayList<Rehber>();
    DraggableMaker mc = new DraggableMaker(this,1, 'M');
    DraggableMaker mc1 = new DraggableMaker(this,2,'M');
    DraggableMaker mc2 = new DraggableMaker(this,3,'M');
    DraggableMaker mc3 = new DraggableMaker(this,4,'M');
    DraggableMaker mc4 = new DraggableMaker(this,5,'M');
    DraggableMaker mc5 = new DraggableMaker(this,6,'M');
    DraggableMaker mc6 = new DraggableMaker(this,7,'M');
    DraggableMaker mc7 = new DraggableMaker(this,8,'M');
    DraggableMaker mc8 = new DraggableMaker(this,9,'M');
    DraggableMaker mc9 = new DraggableMaker(this,10,'M');
    DraggableMaker mc10 = new DraggableMaker(this,11,'M');
    DraggableMaker mc11 = new DraggableMaker(this,12,'M');
    DraggableMaker mc12 = new DraggableMaker(this,13,'M');
    DraggableMaker mc13 = new DraggableMaker(this,14,'M');
    DraggableMaker mc14 = new DraggableMaker(this,15,'M');
    DraggableMaker mc15 = new DraggableMaker(this,16,'M');
    DraggableMaker mc16 = new DraggableMaker(this,17,'M');
    DraggableMaker mc17 = new DraggableMaker(this,18,'M');
    DraggableMaker mc18 = new DraggableMaker(this,19,'M');
    DraggableMaker mc19 = new DraggableMaker(this,20,'M');
    DraggableMaker mc20 = new DraggableMaker(this,21,'M');
    DraggableMaker mc21 = new DraggableMaker(this,22,'M');
    DraggableMaker mc22 = new DraggableMaker(this,23,'M');
    DraggableMaker mc23 = new DraggableMaker(this,24,'M');
    DraggableMaker mc24 = new DraggableMaker(this,25,'M');
    DraggableMaker mc25 = new DraggableMaker(this,26,'M');
    DraggableMaker mc26 = new DraggableMaker(this,27,'M');
    DraggableMaker mc27 = new DraggableMaker(this, 28,'M');
    DraggableMaker mc28 = new DraggableMaker(this, 29,'M');
    DraggableMaker mc29 = new DraggableMaker(this,30,'M');

    DraggableMaker mc30 = new DraggableMaker(this, 31,'M');
    DraggableMaker mc31 = new DraggableMaker(this, 32,'M');
    DraggableMaker mc32 = new DraggableMaker(this,33,'M');
    DraggableMaker mc33 = new DraggableMaker(this, 1, 'E');
    DraggableMaker mc34 = new DraggableMaker(this, 2, 'E');
    DraggableMaker mc35 = new DraggableMaker(this, 3, 'E');




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
        addToRehbers("Zeynep Ç","PHYS");
        addToRehbers("Bora","POLS");
        addToRehbers("Eylül","POLS");
        addToRehbers("Dilanur","PSYC");
        addToRehbers("Melis","PSYC");
        addToRehbers("Dilay","TRIN");
        addToRehbers("Zeynep Su", "CS");
        addToRehbers("Atakan", "IE");

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
        sidePanel.setSize(200, frame.getHeight());
        masadakiler.setSize(120, 35);
        masaEkle.setSize(120,35);
        masaEkle.setLocation(1320, 740);
        masaEkle.setVisible(false);
        frame.add(masaEkle);
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
        mc22.setLocation(1350,15);
        frame.add(mc23);
        mc23.setLocation(1350,15);
        frame.add(mc24);
        mc24.setLocation(1350,15);
        frame.add(mc25);
        mc25.setLocation(1350,15);
        frame.add(mc26);
        mc26.setLocation(1350,15);
        frame.add(mc27);
        mc27.setLocation(1350,15);
        frame.add(mc28);
        mc28.setLocation(1350,15);
        frame.add(mc29);
        mc29.setLocation(1350,15);
        frame.add(mc30);
        mc30.setLocation(1350,15);
        frame.add(mc31);
        mc31.setLocation(1350,15);
        frame.add(mc32);
        mc32.setLocation(1350,15);
        for (int i = 34; i < 60 ; i++) {
            addDesk(i, 1350, 15, 'M');
        }

        mc33.setLocation(1350, 65);
        mc34.setLocation(1350,65);
        mc35.setLocation(1350,65);
        addDesk(1, 1350, 115, 'Ç');
        addDesk(2, 1350, 115, 'Ç');
        addDesk(3, 1350, 115, 'Ç');
        frame.add(mc33);
        frame.add(mc34);
        frame.add(mc35);


        masadakiler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Masadakiler newMasa = new Masadakiler();
            }
        });

        availableRehberler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                allRehbers newRehberlerFull = new allRehbers();
            }
        });

        masaEkle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MasaEkle masaEkle = new MasaEkle();
                System.out.println("sa");
                DraggableMaker desk = new DraggableMaker(LaunchPage.this, masaEkle.getNumara(), masaEkle.getIsim());

                frame.add(desk);
                desk.setLocation(800, 600);


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

    public void addDesk(int no, int x, int y, char name){
        DraggableMaker desk = new DraggableMaker(this, no, name);
        desk.setLocation(x,y);
        frame.add(desk);
    }


    public void buildPanel() {
        // First, remove all existing components
        sidePanel.removeAll();
        rehbers.sort(Comparator.comparing(Rehber::getName));
        arrayList.sort(Comparator.comparing(MasaInfo::getName));
        // Then, add a label for each item in the array list
        for (MasaInfo item : arrayList) {
            if (item != null){
                JLabel label = new JLabel(item.getName() + "  /  " + item.getDepart() + "  /  " + item.getDeskName() + "-" + item.getDeskNo());
                sidePanel.add(label);
            }
        }

        // This will refresh the panel and show the new labels
        sidePanel.revalidate();
        sidePanel.repaint();
    }




}
