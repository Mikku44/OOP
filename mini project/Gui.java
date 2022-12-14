import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Gui {
    protected static Color primaryColor = new Color(0xE4FBFF);
    protected static Color secondaryColor = new Color(0xB8B5FF);
    protected static Noodle n = new Noodle(); // การสร้าง object
    protected static Receipt r = new Receipt();
    protected static Payment p = new Payment();
    protected static JTextField amountTF = new JTextField(10);//? JTextField ช่องกรอกจำนวน
    protected static JTextField userTf = new JTextField(20);
    protected static JButton Nbtn1 = new JButton("Yellow Noodles"); //? JButton ปุ่มกดตามชื่อ
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
    protected static JButton userBtn = new JButton("New Order");
    protected static JFrame receipt = new JFrame();   //? JFrame หน้าต่างอันที่สอง
    protected static JFrame frame = new JFrame("Noodle NOOB"); // ? JFrame หน้าต่างอันที่แรก

    public static void main(String[] args) {

        JPanel panel = new JPanel();  //? JPanel คือส่วนในหน้าต่าง ส่วนบน

        JPanel panelCenter = new JPanel();
        JPanel panelCenter1 = new JPanel();
        JPanel panelCenter2 = new JPanel();
        JPanel panelCenter3 = new JPanel();
        JPanel panelCenter4 = new JPanel();

        JPanel panelButtom = new JPanel(); // ด้านล่าง

        JPanel panelLeft = new JPanel();
        JPanel panelRight = new JPanel();

        JPanel emptyPanel = new JPanel();

        JLabel title = new JLabel("NOODLE NOOB");  //? JLabel ข้อความ
        JLabel description = new JLabel("Noodles :");
        JLabel Cdescription = new JLabel("Do you want cathchop :");
        JLabel Sdescription = new JLabel("Soup :");
        JLabel Mdescription = new JLabel("Meat :");
        JLabel Adescription = new JLabel("Amount :");
        JLabel Pdescription = new JLabel("Price :");
        JLabel user = new JLabel("Customer Name :");

        // ?Noodles

        Nbtn1.setBackground(primaryColor); //? setBackground เป็นการกำหนดสี
        Nbtn2.setBackground(primaryColor);
        Nbtn3.setBackground(primaryColor);

        Nbtn1.addActionListener(NoodlesBtn); //? addActionListener กำหนดการนำทำเมื่อกดปุ่ม
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

        userBtn.setBackground(primaryColor);
        userBtn.addActionListener(clearAll);
        userBtn.addActionListener(clearAllValue);

        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("icon.png"));
        // frame.setLayout(new GridLayout(0,1));

        panel.setBackground(new Color(0xE4FBFF));
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
        emptyPanel.add(user);
        emptyPanel.add(userTf);

        panelLeft.setLayout(new GridLayout(0, 1));
        panelLeft.add(panelCenter);
        panelLeft.add(panelCenter3);
        panelLeft.add(emptyPanel);

        panelRight.setLayout(new GridLayout(0, 1));
        panelRight.add(panelCenter2);
        panelRight.add(panelCenter1);
        panelRight.add(panelCenter4);

        panelButtom.setBackground(new Color(0xE4FBFF));
        panelButtom.add(oBtn);
        panelButtom.add(userBtn);

        frame.setSize(800, 600);
        frame.add(panel, BorderLayout.NORTH);//? NORTH ด้านบน
        frame.add(panelRight, BorderLayout.CENTER); // ? CENTER กลาง
        frame.add(panelLeft, BorderLayout.WEST);// ? WEST ซ้าน
        frame.add(panelButtom, BorderLayout.SOUTH);// ? SOUTH ล่าง

        frame.setVisible(true);

    }

    // ? Button Event
    
    static ActionListener NoodlesBtn = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JButton Source = (JButton) e.getSource();
            n.setNoodle(Source.getText());
            Nbtn1.setBackground(primaryColor);
            Nbtn2.setBackground(primaryColor);
            Nbtn3.setBackground(primaryColor);
            Source.setBackground(secondaryColor);
        }
    };

    static ActionListener SoupBtn = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JButton Source = (JButton) e.getSource();
            n.setSoup(Source.getText());
            Sbtn1.setBackground(primaryColor);
            Sbtn2.setBackground(primaryColor);
            Source.setBackground(secondaryColor);
        }
    };

    static ActionListener TypeBtn = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JButton Source = (JButton) e.getSource();
            Mbtn1.setBackground(primaryColor);
            Mbtn2.setBackground(primaryColor);
            Mbtn3.setBackground(primaryColor);
            Mbtn4.setBackground(primaryColor);
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
            Cbtn1.setBackground(primaryColor);
            Cbtn2.setBackground(primaryColor);
            Source.setBackground(secondaryColor);
        }
    };

    static ActionListener Pricebtn = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JButton Source = (JButton) e.getSource();
            // JOptionPane.showMessageDialog(null,Source.getText());
            n.setPrice(Integer.parseInt(Source.getText()));
            Pbtn.setBackground(primaryColor);
            Pbtn1.setBackground(primaryColor);
            Source.setBackground(secondaryColor);

        }
    };

    static ActionListener clearAll = new ActionListener() {
        public void actionPerformed(ActionEvent e) {

            JOptionPane.showMessageDialog(null, "Create order success!!");
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

            userTf.setText("");
            amountTF.setText("");

        }
    };

    static ActionListener clearAllValue = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            r.clearOrder();
            receipt.dispose();
        }
    };

    static ActionListener orderMenu = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            try { // JButton Source =(JButton) e.getSource();
                receipt.dispose();
                receipt = new JFrame();
                JTextArea bill = new JTextArea();
                JScrollPane scroll = new JScrollPane(bill);
                JPanel paymentPanel = new JPanel();
                JLabel label = new JLabel("Payment page");
                JLabel label1 = new JLabel("Pay :");
                JLabel label2 = new JLabel("Change : ");
                JTextField Pay = new JTextField();
                JTextField Change = new JTextField();
                JButton pp = new JButton(new ImageIcon("pp.png"));
                JButton cash = new JButton(new ImageIcon("cash.png"));
                JButton pay = new JButton("Pay");
                n.setAmount(Integer.parseInt(amountTF.getText()));

                // ? Set info to Receipt
                r.setdateOrder();
                r.setuserName(userTf.getText());
                r.setorderMenu(new String[] { n.getNoodles(),
                        n.getSoup(),
                        n.getTypeOfMeat(),
                        Boolean.toString(n.getCathchup()),
                        Integer.toString(n.getAmount()),
                        Integer.toString(n.getPrice())
                });
                r.setamountMenu(n.getAmount());
                r.settotal(n.getPrice(), n.getAmount());

                receipt.setTitle("Noodle Noob Order");
                receipt.setSize(800, 500);

                // header
                bill.setText("\t        Receipt for " + r.getuserName() + "\n");
                bill.append("         Receipt create at " + r.getdateOrder() + "\n");
                bill.append("    ---------------------------------------------------------------------------");

                ArrayList<String> x = r.getorderMenu();

                for (int j = 0, total = 0; j < x.size(); j += 1) {
                    if (j % 6 == 0) {
                        total += 1;
                        bill.append("\n\n**Order " + (total) + "**\n");
                    }
                    bill.append("\n" + (r.getorderMenu()).get(j));
                }

                bill.append(" \n");
                bill.append("    ---------------------------------------------------------------------------\n");
                bill.append("Total number : " + r.getamountMenu() + "\t          Total price : " + r.gettotal() + "\n");

                label.setFont(new Font("Arial", Font.BOLD, 24));

                pp.setBackground(Color.decode("#EEEEEE"));
                pp.setBorder(null);
                pp.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JButton Source = (JButton) e.getSource();
                        Source.setBackground(secondaryColor);
                        cash.setBackground(Color.decode("#EEEEEE"));
                        p.setPayment("Promptpay");
                        label1.setBounds(-999, 300, 200, 24);
                        label2.setBounds(-999, 350, 200, 24);
                        Pay.setBounds(-999, 300, 200, 24);
                        Change.setBounds(-999, 350, 200, 24);
                    }
                });

                cash.setBackground(Color.decode("#EEEEEE"));
                cash.setBorder(null);
                cash.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JButton Source = (JButton) e.getSource();
                        Source.setBackground(secondaryColor);
                        pp.setBackground(Color.decode("#EEEEEE"));
                        p.setPayment("Cash");
                        label1.setBounds(180, 300, 200, 24);
                        label2.setBounds(180, 350, 200, 24);
                        Pay.setBounds(250, 300, 200, 24);
                        Change.setBounds(250, 350, 200, 24);
                    }
                });

                pay.setBackground(Color.decode("#EEEEEE"));
                pay.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if ((p.getPayment()).equals("Cash")) {
                            p.setPay(Integer.parseInt(Pay.getText()));
                            if (p.getPay() < r.gettotal()) {
                                JOptionPane.showMessageDialog(null, "Please pay more money than "+ r.gettotal()+" Baht");
                                return;
                            }
                            p.setchange(r.gettotal());
                            Change.setText(p.getchange() + " ฿");
                        } else {
                            JOptionPane.showMessageDialog(null, "Prompt Pay : 0622080994");
                        }

                    }
                });

                label.setBounds(150, 10, 200, 50);
                pp.setBounds(50, 50, 200, 200);
                cash.setBounds(250, 50, 200, 200);
                pay.setBounds(150, 400, 200, 24);

                paymentPanel.setLayout(null);
                paymentPanel.add(label);
                paymentPanel.add(pp);
                paymentPanel.add(pay);
                paymentPanel.add(cash);
                paymentPanel.add(label1);
                paymentPanel.add(label2);
                paymentPanel.add(Change);
                paymentPanel.add(Pay);

                receipt.add(scroll, BorderLayout.WEST);
                receipt.add(paymentPanel, BorderLayout.CENTER);
                receipt.setVisible(true);

            } catch (Exception er) {
                JOptionPane.showMessageDialog(null, "Please enter amount of noodle.");
            }

        }
    };

}
