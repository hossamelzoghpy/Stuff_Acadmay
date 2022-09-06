
package staff_acadmay;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class security {
  private final String user="root";
  private final String password="";
  private final String add="jdbc:mysql://localhost/staff";

  
    public Connection connect()throws SQLException{
       Connection r=(Connection) DriverManager.getConnection(add,user,password);
       return r;
      
  }
  
}
