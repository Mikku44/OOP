import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class Gui {
    protected static Color primaryColor = new Color(255,240,240);
    protected static Color secondaryColor = new Color(255,  200 , 100);

    public static void main(String[] args){
        JFrame frame  = new JFrame("Noodle NOOB");
        JPanel panel = new JPanel();
        JPanel panelCenter = new JPanel();
        JPanel panelCenter1 = new JPanel();
        JPanel panelCenter2 = new JPanel();
        JPanel panelCenter3 = new JPanel();
        JPanel panelCenter4 = new JPanel();
        JPanel panelButtom = new JPanel();
        JPanel panelLeft = new JPanel();
        JPanel panelRight = new JPanel();
        JLabel title  = new JLabel("NOODLE NOOB");
        JLabel description = new JLabel("Noodles :");
        JLabel Cdescription = new JLabel("Do you want cathchop :");
        JLabel Sdescription = new JLabel("Soup :");
        JLabel Mdescription = new JLabel("Meat :");
        JLabel Adescription = new JLabel("Amount :");
        JLabel Pdescription = new JLabel("Price :");

        JTextField amountTF = new JTextField(10);

        //?Noodles
        JButton Nbtn1 = new JButton("Yellow Noodles");
        JButton Nbtn2 = new JButton("Rice Vermicelli");
        JButton Nbtn3 = new JButton("Instant Noodles");
        Nbtn1.setBackground(primaryColor);
        Nbtn2.setBackground(primaryColor);
        Nbtn3.setBackground(primaryColor);
        
        //?cathchup
        JButton Cbtn1 = new JButton("Yes");
        JButton Cbtn2 = new JButton("No");
        Cbtn1.setBackground(primaryColor);
        Cbtn2.setBackground(primaryColor);
        
        //?Soup
        JButton Sbtn1 = new JButton("Tomyam soup");
        JButton Sbtn2 = new JButton("Paloo soup");
        Sbtn1.setBackground(primaryColor);
        Sbtn2.setBackground(primaryColor);
        
        //?Meat
        JButton Mbtn1 = new JButton("Chicken");
        JButton Mbtn2 = new JButton("Meat");
        JButton Mbtn3 = new JButton("Fish meatball");
        JButton Mbtn4 = new JButton("None");
        Mbtn1.setBackground(primaryColor);
        Mbtn2.setBackground(primaryColor);
        Mbtn3.setBackground(primaryColor);
        Mbtn4.setBackground(primaryColor);
        
        //? Price
        JButton Pbtn = new JButton("25 ฿");
        JButton Pbtn1 = new JButton("30 ฿");
        Pbtn.setBackground(primaryColor);
        Pbtn1.setBackground(primaryColor);
        
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("icon.png"));
        // frame.setLayout(new GridLayout(0,1));

        panel.setBackground(Color.white);
        panel.add(title);
        title.setIcon(new ImageIcon("icon.png"));
        title.setFont(new Font("Arial", Font.BOLD,24));

        panelCenter.setBackground(Color.white);
        panelCenter.add(description);
        panelCenter.add(Nbtn1);
        panelCenter.add(Nbtn2);
        panelCenter.add(Nbtn3);

        panelCenter1.setBackground(Color.white);
        // panelCenter1.setLayout(new GridLayout());
        panelCenter1.add(Cdescription);
        panelCenter1.add(Cbtn1);
        panelCenter1.add(Cbtn2);

        panelCenter2.setBackground(Color.white);
        // panelCenter2.setLayout(new GridLayout());
        panelCenter2.add(Sdescription);
        panelCenter2.add(Sbtn1);
        panelCenter2.add (Sbtn2);

        panelCenter3.setBackground(Color.white);
        // panelCenter3.setLayout(new GridLayout());
        panelCenter3.add(Mdescription);
        panelCenter3.add(Mbtn1);
        panelCenter3.add (Mbtn2);
        panelCenter3.add (Mbtn3);
        panelCenter3.add (Mbtn4);

        panelCenter4.setBackground(Color.white);
        panelCenter4.add(Adescription);
        panelCenter4.add(amountTF);
        panelCenter4.add(Pdescription);
        panelCenter4.add(Pbtn);
        panelCenter4.add(Pbtn1);

        panelLeft.setLayout(new GridLayout(0,1));
        panelLeft.add(panelCenter);
        panelLeft.add(panelCenter1);
        panelLeft.add(panelCenter2);
        panelLeft.add(panelCenter3);
        panelLeft.add(panelCenter4);


        panelButtom.setBackground(Color.white);

        frame.setSize(800,600);
        frame.add(panel,BorderLayout.NORTH);
        // frame.add(panelCenter,BorderLayout.EAST);
        // frame.add(panelCenter1,BorderLayout.WEST);
        // frame.add(panelCenter2,BorderLayout.EAST);
        // frame.add(panelCenter3,BorderLayout.WEST);
        // frame.add(panelCenter4,BorderLayout.EAST);
        frame.add(panelRight,BorderLayout.EAST);
        frame.add(panelLeft,BorderLayout.WEST);
        frame.add(panelButtom,BorderLayout.SOUTH);

        frame.setVisible(true);

    }
    

}
