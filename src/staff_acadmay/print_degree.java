
package staff_acadmay;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class print_degree extends JPanel implements ActionListener{

    JTable table;
    JButton print; 
    String [] []data;
    ArrayList<students> arrlist;
    JScrollPane sc;
    String []header={"ID","First_Name","Last_Name","Degree"}; 
    
    public print_degree(){
       this.setLayout(null);
       //this.setBackground(Color.black);
        show_final_table();
    }
    public void show_final_table(){
      arrlist=new students_data().get_data_students_degree();
      data=new String[arrlist.size()][4];
      
      for(int i=0;i<arrlist.size();i++){
          data[i][0]=arrlist.get(i).getId();
          data[i][1]=arrlist.get(i).getFirst_name();
          data[i][2]=arrlist.get(i).getLast_name();
          data[i][3]=arrlist.get(i).getAddress();
          
      }
       table =new JTable(data,header);
       sc=new JScrollPane(table);
       sc.setBounds(0, 30, 500, 320);
       this.add(sc);
        print=new JButton("Print Degree");
         print.setBounds(190,0,120,25);
         print.setBackground(Color.orange);
         print.setForeground(Color.BLACK);
         this.add(print); 
         print.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==print){
           MessageFormat h=new MessageFormat("Student Degree"); 
           MessageFormat f=new MessageFormat("Page {1}"); 
           try {
               table.print(JTable.PrintMode.NORMAL,h,f);
           }
           catch (PrinterException ae) {
               System.out.println(ae.getMessage());
           }
        }
    }
    }
    


