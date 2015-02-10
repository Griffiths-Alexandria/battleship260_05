
package battleship260_05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Logan Work
 */
public class DBConnect {
    
    private String host = "jdbc:mysql://box341.bluehost.com:3306/stillsmi_battleship";
    private String user = "stillsmi_team";
    private String pwd = "260-05";
    
    private Connection con;
    private Statement stmt;
    private ResultSet rs;
    
    public DBConnect(){
        System.out.println("Connecting to remote DB...");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(host, user, pwd);
            stmt = con.createStatement();
            System.out.println("Connection Successful!");
        }
        catch(Exception ex){
            System.out.println("Error: "+ex);
        }
    }
    
    public ArrayList getNames(){
        try {
            ArrayList<String> result = new ArrayList();
            String query = "select playerName from players where playerName != 'CPU'";
            rs = stmt.executeQuery(query);
            String playerName;
            while (rs.next()){
                playerName = rs.getString("playerName");
                result.add(playerName);
            }
            return result;
        } catch (Exception ex){
            return null;
        }
    }
    public void displayNames(){
        try {
            String query = "select playerName from players where playerName != 'CPU'";
            rs = stmt.executeQuery(query);
            String playerName;
            while (rs.next()){
                playerName = rs.getString("playerName");
                System.out.println(playerName);
            }
        } catch (Exception ex){
            System.out.println("Error: "+ex);
        }
    }
}
