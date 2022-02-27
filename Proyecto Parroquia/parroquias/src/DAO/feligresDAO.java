/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
import DTO.*;
import Servicios.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class feligresDAO {
    Conexion CON=new Conexion();

    public feligresDAO() {
    }
    
     private static final String SQL_TABLE = "feligres",
            SQL_INSERT = "INSERT INTO `feligres`(`cedula`, `nombre`, `apellidos`,"
             + "`direccion`, `fecha_nacimiento`, `telefono`, `estado`, `estrato`) VALUES (?,?,?,?,?,?,?,?)",
            SQL_UPDATE = "UPDATE `feligres` `nombre`=?," + "`apellidos`=?,`direccion`=?," + "`fecha_nacimiento`=?,`telefono`=?,"+"`estado`=?,`estrato`=? WHERE cedula=?",
            SQL_DELETE = "DELETE FROM " + SQL_TABLE + " WHERE cedula = ?",
            SQL_SELECT = "SELECT * FROM " + SQL_TABLE + " WHERE cedula = ?";
     //se supone que crea ** que van a pagar
     public boolean create(feligresDTO fl){
        PreparedStatement ps ;
        try{
            ps=CON.getConnection().prepareStatement(SQL_INSERT);

            ps.setString(1,fl.getCedula());
            ps.setString(2, fl.getNombre());
            ps.setString(3, fl.getApellidos());
            ps.setString(4, fl.getDirreccion());
            ps.setString(5, fl.getFeahcaDeNacimiento());
            ps.setString(6, fl.getTelefono());
            ps.setString(7, fl.getEstado());
            ps.setString(8, fl.getEstrato());
            if (ps.executeUpdate() > 0) {
                return (true);
            }
        }catch(SQLException ex){
             Logger.getLogger(feligresDTO.class.getName()).log(Level.SEVERE, null, ex);
        }return false;
     }
     //actualiza a los **
     public boolean Update(feligresDTO fl){
         PreparedStatement ps ;
        try{
            ps=CON.getConnection().prepareStatement(SQL_UPDATE);

            ps.setString(1, fl.getNombre());
            ps.setString(2, fl.getApellidos());
            ps.setString(3, fl.getDirreccion());
            ps.setString(4, fl.getFeahcaDeNacimiento());
            ps.setString(5, fl.getTelefono());
            ps.setString(6, fl.getEstado());
            ps.setString(7, fl.getEstrato());
            ps.setString(8,fl.getCedula());
            if (ps.executeUpdate() > 0) {
                return (true);
            }
        }catch(SQLException ex){
             Logger.getLogger(feligresDTO.class.getName()).log(Level.SEVERE, null, ex);
        }return false;
     }
     //los saca  de un gasto mas
     public boolean Delete(String fl){
       PreparedStatement ps ;
        try{
            ps=CON.getConnection().prepareStatement(SQL_DELETE);

            ps.setString(1,fl);
            if (ps.executeUpdate() > 0) {
                return (true);
            }
        }catch(SQLException ex){
             Logger.getLogger(feligresDTO.class.getName()).log(Level.SEVERE, null, ex);
        }return false;
     }
     public feligresDTO search(String fl){
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
//final de la clase
}
