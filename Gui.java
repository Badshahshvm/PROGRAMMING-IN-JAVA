import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    public static void main(String[] args) {
        JFrame jf=new JFrame();
        jf.setSize(600,400);
        jf.setDefaultCloseOperation(3);
        jf.getContentPane().setBackground(Color.CYAN); // set the color of background

        jf.setLayout(null);
        JLabel j1=new JLabel("Enter the Username"); //set the label
        j1.setBounds(120,50,200,30);
        jf.add(j1);
        JLabel j2=new JLabel(" Password");
        j2.setBounds(150,100,100,30);
        jf.add(j2);
        JTextField jt=new JTextField(); // set the text field
        jt.setBounds(250,100,200,30);
        jf.add(jt);



        JPasswordField jp=new JPasswordField(); // set the password field
        jp.setBounds(250,50,200,30);
        jf.add(jp);

        JButton jb=new JButton("Sign in");
        jb.setBounds(150,150,100,30);
        jf.add(jb);
        JButton jb2=new JButton("Cancel");
        jb2.setBounds(300,150,100,30);
        jf.add(jb2);
        jf.setVisible(true);

    }
}
