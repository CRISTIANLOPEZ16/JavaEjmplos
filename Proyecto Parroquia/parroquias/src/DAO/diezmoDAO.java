package DAO;
import java.sql.*;
import DTO.*;
import Servicios.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class diezmoDAO {

    public diezmoDAO() {
    }
    
      private static final String SQL_TABLE = "propietario",
     SQL_SELECT_OWNER = "SELECT * FROM diezmo INNER JOIN feligres ON diezmo.cedula=feligres.cedula WHERE cedula=?",
      SQL_SELECT="SELECT * FROM " + SQL_TABLE + " WHERE cedula = ?",
      SQL_UPDATE="UPDATE `diezmo` SET `valor`=? WHERE cedula=?";
      Conexion CON=new Conexion();
      
      public boolean update(diezmoDTO d){
      PreparedStatement ps ;
        try{
            ps=CON.getConnection().prepareStatement(SQL_UPDATE);

            ps.setString(1, Integer.toString(d.getMonto()));
            ps.setString(2,d.getCedula());
          
            if (ps.executeUpdate() > 0) {
                return (true);
            }
        }catch(SQLException ex){
             Logger.getLogger(feligresDTO.class.getName()).log(Level.SEVERE, null, ex);
        }return false;
      }
      
      public feligresDTO searchinner(String s){
      PreparedStatement ps ;
      ResultSet rs;
      feligresDTO flQ=null;
        try{
            ps=CON.getConnection().prepareStatement(SQL_SELECT);

           rs = ps.executeQuery();
           while (rs.next()) {

                flQ = new feligresDTO(rs.getString("cedula"),rs.getString("nombre"),rs.getString("apellidos"),
                                       rs.getString("direccion"),rs.getString("fecha_nacimiento"),
                                       rs.getString("telefono"),
                                       rs.getString("estado"),rs.getString("estrato"));
                
            }
        }catch(SQLException ex){
             Logger.getLogger(feligresDTO.class.getName()).log(Level.SEVERE, null, ex);
        }return (flQ);
      }
      public diezmoDTO search(){
      PreparedStatement ps ;
      ResultSet rs;
      diezmoDTO flQ=null;
        try{
            ps=CON.getConnection().prepareStatement(SQL_SELECT);

           rs = ps.executeQuery();
           while (rs.next()) {

                flQ = new diezmoDTO(rs.getString("cedula"),rs.getInt("valor"));
            }
        }catch(SQLException ex){
             Logger.getLogger(feligresDTO.class.getName()).log(Level.SEVERE, null, ex);
        }return (flQ);
      }
      //final de la clase
}
