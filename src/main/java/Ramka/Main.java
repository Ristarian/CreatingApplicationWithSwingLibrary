package Ramka;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{

    public Main (){

        /*
        JFrame frame = new JFrame();

        //Nadaje tytuł ramce
        frame.setTitle("Aplikacja");

        //Określa rozmiar ramki:
        frame.setSize(new Dimension(500, 100));
        *//*
        Alternatywa:
        frame.setSize(500, 100);
        *//*

        //Określa lokalizację ramki (wartości dodatnie na osi 'y' idę w dół)
        //frame.setLocation(100, 50);

        //Określa granice naszej ramki
        frame.setBounds(100, 50, 100, 100);

        //Ustawia to, że ramka nie może być powiekszona
        frame.setResizable(true);

        //Ustawianie ikonki
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("github.jpg"));

        //Pozwala zamykać ramkę przy pomocy 'X'
        frame.setDefaultCloseOperation(3);
        *//*
        Alternatywy:
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        *//*

        frame.setVisible(true);
        */

        super("Aplikacja");

        this.setBounds(200, 50, 500, 200);
        this.setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {

        new Main().setVisible(true);
    }
}
