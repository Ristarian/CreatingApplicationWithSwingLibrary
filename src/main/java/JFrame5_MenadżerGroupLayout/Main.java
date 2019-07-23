package JFrame5_MenadżerGroupLayout;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main (){

        this.setBounds(300, 400, 400, 200);

        initComponents();

        this.setDefaultCloseOperation(3);

    }


    public void initComponents(){

        GroupLayout layout = new GroupLayout(getContentPane());

        this.getContentPane().setLayout(layout);

        //metody dodajace odstępy między przyciskami
        layout.setAutoCreateContainerGaps(true);
        layout.setAutoCreateContainerGaps(true);

        //poziome ustawienie przycisków
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(
                layout.createParallelGroup()
                        .addComponent(button2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        )
                        .addComponent(button3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(10, Short.MAX_VALUE)
                        .addComponent(anuluj)
                        );

        //poziome ustawienie przycisków
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup()
                        .addComponent(button1)
                        .addComponent(button2)
                        .addComponent(button3)
                        )
                        .addContainerGap(10, Short.MAX_VALUE)
                        .addComponent(button4)
                        .addComponent(anuluj)
                        );

        pack();
    }

    JButton button1 = new JButton("Button #1");
    JButton button2 = new JButton("Button #2");
    JButton button3 = new JButton("Button #3");
    JButton button4 = new JButton("Button #4");
    JButton anuluj = new JButton("Anuluj");

    public static void main(String[] args) {

        new Main().setVisible(true);

    }
}
