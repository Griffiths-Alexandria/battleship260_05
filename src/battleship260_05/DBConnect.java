
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
    // Return all the Human Players in an Array List.
    public ArrayList getNames(){
        try {
            ArrayList<String> result = new ArrayList<>();
            String query = "select playerName from players where playerName != 'CPU'";
            rs = stmt.executeQuery(query);
            String playerName;
            while (rs.next()){
                playerName = rs.getString("playerName");
                if (playerName.length() < 10){
                    for (int i=10; i > playerName.length(); i--){
                        playerName += " ";
                    }
                }
                result.add(playerName);
            }
            return result;
        } catch (Exception ex){
            System.out.println("Error: "+ex);
            return null;
        }
    }
    public Statistics getAllPlayerData(){
        try {
            Statistics allPlayers = new Statistics();
            String query = "select * from players";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                String tempName = rs.getString("playerName");
                allPlayers.playerNames.add(tempName);
                int tempWins = rs.getInt("wins");
                allPlayers.playerWins.add(tempWins);
                allPlayers.playerLosses.add(rs.getInt("losses"));
                allPlayers.playerTotalHits.add(rs.getInt("totalHits"));
                allPlayers.playerTotalMisses.add(rs.getInt("totalMisses"));
            }
            return allPlayers;
        }
        catch(Exception ex){
            System.out.println("Error: "+ex);
            return null;
        }
    }
    
    
    
    // Simple TEST method to output names to the console. Not for use in game.
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
