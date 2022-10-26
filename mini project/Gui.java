import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class Gui {
    public static void main(String[] args){
        JFrame frame  = new JFrame();
        JPanel panel = new JPanel();
        JButton btn  = new JButton("Noodle");
        frame.setSize(800,600);
        frame.setLayout(new GridLayout(0,1));

        panel.add(btn);


        frame.add(panel);
        frame.setVisible(true);

    }
    

}
