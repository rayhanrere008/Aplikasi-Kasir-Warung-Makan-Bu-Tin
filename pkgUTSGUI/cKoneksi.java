package pkgUTSGUI;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class cKoneksi {
    private String url="jdbc:mysql://localhost/db_warung";
    private String username_xampp = "root";
    private String password_xampp = "";
    private Connection con;
    
    public void connect(){
        try{
            con = DriverManager.getConnection(url, username_xampp, password_xampp);
            System.out.println("Koneksi Berhasil");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public Connection getCon(){
        return con;
    }
}
