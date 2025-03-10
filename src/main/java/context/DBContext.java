package context;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBContext {

    /*USE BELOW METHOD FOR YOUR DATABASE CONNECTION FOR BOTH SINGLE AND MULTILPE SQL SERVER INSTANCE(s)*/
    /*DO NOT EDIT THE BELOW METHOD, YOU MUST USE ONLY THIS ONE FOR YOUR DATABASE CONNECTION*/
    public Connection getConnection()throws Exception {
        String url = "jdbc:mysql://"+serverName+":"+portNumber + "/" + dbName;
        if(instance == null || instance.trim().isEmpty())
            url = "jdbc:mysql://"+serverName+":"+portNumber +"/"+dbName;
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, userID, password);
    }
    //      public String getImagePath() throws Exception {
//        return "image/";
//    }
    /*Insert your other code right after this comment*/
    /*Change/update information of your database connection, DO NOT change name of instance variables in this class*/
    private final String serverName = "localhost";
    private final String dbName = "giuaky";
    private final String portNumber = "3306";
    private final String instance="";//LEAVE THIS ONE EMPTY IF YOUR SQL IS A SINGLE INSTANCE
    private final String userID = "root";
    private final String password = "123456";
}