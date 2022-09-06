
package staff_acadmay;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;

public class first_screen extends JFrame implements ActionListener{
    image ob1=new image();
    /*public first_screen(){
        show_image();
    }*/
    public JButton signin,signup;
    public JTextField user;
    public JPasswordField pass;
    public JLabel user_name,password;
    
    public void show_image(){
        //insitlize for label.........
        user_name=new JLabel("User Name : ");
        password=new JLabel("Password : ");
        user_name.setBounds(100, 70, 80, 25);
        password.setBounds(100, 120, 80, 25);
        user_name.setForeground(Color.WHITE);
        password.setForeground(Color.WHITE);
        ob1.add(user_name); ob1.add(password);
        
        //insitlize for TextField........
        
        user=new JTextField();
        pass=new JPasswordField();
        user.setBounds(200, 70, 150, 20);
        pass.setBounds(200, 120, 150, 20);
        ob1.add(user); ob1.add(pass);
        
         //insitlize for Button........
         
         signin=new JButton("Sign In");
         signup=new JButton("Sign Up");
         signin.setBounds(130,200,80,25);
         signup.setBounds(250,200,80,25);
         signin.setBackground(Color.orange);
         signup.setBackground(Color.orange);
         signin.setForeground(Color.BLACK);
         signup.setForeground(Color.BLACK);
         ob1.add(signin); ob1.add(signup);
         signin.addActionListener(this);
         signup.addActionListener(this);
         //insitlize for frame........
        this.setTitle("Staff Acadmay");
        this.setSize(450,350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(250,250);
        this.setVisible(true);
        this.setResizable(false);
        this.add(ob1);
        
    
}
    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource()==signin) {
         int ch;
         ch=new user_database().check_data(user.getText(), pass.getText());
         switch (ch) {
             case 1:
                 JOptionPane.showMessageDialog(null, "Hello Doctor "+user.getText(), "User", JOptionPane.INFORMATION_MESSAGE);
                 this.dispose();
                 new doctor_screen().show_doctor_screen();
                 break;
             case 2:
                 JOptionPane.showMessageDialog(null, "Password Not Correct", "Error Password", JOptionPane.WARNING_MESSAGE);
                 break;
             default:
                 JOptionPane.showMessageDialog(null, "User Not Found", "Error Enter", JOptionPane.WARNING_MESSAGE);
                 break;
         }
     }  
     if(e.getSource()==signup){
         this.dispose();
         new signup_screen().show_signup_screen();
     }
    }
    
}
