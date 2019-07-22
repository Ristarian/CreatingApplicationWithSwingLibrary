package JFrame3_MenadżeryUkładówKomponentówOrazPrzyciski;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main (){
        super ("Układ graficzny (Layout)");
        this.setBounds(300, 200, 500, 500);

        initComponents();

        //Dostosowuje przyciski do wielkości układu graficznego
        this.pack();

        this.setDefaultCloseOperation(3);
    }

    public void initComponents(){

        centrum = new JButton("Centrum");
        gora = new JButton("Górny");
        dol = new JButton("Dolny");
        prawa = new JButton("Prawy");
        lewa = new JButton("Lewy");


        Container kontener = this.getContentPane();

        kontener.add(centrum, BorderLayout.CENTER);
        centrum.setSize(centrum.getPreferredSize());
        kontener.add(gora, BorderLayout.PAGE_START);
        kontener.add(dol, BorderLayout.PAGE_END);
        kontener.add(prawa, BorderLayout.LINE_END);
        kontener.add(lewa, BorderLayout.LINE_START);

        /*
        centrum.setLocation(100, 30);
        centrum.setSize(200, 50);
        kontener.setLayout(null);
        kontener.add(centrum);
        */
        // aby działało bez 'ręcznego' powiększania ramki
        // dodatkowo należy zakomentować this.pack()

    }

    JButton centrum;
    JButton gora;
    JButton dol;
    JButton prawa;
    JButton lewa;

    public static void main(String[] args) {

        new Main().setVisible(true);
    }
}
