package dao.mysql;

import java.sql.Connection;
import java.util.ArrayList;

import dao.interfaces.UsuarioDAO;

import entities.Usuario;

public class UsuarioMySQL implements UsuarioDAO {
	
	private Connection conexion;

	@Override
	public int insert(Usuario U) {
		// TODO Auto-generated method stub
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
