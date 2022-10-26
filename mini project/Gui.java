import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class Gui {
    public static void main(String[] args){
        JFrame frame  = new JFrame();
        JPanel panel = new JPanel();
        JLabel title  = new JLabel("NOODLE NOOB");
        panel.setBackground(Color.white);
        panel.add(title);
        title.setIcon(new ImageIcon("icon.png"));
        frame.setSize(800,600);
        frame.add(panel,BorderLayout.NORTH);

        frame.setVisible(true);

    }
    

}
