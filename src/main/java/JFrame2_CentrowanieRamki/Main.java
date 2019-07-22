package JFrame2_CentrowanieRamki;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{

    public Main(){

        this.setTitle("Application");

        int szer = Toolkit.getDefaultToolkit().getScreenSize().width;
        int wys = Toolkit.getDefaultToolkit().getScreenSize().height;

        this.setSize(szer/2, wys/3);

        //this.setLocation(szer/4, wys/4);
        int szerRamki = this.getSize().width;
        int wysRamki = this.getSize().height;
        this.setLocation(szer=szerRamki/2, wys = wysRamki/2);

        this.setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {

        new Main().setVisible(true);

    }
}
