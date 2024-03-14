package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Transaccion;
import bean.UsuarioBean;

public class UsuarioDao {
	private String dbUrl = "jdbc:mysql://localhost:3306/Cuentas_clientes";
	private String dbUname = "root";
	private String dbPassword = "";
	private String dbDriver = "com.mysql.cj.jdbc.Driver";
	
	public void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection()
	{
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public boolean validate(UsuarioBean usuario)
	{
		boolean status = false;
		
		loadDriver(dbDriver);
		Connection con = getConnection();
		
		String sql = "select * from usuario where nombreUsuario = ? and password =?";
		PreparedStatement ps;
		try {
		ps = con.prepareStatement(sql);
		ps.setString(1, usuario.getNombreUsuario());
		ps.setString(2, usuario.getPassword());
		ResultSet rs = ps.executeQuery();
		status = rs.next();
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

	public void insertarTransaccion(Transaccion tf) {
		// TODO Auto-generated method stub
		//Connection con = null;
           //boolean status = false;
		
			loadDriver(dbDriver);
			Connection con = getConnection();
			PreparedStatement pstm = null;
		try {
			//Connection con = getConnection();
			String sql = "INSERT INTO `Transaccion` (`rutCliente`, `idCuenta`, `montoTransferencia`, `cuentaTransferencia`, `tipoCuenta`, `tipoBanco`)\n"
					+ "VALUES (?, ?, ?, ?, ?, ?);";
			pstm = con.prepareStatement(sql);
			pstm.setString(1, tf.getRutCliente());
			pstm.setString(2, tf.getIdCuenta());
			pstm.setString(3, tf.getMontoTransferencia());
			pstm.setString(4, tf.getCuentaTransferencia());
			pstm.setString(5, tf.getTipoCuenta());
			pstm.setString(6, tf.getTipoBanco());
		    //pstm.setString(7, transaccion.getUsuario());
			pstm.execute();
			con.close();
		} catch (Exception e){
			System.out.println(e.toString());
		}
		return;
	}		
	}


