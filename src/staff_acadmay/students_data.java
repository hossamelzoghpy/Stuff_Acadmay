
package staff_acadmay;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class students_data {
  public Connection con;
    public security sec=new security();
    public String query;
    public void insert_data(String id,String first_name,String last_name,String address,String department){
    try{
        con=sec.connect();
        query="insert into students values(?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1, id);
        ps.setString(2, first_name);
        ps.setString(3, last_name);
        ps.setString(4, address);
        ps.setString(5, department);
        ps.execute();
    }
    catch(SQLException e){
       System.out.println(e.getMessage());
    }
}
    
    public ArrayList <students> get_data_students(){
        ArrayList <students> list=new ArrayList<>();
         try{
        con=sec.connect();
        query="select * from students";
        PreparedStatement ps=con.prepareStatement(query);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            list.add(new students(rs.getString("id"),rs.getString("fname"),rs.getString("lname"),rs.getString("address"),rs.getString("department")));
        }
    }
    catch(SQLException e){
       System.out.println(e.getMessage());
    }
         return list;
    }  
    
    
    public ArrayList <students> get_data_students_degree(){
        ArrayList <students> list=new ArrayList<>();
         try{
        con=sec.connect();
        query="select * from students,degree where degree.id=students.id";
        PreparedStatement ps=con.prepareStatement(query);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            list.add(new students(rs.getString("id"),rs.getString("fname"),rs.getString("lname"),rs.getString("sum")+"",rs.getString("department")));
        }
    }
    catch(SQLException e){
       System.out.println(e.getMessage());
    }
         return list;
    }
    public void update_data(String id,String first_name,String last_name,String address,String department){
    try{
        con=sec.connect();
        query="update students set fname=?,lname=?,address=?,department=? where id=? ";
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1, first_name);
        ps.setString(2, last_name);
        ps.setString(3, address);
        ps.setString(4, department);
        ps.setString(5, id);
        ps.execute();
    }
    catch(SQLException e){
       System.out.println(e.getMessage());
    }
    }
}
