
package bookstore.GUI;

import bookstore.DAL.SqlDataConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cong Lam
 */
public class frmHoaDon extends javax.swing.JFrame{

    public frmHoaDon(String fileName) {
        this(fileName, null);
    }

    protected Connection con;
    private final String url = "jdbc:sqlserver://localhost:1433;databaseName=BookShop;user=sa;password=123";
    public Connection openConnection() throws SQLException{
        try{
            
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SqlDataConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
            con = java.sql.DriverManager.getConnection(url);
//            JOptionPane.showMessageDialog(null, "Connected!");
            }
        catch (SQLException e){
          }
        return con;
    }
    
    public frmHoaDon(String fileName, java.util.HashMap paramater) {
        super("Hóa đơn");
        try{
            net.sf.jasperreports.engine.JasperReport jasper = net.sf.jasperreports.engine.JasperCompileManager.compileReport(fileName);
            net.sf.jasperreports.engine.JasperPrint print = net.sf.jasperreports.engine.JasperFillManager.fillReport( jasper, paramater, this.openConnection());
            net.sf.jasperreports.swing.JRViewer viewer = new net.sf.jasperreports.swing.JRViewer(print);
  
            getContentPane().add(viewer);
        }catch(Exception e){
            e.printStackTrace();
        }
        
        setBounds(400, 100, 600, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
}
