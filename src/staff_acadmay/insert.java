
package staff_acadmay;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.*;

public class insert extends JPanel implements ActionListener {
 JTextField fname,lname ,id,addr,depart;
 JLabel first_name,last_name,id_student,address,department;
 JButton send,reload;
 public insert(){
     this.setLayout(null);
     show_insert();
 }
public void show_insert(){
    //insitlize for label.........
        first_name=new JLabel("First Name: ");
        last_name=new JLabel("Last Name: ");
        id_student=new JLabel("ID : ");
        address=new JLabel("Address: ");
        department=new JLabel("Department: ");
        first_name.setBounds(80, 50, 80, 25);
        last_name.setBounds(80, 85, 80, 25);
        id_student.setBounds(80, 125, 80, 25);
        address.setBounds(80, 160, 80, 25);
        department.setBounds(80, 200, 80, 25);
        this.add(first_name); this.add(last_name); this.add(id_student); this.add(address); this.add(department);
        
        //insitlize for TextField........
        
        fname=new JTextField();
        lname=new JTextField();
        id=new JTextField();
        addr=new JTextField();
        depart=new JTextField();
        
        fname.setBounds(180, 53, 150, 20);
        lname.setBounds(180, 88, 150, 20);
        id.setBounds(180, 128, 150, 20);
        addr.setBounds(180, 163, 150, 20);
        depart.setBounds(180, 203, 150, 20);
        this.add(fname); this.add(lname); this.add(id); this.add(addr); this.add(depart);
        
         //insitlize for Button........
         
         send=new JButton("Send");
         send.setBounds(190,245,80,25);
         send.setBackground(Color.orange);
         send.setForeground(Color.BLACK);
         this.add(send); 
         send.addActionListener(this);
        /*reload=new JButton("Re");
         reload.setBounds(190,280,30,25);
         reload.setBackground(Color.orange);
         reload.setForeground(Color.BLACK);
         this.add(reload); 
         reload.addActionListener(this);*/
} 

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==send){
            new students_data().insert_data(id.getText(),fname.getText(), lname.getText(), addr.getText(), depart.getText());
            JOptionPane.showMessageDialog(null, "Insert Done", "Student", JOptionPane.INFORMATION_MESSAGE);
            new doctor_screen().show_doctor_screen();
            
        }
       
    }
}
