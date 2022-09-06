
package staff_acadmay;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class doctor_screen extends JFrame{
   JTabbedPane tab;
   insert ob1;
   degree ob2;
   print_degree ob4;
   update_student ob3;
   public void show_doctor_screen(){
        ob1=new insert();
        ob2=new degree();
        ob3=new update_student();
        ob4=new print_degree();
        this.setTitle("Doctor User");
        this.setSize(500,350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(250,250);
        this.setVisible(true);
        this.setResizable(false);
        tab=new JTabbedPane();
        tab.addTab("Student",ob1);
        tab.addTab("Degree",ob2);
        tab.addTab("Update Student",ob3);
        tab.addTab("Print Degree",ob4);
        
        this.add(tab);
        
        
} 
}
