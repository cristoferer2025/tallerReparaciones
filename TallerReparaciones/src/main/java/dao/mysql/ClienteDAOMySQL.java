package dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import dao.interfaces.ClienteDAO;
import entities.Cliente;

public class ClienteDAOMySQL implements ClienteDAO {
	
	private Connection conexion;

	@Override
	public int insert(Cliente c) {
		try {
			// PreparedStatement
			String sql = "INSERT INTO Cliente (id_cliente, nombre, email) VALUES(?, ?, ?);";
			PreparedStatement pst = conexion.prepareStatement(sql);
			pst.setInt(1, 1); // posicion 1, valor 1
			pst.setInt(2, c.getId_cliente());
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
	public int update(Cliente c) {
		String sqlDelete = "DELETE FROM Persona WHERE id_cliente = ?;";
		try {
			PreparedStatement pst = conexion.prepareStatement(sqlDelete);
			pst.setInt(1, 1); // borrar id
			int filas = pst.executeUpdate();
			
			if (filas > 0) {
				System.out.println("> OK. Cliente con id_cliente 1 eliminada correctamente.");
			} else {
				System.out.println("> NOK. Cliente con id_cliente 1 no se encuentra en la base de datos.");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(String dni) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<dao.interfaces.Cliente> findall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public dao.interfaces.Cliente findByDni(String dni) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}