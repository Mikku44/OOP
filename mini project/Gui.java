import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {
    protected static Color primaryColor = new Color(255, 240, 240);
    protected static Color secondaryColor = new Color(255, 200, 100);
    protected static Noodle n = new Noodle();
    protected static Receipt r = new Receipt();
    protected static JTextField amountTF = new JTextField(10);
    protected static int total = 0;
    protected static JButton Nbtn1 = new JButton("Yellow Noodles");
    protected static JButton Nbtn2 = new JButton("Rice Vermicelli");
    protected static JButton Nbtn3 = new JButton("Instant Noodles");
    protected static JButton Sbtn1 = new JButton("Tomyam soup");
    protected static JButton Sbtn2 = new JButton("Paloo soup");
    protected static JButton Cbtn1 = new JButton("Yes");
    protected static JButton Cbtn2 = new JButton("No");
    protected static JButton Mbtn1 = new JButton("Chicken");
    protected static JButton Mbtn2 = new JButton("Meat");
    protected static JButton Mbtn3 = new JButton("Fish meatball");
    protected static JButton Mbtn4 = new JButton("None");
    protected static JButton Pbtn = new JButton("25");
    protected static JButton Pbtn1 = new JButton("30");
    protected static JButton oBtn = new JButton("Continue");
    protected static JButton ClearBtn = new JButton("New Menu");

    public static void main(String[] args) {
        JFrame frame = new JFrame("Noodle NOOB");
        JPanel panel = new JPanel();
        JPanel panelCenter = new JPanel();
        JPanel panelCenter1 = new JPanel();
        JPanel panelCenter2 = new JPanel();
        JPanel panelCenter3 = new JPanel();
        JPanel panelCenter4 = new JPanel();
        JPanel panelButtom = new JPanel();
        JPanel panelLeft = new JPanel();
        JPanel panelRight = new JPanel();
        JPanel emptyPanel = new JPanel();
        JLabel title = new JLabel("NOODLE NOOB");
        JLabel description = new JLabel("Noodles :");
        JLabel Cdescription = new JLabel("Do you want cathchop :");
        JLabel Sdescription = new JLabel("Soup :");
        JLabel Mdescription = new JLabel("Meat :");
        JLabel Adescription = new JLabel("Amount :");
        JLabel Pdescription = new JLabel("Price :");

        // ?Noodles

        Nbtn1.setBackground(primaryColor);
        Nbtn2.setBackground(primaryColor);
        Nbtn3.setBackground(primaryColor);
        Nbtn1.addActionListener(NoodlesBtn);
        Nbtn2.addActionListener(NoodlesBtn);
        Nbtn3.addActionListener(NoodlesBtn);

        // ?cathchup

        Cbtn1.setBackground(primaryColor);
        Cbtn2.setBackground(primaryColor);
        Cbtn1.addActionListener(CathchupBtn);
        Cbtn2.addActionListener(CathchupBtn);

        // ?Soup

        Sbtn1.setBackground(primaryColor);
        Sbtn2.setBackground(primaryColor);
        Sbtn1.addActionListener(SoupBtn);
        Sbtn2.addActionListener(SoupBtn);

        // ?Meat

        Mbtn1.setBackground(primaryColor);
        Mbtn2.setBackground(primaryColor);
        Mbtn3.setBackground(primaryColor);
        Mbtn4.setBackground(primaryColor);
        Mbtn1.addActionListener(TypeBtn);
        Mbtn2.addActionListener(TypeBtn);
        Mbtn3.addActionListener(TypeBtn);
        Mbtn4.addActionListener(TypeBtn);

        // ? Price

        Pbtn.setBackground(primaryColor);
        Pbtn1.setBackground(primaryColor);
        Pbtn.addActionListener(Pricebtn);
        Pbtn1.addActionListener(Pricebtn);

        // ?Option

        oBtn.setBackground(primaryColor);
        oBtn.addActionListener(orderMenu);

        ClearBtn.setBackground(primaryColor);
        ClearBtn.addActionListener(clearAll);

        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("icon.png"));
        // frame.setLayout(new GridLayout(0,1));

        panel.setBackground(Color.white);
        panel.add(title);
        title.setIcon(new ImageIcon("icon.png"));
        title.setFont(new Font("Arial", Font.BOLD, 24));

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
        panelCenter2.add(Sbtn2);

        panelCenter3.setBackground(Color.white);
        // panelCenter3.setLayout(new GridLayout());
        panelCenter3.add(Mdescription);
        panelCenter3.add(Mbtn1);
        panelCenter3.add(Mbtn2);
        panelCenter3.add(Mbtn3);
        panelCenter3.add(Mbtn4);

        panelCenter4.setBackground(Color.white);
        panelCenter4.add(Adescription);
        panelCenter4.add(amountTF);
        panelCenter4.add(Pdescription);
        panelCenter4.add(Pbtn);
        panelCenter4.add(Pbtn1);

        emptyPanel.setBackground(Color.white);

        panelLeft.setLayout(new GridLayout(0, 1));
        panelLeft.add(panelCenter);
        panelLeft.add(panelCenter3);
        panelLeft.add(emptyPanel);

        panelRight.setLayout(new GridLayout(0, 1));
        panelRight.add(panelCenter2);
        panelRight.add(panelCenter1);
        panelRight.add(panelCenter4);

        panelButtom.setBackground(Color.white);
        panelButtom.add(oBtn);
        panelButtom.add(ClearBtn);

        frame.setSize(800, 600);
        frame.add(panel, BorderLayout.NORTH);
        // frame.add(panelCenter,BorderLayout.EAST);
        // frame.add(panelCenter1,BorderLayout.WEST);
        // frame.add(panelCenter2,BorderLayout.EAST);
        // frame.add(panelCenter3,BorderLayout.WEST);
        // frame.add(panelCenter4,BorderLayout.EAST);
        frame.add(panelRight, BorderLayout.CENTER);
        frame.add(panelLeft, BorderLayout.WEST);
        frame.add(panelButtom, BorderLayout.SOUTH);

        frame.setVisible(true);

    }

    static ActionListener x = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JButton Source = (JButton) e.getSource();
            // JOptionPane.showMessageDialog(null,Source.getText());

            Source.setBackground(secondaryColor);
        }
    };

    static ActionListener NoodlesBtn = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JButton Source = (JButton) e.getSource();
            // JOptionPane.showMessageDialog(null,Source.getText());

            n.setNoodle(Source.getText());
            Source.setBackground(secondaryColor);
        }
    };

    static ActionListener SoupBtn = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JButton Source = (JButton) e.getSource();
            // JOptionPane.showMessageDialog(null,Source.getText());

            n.setSoup(Source.getText());
            Source.setBackground(secondaryColor);
        }
    };

    static ActionListener TypeBtn = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JButton Source = (JButton) e.getSource();
            // JOptionPane.showMessageDialog(null,Source.getText());

            n.setTypeOfMeat(Source.getText());
            Source.setBackground(secondaryColor);
        }
    };

    static ActionListener CathchupBtn = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JButton Source = (JButton) e.getSource();
            // JOptionPane.showMessageDialog(null,Source.getText());
            if ((Source.getText()).equals("Yes")) {
                n.setCathchup(true);
            } else {
                n.setCathchup(false);
            }

            Source.setBackground(secondaryColor);
        }
    };

    static ActionListener Pricebtn = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JButton Source = (JButton) e.getSource();
            // JOptionPane.showMessageDialog(null,Source.getText());
            n.setPrice(Integer.parseInt(Source.getText()));
            Source.setBackground(secondaryColor);

        }
    };

    static ActionListener clearAll = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            Nbtn1.setBackground(primaryColor);
            Nbtn2.setBackground(primaryColor);
            Nbtn3.setBackground(primaryColor);
            Sbtn1.setBackground(primaryColor);
            Sbtn2.setBackground(primaryColor);
            Cbtn1.setBackground(primaryColor);
            Cbtn2.setBackground(primaryColor);
            Mbtn1.setBackground(primaryColor);
            Mbtn2.setBackground(primaryColor);
            Mbtn3.setBackground(primaryColor);
            Mbtn4.setBackground(primaryColor);
            Pbtn.setBackground(primaryColor);
            Pbtn1.setBackground(primaryColor);
            oBtn.setBackground(primaryColor);
            

        }
    };

    static ActionListener orderMenu = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            try { // JButton Source =(JButton) e.getSource();
                n.setAmount(Integer.parseInt(amountTF.getText()));

                // ? Set info to Receipt
                r.setdateOrder();
                r.setuserName("test user");
                r.setorderMenu(new String[] { n.getNoodles(),
                        n.getSoup(),
                        n.getTypeOfMeat(),
                        Boolean.toString(n.getCathchup()),
                        Integer.toString(n.getAmount()),
                        Integer.toString(n.getPrice())
                });
                r.setamountMenu(n.getAmount());
                r.settotal(n.getPrice(), n.getAmount());

                System.out.println(r.getdateOrder());
                System.out.println(r.getuserName());
                System.out.println(r.getorderMenu()[0]);
                System.out.println(r.getamountMenu());
                System.out.println(r.gettotal());
                // JLabel order = new JLabel(n.getNoodles());
                // JLabel order1 = new JLabel(Boolean.toString(n.getCathchup()));
                // JLabel order2 = new JLabel(n.getTypeOfMeat());
                // JLabel order3 = new JLabel(Integer.toString(n.getPrice()));
                // JLabel order4 = new JLabel(n.getSoup());
                JFrame receipt = new JFrame();
                JTextArea bill = new JTextArea();
                JScrollPane scroll = new JScrollPane(bill);
                receipt.setTitle("Noodle Noob Order");
                receipt.setSize(350, 500);

                receipt.add(scroll);
                // header
                bill.setText("\t        Receipt for " + r.getuserName() + "\n");
                bill.append("         Receipt create at " + r.getdateOrder() + "\n");
                bill.append("    ---------------------------------------------------------------------------");
                int i = 0;
                total += 1;
                while (i < total) {
                    // bill.append("\nNoodles : " + n.getNoodles() + "\n");
                    // bill.append("\nSoup : " + n.getSoup() + "\n");
                    // bill.append("\nTypeOfMeat : " + n.getTypeOfMeat() + "\n");
                    // bill.append("\nCathchup : " + Boolean.toString(n.getCathchup()) + "\n");
                    // bill.append("\nAmount : " + n.getAmount() + "\n");
                    // bill.append("\nPrice : " + Integer.toString(n.getPrice()) + "฿\n\n");
                    String[] x = r.getorderMenu();
                    for (int j = 0; j < x.length; j += 1) {
                        bill.append("\n" + r.getorderMenu()[j]);

                    }
                    bill.append("\n");
                    i++;
                }
                bill.append("    ---------------------------------------------------------------------------\n");
                bill.append("Total number : " + r.getamountMenu() + "\t\tTotal price : " + r.gettotal() + "\n");
                receipt.setVisible(true);
            } catch (Exception er) {
                JOptionPane.showMessageDialog(null, "Please enter amount of noodle.");
            }
        }
    };

}
