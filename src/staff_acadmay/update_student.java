
package staff_acadmay;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class update_student extends JPanel implements ActionListener {
     JTextField fname,lname ,id,addr,depart;
 JLabel first_name,last_name,id_student,address,department;
 JButton send;
 public update_student(){
     this.setLayout(null);
     show_updates();
 }
public void show_updates(){
    //insitlize for label.........
        first_name=new JLabel("First Name: ");
        last_name=new JLabel("Last Name: ");
        id_student=new JLabel("ID : ");
        address=new JLabel("Address: ");
        department=new JLabel("Department: ");
        first_name.setBounds(80, 85, 80, 25);
        last_name.setBounds(80, 125, 80, 25);
        id_student.setBounds(80, 50, 80, 25);
        address.setBounds(80, 160, 80, 25);
        department.setBounds(80, 200, 80, 25);
        this.add(id_student); this.add(first_name); this.add(last_name); this.add(address); this.add(department);
        
        //insitlize for TextField........
        
        fname=new JTextField();
        lname=new JTextField();
        id=new JTextField();
        addr=new JTextField();
        depart=new JTextField();
        id.setBounds(180, 53, 150, 20);
        fname.setBounds(180, 88, 150, 20);
        lname.setBounds(180, 128, 150, 20);
       
        addr.setBounds(180, 163, 150, 20);
        depart.setBounds(180, 203, 150, 20);
        this.add(id); this.add(fname); this.add(lname);  this.add(addr); this.add(depart);
        
         //insitlize for Button........
         
         send=new JButton("Update");
         send.setBounds(190,245,80,25);
         send.setBackground(Color.orange);
         send.setForeground(Color.BLACK);
         this.add(send); 
         send.addActionListener(this);
} 

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==send){
            new students_data().update_data(id.getText(),fname.getText(), lname.getText(), addr.getText(), depart.getText());
            JOptionPane.showMessageDialog(null, "Update Done", "Student", JOptionPane.INFORMATION_MESSAGE);
            new doctor_screen().show_doctor_screen();
        }
    }
}
