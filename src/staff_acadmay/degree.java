
package staff_acadmay;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class degree extends JPanel implements ActionListener,MouseListener{
    JTextField t1,t2,t3,t4,t5,t6;
    JLabel l1,l2,l3,l4,l5,l6;
    JButton send;
    JTable table;
    String [] []data;
    ArrayList<students> arrlist=new students_data().get_data_students();
    JScrollPane sc;
    String []header={"First_Name","Last_Name","ID"};
    int x; 
    
    public degree(){
        this.setLayout(null);
        this.setBackground(Color.yellow);
        show_table();
    }
    public void show_table(){
      data=new String[arrlist.size()][3];
      for(int i=0;i<arrlist.size();i++){
          data[i][0]=arrlist.get(i).getFirst_name();
          data[i][1]=arrlist.get(i).getLast_name();
          data[i][2]=arrlist.get(i).getId();
      }
       table =new JTable(data,header);
       sc=new JScrollPane(table);
       sc.setBounds(0, 0, 300, 300);
       this.add(sc); 
       //////////////////.....................
       ////////////////........................
       
       ///////////////Label....................
       l1=new JLabel("CS : ");
       l2=new JLabel("OR : ");
       l3=new JLabel("SE : ");
       l4=new JLabel("AI  :  ");
       l5=new JLabel("IS  :  ");
       l6=new JLabel("IM  :  ");
       l1.setBounds(310, 20,30 , 30);
       l2.setBounds(310, 55,30 , 30);
       l3.setBounds(310, 85,30 , 30);
       l4.setBounds(310, 115,30 , 30);
       l5.setBounds(310, 145,30 , 30);
       l6.setBounds(310, 175,30 , 30);
       this.add(l1); this.add(l2); this.add(l3); this.add(l4); this.add(l5); this.add(l6);
       //////////////TextField.................
       t1=new JTextField(); 
       t2=new JTextField(); 
       t3=new JTextField(); 
       t4=new JTextField(); 
       t5=new JTextField(); 
       t6=new JTextField(); 
       t1.setBounds(350,23,100,20);
       t2.setBounds(350,58,100,20);
       t3.setBounds(350,88,100,20);
       t4.setBounds(350,118,100,20);
       t5.setBounds(350,148,100,20);
       t6.setBounds(350,178,100,20);
       this.add(t1); this.add(t2); this.add(t3); this.add(t4); this.add(t5); this.add(t6);
       /////////////////////////
         send=new JButton("Add Degree");
         send.setBounds(340,250,120,25);
         send.setBackground(Color.orange);
         send.setForeground(Color.BLACK);
         this.add(send); 
         send.addActionListener(this);
         table.addMouseListener(this);
} 

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==send){
            String id=arrlist.get(x).getId();
            new degree_data().insert_data(Integer.parseInt(id),Integer.parseInt(t1.getText()), Integer.parseInt(t2.getText()), Integer.parseInt(t3.getText()), Integer.parseInt(t4.getText()), Integer.parseInt(t5.getText()), Integer.parseInt(t6.getText()));
            JOptionPane.showMessageDialog(null, "Insert Done", "Student", JOptionPane.INFORMATION_MESSAGE);
            new doctor_screen().show_doctor_screen();
        }
    }
    //*****************/
    

    @Override
    public void mouseClicked(MouseEvent me) {
         x=table.getSelectedRow();
       System.out.println("OK "+table.getSelectedRow());
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
         
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
         
    }

   
}
