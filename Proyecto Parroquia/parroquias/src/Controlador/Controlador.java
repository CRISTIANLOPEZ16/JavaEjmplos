
package Controlador;
import DAO.diezmoDAO;
import DAO.feligresDAO;
import DTO.feligresDTO;
import Vista.Formulario_Registro;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class Controlador implements ActionListener{
    private diezmoDAO d=null;
    private feligresDAO f=null;
    private Formulario_Registro v=null;
          
    public Controlador(feligresDAO f,diezmoDAO d,Formulario_Registro v){
    this.f=f; 
    this.d=d;
    this.v=v;
    actionListener(this);
    }
     private void actionListener(Controlador aThis) {
        v.JBGuardar.addActionListener(aThis);
        v.JBActualizar.addActionListener(aThis);
        v.JBBuscar.addActionListener(aThis);
        v.JBConsultar.addActionListener(aThis);
        v.JBEliminar.addActionListener(aThis);
        v.JBPagar.addActionListener(aThis);
        v.JBTotal.addActionListener(aThis);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
       try{
           if(ae.getActionCommand().contentEquals("Guardar")){
                feligresDTO fl=new feligresDTO(v.TXcedula.getText(),v.TXNombre.getText(),
                v.TXApellidos.getText(),v.TXDireccion.getText(),"",v.TXTelefono.getText(),v.TXEstado.getText()
                ,v.TXEstrato.getText());
               if(f.create(fl)){
               JOptionPane.showMessageDialog(null,"el usuario fue agregado correctamente");
               limpiar(1);
               }else{JOptionPane.showMessageDialog(null,"No se ingreso el usuario");
               }
           }else if(ae.getActionCommand().contentEquals("Eliminar")){
               if(f.Delete(v.TXcedula.getText())){
               JOptionPane.showMessageDialog(null,"el usuario fue ELIMINADO correctamente");
               limpiar(1);
               }else{JOptionPane.showMessageDialog(null,"No se ingreso el usuario");
               }
           }else if(ae.getActionCommand().contentEquals("Actualizar")){
               
           }else if(ae.getActionCommand().contentEquals("Buscar")){
           }else if(ae.getActionCommand().contentEquals("Pagar")){
           }else if(ae.getActionCommand().contentEquals("Consultar")){
           }else if(ae.getActionCommand().contentEquals("Totalizar")){
               
           }
       }catch(Exception e){
       e.printStackTrace();}
    }

 public void limpiar(int x){
     
    if(x==1){
         v.TXcedula.setText("");
         v.TXNombre.setText("");
         v.TXApellidos.setText("");
         v.TXDireccion.setText("");
         v.TXTelefono.setText("");
         v.TXEstado.setText("");
         v.TXEstrato.setText("");}
    else if(x==2){
    v.TXCedulaC.setText("");
    v.TXDiezmo.setText("");}
 } 
    
}
