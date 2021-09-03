/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.DAL;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CongLam
 */
public class SqlDataConnection {
    protected Connection con;
    private final String url = "jdbc:sqlserver://localhost:1433;databaseName=BookShop;user=sa;password=123";
    public boolean openConnection() throws SQLException{
        try{
            
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SqlDataConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
            con = java.sql.DriverManager.getConnection(url);
//            JOptionPane.showMessageDialog(null, "Connected!");
            return true;
            }
        catch (SQLException e){
          }
        return false;
    }
    
    public void closeConnection() throws SQLException{
        con.close();
    }
    public static void main(String[] args) throws SQLException {
        SqlDataConnection obj = new SqlDataConnection();
        if(obj.openConnection()){
            System.out.println("xxx");
        }
        
        
    }

}
