package GAME;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserPanel implements ActionListener {
    JFrame jf;
    JTextField jt1,jt2;
    JButton jb,jb2;
    JLabel jl1,jl2;
    UserPanel()
    {
         jf=new JFrame();

        jf.setSize(600,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jl1=new JLabel("Enter player one");
        jl1.setBounds(50,50,120,30);
        jf.add(jl1);
        jt1=new JTextField();
        jt1.setBounds(200,50,250,40);
        jf.add(jt1);
        jl2=new JLabel("Enter player second");
        jl2.setBounds(50,100,120,30);
        jf.add(jl2);
        jt2=new JTextField();
        jt2.setBounds(200,100,250,40);
        jf.add(jt2);
        jb=new JButton("Start Game...");
        jb.addActionListener(this);
        jf.add(jb);
        jb2=new JButton("exit game");
        jb2.addActionListener(this);
        jf.add(jb2);
        jb2.setBounds(250,150,120,50);
        jb.setBounds(100,150,120,50);
        jf.getContentPane().setBackground(Color.CYAN);

        jf.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
if(e.getSource()==jb)
{
    String p1=jt1.getText();
    String p2=jt2.getText();
    TicTacToeGame2 t1= new TicTacToeGame2( p1,p2);

    t1.gameOpen();
    jf.setVisible(false);


}
if(e.getSource()==jb2)
{
    System.exit(0);
}
    }


    public static class TicTacToeGame2 implements ActionListener
    {
    JFrame jf;  //create a frame interface
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9; // create hai partition button in the interface....
    String s=""; // create a empty string....
    int count=0; // create a count variable to count the no of click after the clicking on the button interface...
    boolean win=false;
    Color color;
        String s1,s2;
        String t;
        TicTacToeGame2(String s1, String s2)

        {
            this.s1=s1;
            this.s2=s2;
            try
            {
             UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");//for attractive look...of game..//this is added for the purpose of looks attractive according to our windows...
            }
           catch(Exception e)

           {
               System.out.println(e);
        }
            jf= new JFrame();
            jf.setTitle(s1+" turns");
            jf.setSize(500,500); // set the size of interface
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            GridLayout gd= new GridLayout(3,3); //set the no of rows and columns which is present in interface...

             jf.setLayout(gd);
            jb1=new JButton();
            jb1.addActionListener(this);// This is used to performed action on each button interface..
             jf.add(jb1); //add button in frame interface
             jb2=new JButton();
            jb2.addActionListener(this);//perform the current action on button...
             jf.add(jb2);
             jb3=new JButton();
            jb3.addActionListener(this);
             jf.add(jb3);
             jb4=new JButton();
            jb4.addActionListener(this);
             jf.add(jb4);
            jb5=new JButton();
            jb5.addActionListener(this);
            jf.add(jb5);
            jb6=new JButton();
            jb6.addActionListener(this);
            jf.add(jb6);
            jb7=new JButton();
            jb7.addActionListener(this);
            jf.add(jb7);
            jb8=new JButton();
            jb8.addActionListener(this);
            jf.add(jb8);
            jb9=new JButton();
            jb9.addActionListener(this);
            jf.add(jb9);



            jf.setVisible(true); ///if tish is true..the interface is visible...otherwise frame is not visible..
        }
        public void actionPerformed(ActionEvent e) // this method instructs to perform event....
        {
            count++;
            System.out.println(count);
            if(count%2==0)
            {
                color=Color.red;//set the button color
                s="0";
                jf.setTitle(s1+" Turns");

            }
            else {
                color=Color.blue;//button color
                s="X";
                jf.setTitle(s2+" Turns");

            }

            if(e.getSource()==jb1) //when we bring cursor on button interface...
            {
                jb1.setBackground(color);
                jb1.setText(s);
                Font f=new Font("Arial",1,50); // font class (attributes);
                jb1.setFont(f); //set font size:
                jb1.setEnabled(false);// second time click on same button does not change their string value:(we cant use again any button)
            }
            if(e.getSource()==jb2)
            {
                jb2.setBackground(color);
                jb2.setText(s);
                Font f=new Font("Arial",1,50);
                jb2.setFont(f);

                jb2.setEnabled(false);
            }
            if(e.getSource()==jb3)
            {
                jb3.setBackground(color);
                jb3.setText(s);
                Font f=new Font("Arial",1,50);
                jb3.setFont(f);
                jb3.setEnabled(false);
            }
            if(e.getSource()==jb4)
            {
                jb4.setBackground(color);
                jb4.setText(s);
                Font f=new Font("Arial",1,50);
                jb4.setFont(f);
                jb4.setEnabled(false);
            }
            if(e.getSource()==jb5)
            {
                jb5.setBackground(color);
                jb5.setText(s);
                Font f=new Font("Arial",1,50);
                jb5.setFont(f);
                jb5.setEnabled(false);
            }
            if(e.getSource()==jb6)
            {
                jb6.setBackground(color);
                jb6.setText(s);
                Font f=new Font("Arial",1,50);
                jb6.setFont(f);
                jb6.setEnabled(false);
            }
            if(e.getSource()==jb7)
            {
                jb7.setBackground(color);
                jb7.setText(s);
                Font f=new Font("Arial",1,50);
                jb7.setFont(f);
                jb7.setEnabled(false);
            }
            if(e.getSource()==jb8)
            {
                jb8.setBackground(color);
                jb8.setText(s);
                Font f=new Font("Arial",1,50);
                jb8.setFont(f);
                jb8.setEnabled(false);
            }

            if(e.getSource()==jb9)
            {
                jb9.setBackground(color);
                jb9.setText(s);
                Font f=new Font("Arial",1,50);
                jb9.setFont(f);
                jb9.setEnabled(false);
            }
                    winningPossibilities();
            whoWins();
        }
        void gameOpen()
        {
            jf= new JFrame();
            jf.setTitle(this.s1 + " Turns");

            jf.setSize(500,500); // set the size of interface
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            GridLayout gd= new GridLayout(3,3); //set the no of rows and columns which is present in interface...

            jf.setLayout(gd);
            jb1=new JButton();
            jb1.addActionListener(this);// This is used to performed action on each button interface..
            jf.add(jb1); //add button in frame interface
            jb2=new JButton();
            jb2.addActionListener(this);//perform the current action on button...
            jf.add(jb2);
            jb3=new JButton();
            jb3.addActionListener(this);
            jf.add(jb3);
            jb4=new JButton();
            jb4.addActionListener(this);
            jf.add(jb4);
            jb5=new JButton();
            jb5.addActionListener(this);
            jf.add(jb5);
            jb6=new JButton();
            jb6.addActionListener(this);
            jf.add(jb6);
            jb7=new JButton();
            jb7.addActionListener(this);
            jf.add(jb7);
            jb8=new JButton();
            jb8.addActionListener(this);
            jf.add(jb8);
            jb9=new JButton();
            jb9.addActionListener(this);
            jf.add(jb9);




            jf.setVisible(true);

        }
       public  void winningPossibilities()
        {
            // Horizontal....winning possibilities
            if(jb1.getText()==jb2.getText() && jb2.getText()==jb3.getText()&&jb1.getText()==jb3.getText() && jb3.getText()!="")
            {
               // System.out.println( s + " win..");
                win=true;

                //JOptionPane.showMessageDialog(jf,s +" wins");
            }

            else if(jb4.getText()==jb5.getText() && jb5.getText()==jb6.getText() && jb6.getText()!="")
            {
               // System.out.println(s+ " win..");
                win=true;

                //JOptionPane.showMessageDialog(jf,s +" wins");
            }
            else if (jb7.getText()==jb8.getText() && jb8.getText()==jb9.getText() && jb9.getText()!="")
            {
               // System.out.println(s+ " win..");
                win=true;

               // JOptionPane.showMessageDialog(jf,s +" wins");

            }
            //Vertical winning possibilities....
            else if(jb1.getText()==jb4.getText() && jb4.getText()==jb7.getText() && jb7.getText()!="")
            {
                //System.out.println(s+ " win..");
                win=true;
               // JOptionPane.showMessageDialog(jf,s +" wins");
            }
            else if(jb2.getText()==jb5.getText() && jb5.getText()==jb8.getText() && jb8.getText()!="")
            {
               // System.out.println(s+ " win..");
                win=true;

               // JOptionPane.showMessageDialog(jf,s +" wins"); // show win or loose on the display
            }
            else if(jb3.getText()==jb6.getText() && jb6.getText()==jb9.getText() && jb9.getText()!="")
            {
               // System.out.println(s+ " win..");
                win=true;


                //JOptionPane.showMessageDialog(jf,s +" wins");
            }
            //Diagonal winning possibilities...
            else if(jb1.getText()==jb5.getText() && jb5.getText()==jb9.getText() && jb9.getText()!="")
            {
               // System.out.println(s+ " win");
                win=true;

                //JOptionPane.showMessageDialog(jf,s +" wins");
            }
            else if(jb3.getText()==jb5.getText() && jb5.getText()==jb7.getText() && jb7.getText()!="")
            {
               // System.out.println(s+ " win");
                win=true;

               // JOptionPane.showMessageDialog(jf,s +" wins");
            }
           else {
               win=false;
            }


        }
        public void whoWins()
        {

            if(win==true)
            {
                if(s.equals("X"))
                {
                    t=s2;
                }
                else {
                    t=s1;
                }

                JOptionPane.showMessageDialog(jf,t+"( "+ s +" )" +" wins");
                restartGame();
            }
            else if(win==false && count==9){
                if(s.equals("X"))
                {
                    t=s2;
                }
                else {
                    t=s1;
                }
                JOptionPane.showMessageDialog(jf,t+"("+s+ ")" +" Match draw.....");
                restartGame();
            }


        }
        public void restartGame()
        {
            int i=JOptionPane.showConfirmDialog(jf,"do you want to restart the game");
            System.out.println("i :"+i );
            if(i==0) {   //button again appear in fresh manner...

                jb1.setEnabled(true);
                jb2.setEnabled(true);
                jb3.setEnabled(true);
                jb4.setEnabled(true);
                jb5.setEnabled(true);
                jb6.setEnabled(true);
                jb7.setEnabled(true);
                jb8.setEnabled(true);
                jb9.setEnabled(true);
                //again set the string values as empty:-
                jb1.setText("");
                jb2.setText("");
                jb3.setText("");
                jb4.setText("");
                jb5.setText("");
                jb6.setText("");
                jb7.setText("");
                jb8.setText("");
                jb9.setText("");
                //Again set values of count as zero...(beacause of restart condition...)
                count = 0;
                s = "";
                win = false;
                //Reset The Background Color:-
                jb1.setBackground(null);
                jb2.setBackground(null);
                jb3.setBackground(null);
                jb4.setBackground(null);
                jb5.setBackground(null);
                jb6.setBackground(null);
                jb7.setBackground(null);
                jb8.setBackground(null);
                jb9.setBackground(null);

            }
                else if(i==1)
            {
                System.exit(0);
            }

      else {
                jb1.setEnabled(false);
                jb2.setEnabled(false);
                jb3.setEnabled(false);
                jb4.setEnabled(false);
                jb5.setEnabled(false);
                jb6.setEnabled(false);
                jb7.setEnabled(false);
                jb8.setEnabled(false);
                jb9.setEnabled(false);



            }
        }
        public static void main(String[] args)
        {

            TicTacToeGame2 t1=new TicTacToeGame2("","");



        }
    }
}
