package InventorySystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class UserRecord {
    
    Connections con = new Connections();
    
    public void view (JTable table){
        
        try{
            Connection con = Connections.getConnection();
            Statement st = con.createStatement();
            
            String sql = "SELECT * FROM User where position = 'Sales'";
            ResultSet rs = st.executeQuery(sql);
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch (SQLException e){
            System.out.println(e);
        }
        
    }
}
