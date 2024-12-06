import java.sql.*;
public class Conn {
    // JDBC connectivity -
    //Register the driver 
    //Create Connection 
    // Create Statement
    //Execute Query 
    //Close Coonection

     Connection c;
     Statement s;
    public Conn(){
        try {
        c= DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "Simranmysql114");   
          s= c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
