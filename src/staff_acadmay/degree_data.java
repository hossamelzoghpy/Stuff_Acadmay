
package staff_acadmay;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class degree_data {
    public Connection con;
    public security sec=new security();
    public String query;
    public void insert_data(int id,int m1,int m2 ,int m3, int m4, int m5, int m6){
    try{
        con=sec.connect();
        query="insert into degree values(?,?,?,?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(query);
        ps.setInt(1,id );
        ps.setInt(2,m1 );
        ps.setInt(3,m2 );
        ps.setInt(4,m3 );
        ps.setInt(5,m4 );
        ps.setInt(6,m5 );
        ps.setInt(7,m6 );
        ps.setInt(8,m1+m2+m3+m4+m5+m6 );
        ps.execute();
    }
    catch(SQLException e){
       System.out.println(e.getMessage());
    }
}
}
