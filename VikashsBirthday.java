import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VikashsBirthday implements ActionListener {
    JFrame jf;
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,jb10,jb11,jb12,jb13,jb14,jb15,jb16,jb17,jb18,jb19,jb20,jb21,jb22,jb23,jb24,jb25,jb26,jb27,jb28,
    jb29,jb30,jb31,jb32,jb33,jb34,jb35,jb36,jb37,jb38,jb39,jb40,jb41,jb42,jb43,jb44,jb45,jb46,jb47,jb48;
    Color c;
    VikashsBirthday() {
        try
       {
           // UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");//for attractive look...of game..
       }
       catch(Exception e)

        {
            System.out.println(e);
        }
        jf = new JFrame("TicToe Game by Shivam");
        jf.setSize(100000, 5000);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout gd = new GridLayout(4, 12);

        jf.setLayout(gd);
        jb1 = new JButton();
        jb1.addActionListener(this);// This is used to performed action on each button..
        jf.add(jb1);
        jb2 = new JButton();
        jb2.addActionListener(this);
        jf.add(jb2);
        jb3 = new JButton();
        jb3.addActionListener(this);
        jf.add(jb3);
        jb4 = new JButton();
        jb4.addActionListener(this);
        jf.add(jb4);
        jb5 = new JButton();
        jb5.addActionListener(this);
        jf.add(jb5);
        jb6 = new JButton();
        jb6.addActionListener(this);
        jf.add(jb6);
        jb7 = new JButton();
        jb7.addActionListener(this);
        jf.add(jb7);
        jb8 = new JButton();
        jb8.addActionListener(this);
        jf.add(jb8);
        jb9 = new JButton();
        jb9.addActionListener(this);
        jf.add(jb9);
        jb10 = new JButton();
        jb10.addActionListener(this);
        jf.add(jb10);
        jb11 = new JButton();
        jb11.addActionListener(this);
        jf.add(jb11);
        jb12 = new JButton();
        jb12.addActionListener(this);
        jf.add(jb12);
        jb13 = new JButton();
        jb13.addActionListener(this);
        jf.add(jb13);
        jb14= new JButton();
        jb14.addActionListener(this);
        jf.add(jb14);
        jb15 = new JButton();
        jb15.addActionListener(this);
        jf.add(jb15);
        jb16= new JButton();
        jb16.addActionListener(this);
        jf.add(jb16);
        jb17 = new JButton();
        jb17.addActionListener(this);
        jf.add(jb17);
        jb18 = new JButton();
        jb18.addActionListener(this);
        jf.add(jb18);
        jb19 = new JButton();
        jb19.addActionListener(this);
        jf.add(jb19);
        jb20 = new JButton();
        jb20.addActionListener(this);
        jf.add(jb20);
        jb21 = new JButton();
        jb21.addActionListener(this);
        jf.add(jb20);
        jb21 = new JButton();
        jb21.addActionListener(this);
        jf.add(jb21);
        jb22 = new JButton();
        jb22.addActionListener(this);
        jf.add(jb22);
        jb23 = new JButton();
        jb23.addActionListener(this);
        jf.add(jb23);
        jb24 = new JButton();
        jb24.addActionListener(this);
        jf.add(jb24);
        jb25 = new JButton();
        jb25.addActionListener(this);
        jf.add(jb25);
        jb26 = new JButton();
        jb26.addActionListener(this);
        jf.add(jb26);
        jb27 = new JButton();
        jb27.addActionListener(this);
        jf.add(jb27);
        jb28 = new JButton();
        jb28.addActionListener(this);
        jf.add(jb28);
        jb29 = new JButton();
        jb29.addActionListener(this);
        jf.add(jb29);
        jb30 = new JButton();
        jb30.addActionListener(this);
        jf.add(jb30);
        jb31 = new JButton();
        jb31.addActionListener(this);
        jf.add(jb31);
        jb32 = new JButton();
        jb32.addActionListener(this);
        jf.add(jb32);
         jb33 = new JButton();
        jb33.addActionListener(this);
        jf.add(jb33);
        jb34 = new JButton();
        jb34.addActionListener(this);
        jf.add(jb34);
        jb35 = new JButton();
        jb35.addActionListener(this);
        jf.add(jb35);
        jb36 = new JButton();
        jb36.addActionListener(this);
        jf.add(jb36);
        jb37 = new JButton();
        jb37.addActionListener(this);
        jf.add(jb37);
        jb38= new JButton();
        jb38.addActionListener(this);
        jf.add(jb38);
        jb39 = new JButton();
        jb39.addActionListener(this);
        jf.add(jb39);
        jb40 = new JButton();
        jb40.addActionListener(this);
        jf.add(jb40);
        jb41= new JButton();
        jb41.addActionListener(this);
        jf.add(jb41);
        jb42 = new JButton();
        jb42.addActionListener(this);
        jf.add(jb42);
        jb43 = new JButton();
        jb43.addActionListener(this);
        jf.add(jb43);
        jb44 = new JButton();
        jb44.addActionListener(this);
        jf.add(jb44);
        jb45 = new JButton();
        jb45.addActionListener(this);
        jf.add(jb45);
        jb46 = new JButton();
        jb46.addActionListener(this);
        jf.add(jb46);
        jb47 = new JButton();
        jb47.addActionListener(this);
        jf.add(jb47);
        jb48 = new JButton();
        jb48.addActionListener(this);
        jf.add(jb48);
        jf.setVisible(true);
    }
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==jb1)
            {
                c=Color.blue;
                jb1.setBackground(c);
                jb1.setText(".H.");
                Font f=new Font("Arial",1,60); // font class (attributes);
                jb1.setFont(f); //set font size:
                jb1.setEnabled(false);// second time click on same button does not change their string value:(we cant use again any button)
            }
            if(e.getSource()==jb2)
            {
                c=Color.YELLOW;
                jb2.setBackground(c);
                jb2.setText(".A.");
                Font f=new Font("Arial",1,60); // font class (attributes);
                jb2.setFont(f); //set font size:
                jb2.setEnabled(false);// second time click on same button does not change their string value:(we cant use again any button)
            }
            if(e.getSource()==jb3)
            {
                c=Color.ORANGE;
                jb3.setBackground(c);
                jb3.setText(".P.");
                Font f=new Font("Arial",1,60); // font class (attributes);
                jb3.setFont(f); //set font size:
                jb3.setEnabled(false);// second time click on same button does not change their string value:(we cant use again any button)
            }
            if(e.getSource()==jb4)
            {
                c=Color.RED;
                jb4.setBackground(c);
                jb4.setText(".P.");
                Font f=new Font("Arial",1,60); // font class (attributes);
                jb4.setFont(f); //set font size:
                jb4.setEnabled(false);// second time click on same button does not change their string value:(we cant use again any button)
            }
            if(e.getSource()==jb5)
            {
                c=Color.BLACK;
                jb5.setBackground(c);
                jb5.setText(".Y.");
                Font f=new Font("Arial",1,60); // font class (attributes);
                jb5.setFont(f); //set font size:
                jb5.setEnabled(false);// second time click on same button does not change their string value:(we cant use again any button)
            }

            if(e.getSource()==jb15)
            {
                c=Color.PINK;
                jb15.setBackground(c);
                jb15.setText(".B.");
                Font f=new Font("Arial",1,60); // font class (attributes);
                jb15.setFont(f); //set font size:
                jb15.setEnabled(false);// second time click on same button does not change their string value:(we cant use again any button)
            }
            if(e.getSource()==jb16)
            {
                c=Color.lightGray;
                jb16.setBackground(c);
                jb16.setText(".I.");
                Font f=new Font("Arial",1,60); // font class (attributes);
                jb16.setFont(f); //set font size:
                jb16.setEnabled(false);// second time click on same button does not change their string value:(we cant use again any button)
            }
            if(e.getSource()==jb17)
            {
                c=Color.DARK_GRAY;
                jb17.setBackground(c);
                jb17.setText(".R.");
                Font f=new Font("Arial",1,60);
                jb17.setFont(f);
                jb17.setEnabled(false);
            }
            if(e.getSource()==jb18)
            {
                c=Color.ORANGE;
                jb18.setBackground(c);
                jb18.setText(".T.");
                Font f=new Font("Arial",1,60); // font class (attributes);
                jb18.setFont(f); //set font size:
                jb18.setEnabled(false);// second time click on same button does not change their string value:(we cant use again any button)
            }
            if(e.getSource()==jb19)
            {
                c=Color.BLUE;
                jb19.setBackground(c);
                jb19.setText(".H.");
                Font f=new Font("Arial",1,60); // font class (attributes);
                jb19.setFont(f); //set font size:
                jb19.setEnabled(false);// second time click on same button does not change their string value:(we cant use again any button)
            }
            if(e.getSource()==jb20)
            {
                c=Color.RED;
                jb20.setBackground(c);
                jb20.setText("...");
                Font f=new Font("Arial",1,60); // font class (attributes);
                jb20.setFont(f); //set font size:
                jb20.setEnabled(false);// second time click on same button does not change their string value:(we cant use again any button)
            }
            if(e.getSource()==jb21)
            {
                c=Color.BLACK;
                jb21.setBackground(c);
                jb21.setText(".D.");
                Font f=new Font("Arial",1,60); // font class (attributes);
                jb21.setFont(f); //set font size:
                jb21.setEnabled(false);// second time click on same button does not change their string value:(we cant use again any button)
            }
            if(e.getSource()==jb22)
            {
                c=Color.PINK;
                jb22.setBackground(c);
                jb22.setText(".A.");
                Font f=new Font("Arial",1,60); // font class (attributes);
                jb22.setFont(f); //set font size:
                jb22.setEnabled(false);// second time click on same button does not change their string value:(we cant use again any button)
            }
            if(e.getSource()==jb23)
            {
                c=Color.GREEN;
                jb23.setBackground(c);
                jb23.setText(".y.");
                Font f=new Font("Arial",1,60); // font class (attributes);
                jb23.setFont(f); //set font size:
                jb23.setEnabled(false);// second time click on same button does not change their string value:(we cant use again any button)
            }
            if(e.getSource()==jb31)
            {
                c=Color.RED;
                jb31.setBackground(c);
                jb31.setText(".T.");
                Font f=new Font("Arial",1,60); // font class (attributes);
                jb31.setFont(f); //set font size:
                jb31.setEnabled(false);// second time click on same button does not change their string value:(we cant use again any button)
            }
            if(e.getSource()==jb32)
            {
                c=Color.BLUE;
                jb32.setBackground(c);
                jb32.setText(".O.");
                Font f=new Font("Arial",1,60); // font class (attributes);
                jb32.setFont(f); //set font size:
                jb32.setEnabled(false);// second time click on same button does not change their string value:(we cant use again any button)
            }
            if(e.getSource()==jb44)
            {
                c=Color.PINK;
                jb44.setBackground(c);
                jb44.setText(".Y.");
                Font f=new Font("Arial",1,60); // font class (attributes);
                jb44.setFont(f); //set font size:
                jb44.setEnabled(false);// second time click on same button does not change their string value:(we cant use again any button)
            }
            if(e.getSource()==jb45)
            {

                c=Color.YELLOW;
                jb45.setBackground(c);
                jb45.setText(".O.");
                Font f=new Font("Arial",1,60); // font class (attributes);
                jb45.setFont(f); //set font size:
                jb45.setEnabled(false);// second time click on same button does not change their string value:(we cant use again any button)
            }
            if(e.getSource()==jb46)
            {
                c=Color.PINK;
                jb46.setBackground(c);
                jb46.setText(".U.");
                Font f=new Font("Arial",1,60); // font class (attributes);
                jb46.setFont(f); //set font size:
                jb46.setEnabled(false);// second time click on same button does not change their string value:(we cant use again any button)
            }


        }
        public static void main(String[] args)
    {
                VikashsBirthday b1=new VikashsBirthday();
    }


}
