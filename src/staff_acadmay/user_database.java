package staff_acadmay;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class user_database {
    public Connection con;
    public security sec=new security();
    public String query;
    public void insert_data(String user,String pass,String depart){
    try{
        con=sec.connect();
        query="insert into user values(?,?,?)";
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1, user);
        ps.setString(2, pass);
        ps.setString(3, depart);
        ps.execute();
    }
    catch(SQLException e){
       System.out.println(e.getMessage());
    }
}
    
    public ArrayList <users> get_data_users(){
        ArrayList <users> list=new ArrayList<>();
         try{
        con=sec.connect();
        query="select * from user";
        PreparedStatement ps=con.prepareStatement(query);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            list.add(new users(rs.getString("user_name"),rs.getString("password"),rs.getString("department")));
        }
    }
    catch(SQLException e){
       System.out.println(e.getMessage());
    }
         return list;
    }
    public int check_data(String user,String pass){
        int x=0;
        ArrayList<users> arr=get_data_users();
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).getUser_name().equals(user)){
                if(arr.get(i).getPassword().equals(pass)){
                    x=1;
                    break;
                }
                else{
                    x=2;
                    break;
                }
            }
            else{
                x=0;
            }
        }
              
        
        return x;
    }
}
