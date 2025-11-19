package dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ArrayList;

import dao.interfaces.UsuarioDAO;

import entities.Usuario;

public class UsuarioMySQL implements UsuarioDAO {
	
	private Connection conexion;

	@Override
	public int insert(Usuario U) {
		try {
			// PreparedStatement
			String sql = "INSERT INTO Cliente (id_cliente, nombre, email) VALUES(?, ?, ?);";
			PreparedStatement pst = conexion.prepareStatement(sql);
			pst.setInt(1, 1); // posicion 1, valor 1
			pst.setInt(2, u.getId_cliente());
			pst.setString(3, c.getEmail());
			pst.setString(3, c.getEmail());
			


			int resul = pst.executeUpdate();
			System.out.println("resultado de inserccion:" + resul);
		} catch (SQLException e) {
			System.out.println("> NOK:" + e.getMessage());
		}
		return 0;
	}

	@Override
	public int update(Usuario U) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String dni) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Vehiculo> findall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vehiculo findByDni(String dni) {
		// TODO Auto-generated method stub
		return null;
	}

}
