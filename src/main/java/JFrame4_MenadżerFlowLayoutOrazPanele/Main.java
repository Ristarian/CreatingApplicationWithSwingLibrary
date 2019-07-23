package JFrame4_MenadżerFlowLayoutOrazPanele;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main(){

        this.setBounds(500, 500, 300, 300);

        initComponent();

        this.setDefaultCloseOperation(3);

    }

    public void initComponent(){

        button1.setPreferredSize(new Dimension(100, 100));
        button2.setPreferredSize(button2.getPreferredSize());

        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        this.getContentPane().add(panel,BorderLayout.PAGE_START);

    }

    JPanel panel = new JPanel(new FlowLayout(FlowLayout.TRAILING));

    JButton button1 = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");
    JButton button3 = new JButton("Button 3");
    JButton button4 = new JButton("Button 4");


    public static void main(String[] args) {

        new Main().setVisible(true);
    }
}
