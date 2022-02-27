import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class LasDunasHotel extends JFrame implements ActionListener
{
	Label Etiqueta1,Etiqueta2,Etiqueta3,Etiqueta4,Etiqueta5,Etiqueta6,Etiqueta7,Etiqueta8,Etiqueta9,Etiqueta10,Etiqueta11,Etiqueta12,Etiqueta13,Etiqueta14,Etiqueta15,Etiqueta16;
	TextField Campo1,Campo2,Campo3,Campo4,Campo6,Campo7,Campo8,Campo9,Campo11,Campo12,Campo13,Campo14,Campo16;
	TextArea Campo5, Campo10, Campo15;
	Button Boton1,Boton2,Boton3,Boton4;
	private Connection conexion;
	private ResultSet recur;
	String TBuscar;
    public LasDunasHotel()
    {
    	super("Hotel Las Dunas");
    	new INTRO(this);
    	new USUARIO(this);
        JTabbedPane Hotel = new JTabbedPane();
        Dimension size = new Dimension(380,380);
        Hotel.setMaximumSize(size);
        Hotel.setPreferredSize(size);
        Hotel.setMinimumSize(size);
        Dimension Screen;
		Screen = Toolkit.getDefaultToolkit().getScreenSize();		
		this.setLocation(((Screen.width - 380)/2),(Screen.height - 380)/2);

			Etiqueta1 = new Label ("Habitacion");
			Etiqueta2 = new Label ("Nombres");
			Etiqueta3 = new Label ("DNI");
			Etiqueta4 = new Label ("Tipo Hab.");
			Etiqueta5 = new Label ("Consumo");
			
			Etiqueta6 = new Label ("Habitacion");
			Etiqueta7 = new Label ("Nombres");
			Etiqueta8 = new Label ("DNI");
			Etiqueta9 = new Label ("Tipo Hab.");
			Etiqueta10= new Label ("Consumo");
			
			Etiqueta11= new Label ("Habitacion");
			Etiqueta12= new Label ("Nombres");
			Etiqueta13= new Label ("DNI");
			Etiqueta14= new Label ("Tipo Hab.");
			Etiqueta15= new Label ("Consumo");
			Etiqueta16= new Label ("Habitacion");
			
			Campo1 = new TextField ();
			Campo2 = new TextField ();
			Campo3 = new TextField ();
			Campo4 = new TextField ();
			Campo5 = new TextArea ();
			Campo6 = new TextField ();
			Campo7 = new TextField ();
			Campo8 = new TextField ();
			Campo9 = new TextField ();
			Campo10= new TextArea ();
			Campo11= new TextField ();
			Campo12= new TextField ();
			Campo13= new TextField ();
			Campo14= new TextField ();
			Campo15= new TextArea ();
			Campo16= new TextField ();
			Boton1 = new Button ("Ingresar");
			Boton2 = new Button ("Eliminar");
			Boton3 = new Button ("Modificar");
			Boton4 = new Button ("Buscar");
			Etiqueta1.setBounds(20,45,70,20);
			Etiqueta2.setBounds(20,75,70,20);
			Etiqueta3.setBounds(20,105,70,20);
			Etiqueta4.setBounds(20,135,70,20);
			Etiqueta5.setBounds(20,165,70,20);
			Etiqueta6.setBounds(20,45,70,20);
			Etiqueta7.setBounds(20,75,70,20);
			Etiqueta8.setBounds(20,105,70,20);
			Etiqueta9.setBounds(20,135,70,20);
			Etiqueta10.setBounds(20,165,70,20);
			Etiqueta11.setBounds(20,45,70,20);
			Etiqueta12.setBounds(20,75,70,20);
			Etiqueta13.setBounds(20,105,70,20);
			Etiqueta14.setBounds(20,135,70,20);
			Etiqueta15.setBounds(20,165,70,20);
			Etiqueta16.setBounds(20,45,70,20);
			Campo1.setBounds(100,45,70,20);
			Campo2.setBounds(100,75,188,20);
			Campo3.setBounds(100,105,188,20);
			Campo4.setBounds(100,135,188,20);
			Campo5.setBounds(100,165,188,100);
			Campo6.setBounds(100,45,70,20);
			Campo7.setBounds(100,75,188,20);
			Campo8.setBounds(100,105,188,20);
			Campo9.setBounds(100,135,188,20);
			Campo10.setBounds(100,165,188,100);
			Campo11.setBounds(100,45,70,20);
			Campo12.setBounds(100,75,188,20);
			Campo13.setBounds(100,105,188,20);
			Campo14.setBounds(100,135,188,20);
			Campo15.setBounds(100,165,188,100);
			Campo16.setBounds(100,45,70,20);
			Boton1.setBounds(152,270,75,25);
			Boton1.addActionListener(this);
			Boton2.setBounds(152,270,75,25);
			Boton2.addActionListener(this);
			Boton3.setBounds(152,270,75,25);
			Boton3.addActionListener(this);
			Boton4.setBounds(180,40,75,25);
			Boton4.addActionListener(this);
        
        JPanel SolapaBienvenida = new JPanel();
        SolapaBienvenida.setLayout(null);
        
        JPanel SolapaAgregar = new JPanel();
        SolapaAgregar.setLayout(null);        

			SolapaAgregar.add(Etiqueta1);
			SolapaAgregar.add(Etiqueta2);
			SolapaAgregar.add(Etiqueta3);
			SolapaAgregar.add(Etiqueta4);
			SolapaAgregar.add(Etiqueta5);
			SolapaAgregar.add(Campo1);
			SolapaAgregar.add(Campo2);
			SolapaAgregar.add(Campo3);
			SolapaAgregar.add(Campo4);
			SolapaAgregar.add(Campo5);
			SolapaAgregar.add(Boton1);
        
        Hotel.addTab("Agregar Habitacion", SolapaAgregar);
        /*===========================================*/
        /*================PESTAÑA2====================*/
        JPanel SolapaEliminar = new JPanel();
        SolapaEliminar.setLayout(null);
			SolapaEliminar.add(Etiqueta6);
			SolapaEliminar.add(Etiqueta7);
			SolapaEliminar.add(Etiqueta8);
			SolapaEliminar.add(Etiqueta9);
			SolapaEliminar.add(Etiqueta10);
			SolapaEliminar.add(Campo6);
			SolapaEliminar.add(Campo7);
			SolapaEliminar.add(Campo8);
			SolapaEliminar.add(Campo9);
			SolapaEliminar.add(Campo10);
			SolapaEliminar.add(Boton2);

        Hotel.addTab("Eliminar Habitacion", SolapaEliminar);
        /*===========================================*/
                /*================PESTAÑA2====================*/
        JPanel SolapaModificar = new JPanel();
        	SolapaModificar.setLayout(null);
			SolapaModificar.add(Etiqueta11);
			SolapaModificar.add(Etiqueta12);
			SolapaModificar.add(Etiqueta13);
			SolapaModificar.add(Etiqueta14);
			SolapaModificar.add(Etiqueta15);
			SolapaModificar.add(Campo11);
			SolapaModificar.add(Campo12);
			SolapaModificar.add(Campo13);
			SolapaModificar.add(Campo14);
			SolapaModificar.add(Campo15);
			SolapaModificar.add(Boton3);

        Hotel.addTab("Modificar Habitacion", SolapaModificar);
        /*===========================================*/
        /*================PESTAÑA2====================*/
        JPanel SolapaBuscar = new JPanel();
        	SolapaBuscar.setLayout(null);
			SolapaBuscar.add(Etiqueta16);
			SolapaBuscar.add(Campo16);
			SolapaBuscar.add(Boton4);
        //Propiedades de la pestaña
        Hotel.addTab("Buscar Habitacion", SolapaBuscar);
        /*===========================================*/ 
        getContentPane().add(Hotel); 
    }

	private void AgregarHabitacion()
	{
		Statement LibX;
		try
		{
			conexion=DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=LasDunas.mdb;DriverID=22}");
			LibX=conexion.createStatement();
			LibX.executeUpdate("INSERT INTO CLIENTES"+
                           " VALUES ('"+Campo1.getText()+"',"+
                           "'"+Campo2.getText()+"',"+
                           "'"+Campo3.getText()+"',"+
                           "'"+Campo4.getText()+"',"+
                           "'"+Campo5.getText()+"')");
			JOptionPane.showMessageDialog(null, "El Habitacion ha sido agregado Satisfactoriamente");
		}
		catch(SQLException e)
		{
			if(conexion!=null)
			{
				try
				{
					conexion.close();
				}
				catch(SQLException ex){}
      		}
			
		}
	}

	private void EliminarHabitacion()
	{
		Statement LibX;
		try
		{
			conexion=DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=LasDunas.mdb;DriverID=22}");
			LibX=conexion.createStatement();
			recur = LibX.executeQuery("SELECT * FROM CLIENTES WHERE HABITACION='"+ TBuscar+"'");
			recur.next();
			LibX.executeUpdate("DELETE FROM CLIENTES WHERE HABITACION='"+ TBuscar+"'");
			JOptionPane.showMessageDialog(null, "Eliminacion de Habitacion Satisfactoria");
		}
		catch(SQLException e){}
	}
	
	private void ModificarHabitacion()
	{
		Statement LibX;
		try
		{
			conexion=DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=LasDunas.mdb;DriverID=22}");
			LibX=conexion.createStatement();
			recur = LibX.executeQuery("SELECT HABITACION FROM CLIENTES WHERE HABITACION='"+ TBuscar+"'");
			recur.next();
			LibX.executeUpdate("UPDATE CLIENTES SET HABITACION='"+Campo12.getText()+
							                           "', DNI='"+Campo13.getText()+
							                           "', THABITACION='"+Campo14.getText()+
							                           "', CONSUMO='"+Campo15.getText()+
							                           "' WHERE HABITACION='"+TBuscar+"'");
			JOptionPane.showMessageDialog(null, "Actualizacion Satisfactoria");
		}
		catch(SQLException e){}
	}
	
	private void Searching()
	{
		TBuscar = Campo16.getText();
		Statement snt;
		try
		{
		    conexion=DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=LasDunas.mdb;DriverID=22}");
		    snt=conexion.createStatement();
		    recur=snt.executeQuery("SELECT * FROM CLIENTES WHERE HABITACION='"+TBuscar+"'");
		    recur.next();
		    ver_Datos();
	    }
	    catch(SQLException e)
	    {
	    }
	}
	
	private void ver_Datos()
	{
		try
		{
			Campo6.setText(recur.getString("HABITACION"));
			Campo7.setText(recur.getString("NOMBRES"));
			Campo8.setText(recur.getString("DNI"));
			Campo9.setText(recur.getString("THABITACION"));
			Campo10.setText(recur.getString("CONSUMO"));
			Campo11.setText(Campo6.getText());
			Campo12.setText(Campo7.getText());
			Campo13.setText(Campo8.getText());
			Campo14.setText(Campo9.getText());
			Campo15.setText(Campo10.getText());
		}
		catch (SQLException e){}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String com=e.getActionCommand();
		if ("Ingresar".equals(com))
		{
			AgregarHabitacion();
			Campo1.setText("");
			Campo2.setText("");
			Campo3.setText("");
			Campo4.setText("");
			Campo5.setText("");
		}
		if ("Eliminar".equals(com))
		{
			EliminarHabitacion();
			Campo6.setText("");
			Campo7.setText("");
			Campo8.setText("");
			Campo9.setText("");
			Campo10.setText("");
			Campo11.setText("");
			Campo12.setText("");
			Campo13.setText("");
			Campo14.setText("");
			Campo15.setText("");
		}
		if ("Modificar".equals(com))
		{
			ModificarHabitacion();
			Campo6.setText("");
			Campo7.setText("");
			Campo8.setText("");
			Campo9.setText("");
			Campo10.setText("");
			Campo11.setText("");
			Campo12.setText("");
			Campo13.setText("");
			Campo14.setText("");
			Campo15.setText("");
		}
		if ("Buscar".equals(com))
		{
			Searching();
		}
	}

    public static void main(String[] args) {
        JFrame frame = new LasDunasHotel();

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {System.exit(0);}
        });

        frame.pack();
        frame.setVisible(true);
    }
}

class INTRO extends Dialog implements ActionListener
{
	INTRO(Frame f)
	{		
		super(f,"Hotel Las Dunas",true);
		setSize(612,287);
		Dimension pantalla, cuadro;
		pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		cuadro = this.getSize();		
		this.setLocation(((pantalla.width - cuadro.width)/2),(pantalla.height - cuadro.height)/2);
		
		JLabel Fondo = new JLabel();
		Fondo.setBounds(new Rectangle(0, 0, 612, 287));
		Fondo.setIcon(new ImageIcon("fondo.jpg"));
		add(Fondo);
		Timer t = new Timer(1000, new ActionListener()
		{
			int fin = 0;
			public void actionPerformed(ActionEvent e)
			{
				fin = fin+1;
				if (fin>5)
				{
					dispose();
				}
			}
		});
		t.setRepeats(true);
		t.start();
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){}
}

class USUARIO extends Dialog implements ActionListener
{
	Label Label1 = new Label ("Usuario");
	Label Label2 = new Label ("Clave");
	JTextField Text1 = new JTextField ();
	JPasswordField Text2 = new JPasswordField ();
	Button Button1 = new Button ("Entrar");
	Button Button2 = new Button ("Salir");
	private Connection conexion;
	private ResultSet resultadoU;
	USUARIO(Frame f)
	{		
		super(f,"Identificate",true);
		this.setLayout(null);
		setSize(241, 165);
		Dimension pantalla, cuadro;
		pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		cuadro = this.getSize();		
		this.setLocation(((pantalla.width - cuadro.width)/2),(pantalla.height - cuadro.height)/2);
		Label1.setBounds(22, 55, 60, 15);
		Label2.setBounds(22, 84, 60, 15);		
		Text1.setBounds(96, 53, 120, 20);
		Text2.setBounds(96, 84, 121, 20);
		Button1.setBounds(43, 119, 70, 25);
		Button1.addActionListener(this);
		Button2.setBounds(127, 119, 70, 25);
		Button2.addActionListener(this);
		add(Label1);
		add(Label2);
		add(Text1);
		add(Text2);
		add(Button1);
		add(Button2);
		setVisible(true);		
	}

	private void BusCar()
	{
		String Find1=Text1.getText();
		String Find2=Text2.getText();
		Statement sentencia;
		try
		{
		    conexion=DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=LasDunas.mdb;DriverID=22}");
		    sentencia=conexion.createStatement();
		    resultadoU=sentencia.executeQuery("SELECT * FROM USUARIOS WHERE USUARIO='"+Find1+"'");
		    resultadoU.next();
		    String Find3=resultadoU.getString("PASSWORD");
			if (Find2.equals(Find3))
			{
				dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Clave o Usuario Incorrecto");
			}
	    }
	    catch(SQLException e) {}
	}
		

	public void actionPerformed(ActionEvent e)
	{
		String com=e.getActionCommand();
		if ("Entrar".equals(com))
		{
			BusCar();
		}
		else
		{
			if(conexion!=null)
			{
				try
				{
					conexion.close();
				}
				catch(SQLException ex){}
      		}
      		dispose();
      		System.exit(0);
      	}
	}
}