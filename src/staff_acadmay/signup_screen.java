
package staff_acadmay;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class signup_screen extends JFrame implements ActionListener{
    
    public imgforsignup ob1=new imgforsignup();
    public JButton send,back;
    public JTextField user,depart;
    public JPasswordField pass;
    public JLabel user_name,password,department,note;
    public void show_signup_screen(){
        
        //insitlize for label.........
        
        user_name=new JLabel("User Name : ");
        password=new JLabel("Password : ");
        department=new JLabel("Department : ");
        note=new JLabel("....!\"Only CS,IT,IS\"!.... ");
        user_name.setBounds(80, 50, 80, 25);
        password.setBounds(80, 100, 80, 25);
        department.setBounds(80, 150, 80, 25);
        note.setBounds(185,175,150,20);
        user_name.setForeground(Color.WHITE);
        password.setForeground(Color.WHITE);
        department.setForeground(Color.WHITE);
        note.setForeground(Color.gray);
        ob1.add(user_name); ob1.add(password); ob1.add(department); ob1.add(note);
        
         //insitlize for TextField........
        
        user=new JTextField();
        depart=new JTextField();
        pass=new JPasswordField();
        user.setBounds(170, 53, 150, 20);
        pass.setBounds(170, 103, 150, 20);
        depart.setBounds(170, 153, 150, 20);
        ob1.add(user); ob1.add(pass); ob1.add(depart);
         //insitlize for Button........
         
         send=new JButton("Send");
         send.setBounds(200,210,80,25);
         send.setBackground(Color.orange);
         send.setForeground(Color.BLACK);
         ob1.add(send); 
         send.addActionListener(this);
         back=new JButton("Back To Sign In");
         back.setBounds(160,250,150,25);
         back.setBackground(Color.orange);
         back.setForeground(Color.BLACK);
         ob1.add(back); 
         back.addActionListener(this);
         
        //initilize for frame sign up.....
        this.setTitle("Sign Up For User");
        this.setSize(450,350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(250,250);
        this.setVisible(true);
        this.setResizable(false);
        this.add(ob1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==back){
            this.dispose();
            new first_screen().show_image();
        }
        if(e.getSource()==send){
            String title=depart.getText();
            if(title.equalsIgnoreCase("cs")||title.equalsIgnoreCase("it")||title.equalsIgnoreCase("is")){
                
            new user_database().insert_data(user.getText(), pass.getText(), depart.getText());
            JOptionPane.showMessageDialog(null, "Hello Doctor "+user.getText(), "New User", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            new first_screen().show_image();
            }
            else{
            JOptionPane.showMessageDialog(null, "This Department Is Not Exist", "Error Department", JOptionPane.WARNING_MESSAGE);
        }
        }
        
    }
}
