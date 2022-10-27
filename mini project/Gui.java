import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class Gui {
    public static void main(String[] args){
        JFrame frame  = new JFrame("Noodle NOOB");
        JPanel panel = new JPanel();
        JPanel panelCenter = new JPanel();
        JPanel panelButtom = new JPanel();
        JLabel title  = new JLabel("NOODLE NOOB");

        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("icon.png"));

        panel.setBackground(Color.white);
        panel.add(title);
        title.setIcon(new ImageIcon("icon.png"));
        title.setFont(new Font("Arial", Font.BOLD,24));


        panelCenter.setBackground(Color.white);
        

        panelButtom.setBackground(Color.white);

        frame.setSize(800,600);
        frame.add(panel,BorderLayout.NORTH);
        frame.add(panelCenter,BorderLayout.CENTER);
        frame.add(panelButtom,BorderLayout.SOUTH);

        frame.setVisible(true);

    }
    

}
