package Model;
/*
@author Jose Manuel
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connect {
    
    private Connection con;
    private Statement set;
   
    public Connection connect(){
        String URL = "jdbc:mysql://localhost/helados_bd";
                //driver:gestor:puerto//IP/nombreBase
                //mysql://us-cdbr-east-03.cleardb.com/heroku_fc24fcc017152bd
        String userName = "root";
        String password = "dfloresq";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, userName, password);
            set = con.createStatement();
        }catch(Exception e){
            System.out.println("Conexión fallida.");
            System.out.println(e);
            System.out.println(e.getStackTrace());
        }
        return con;
    }
}