package dao.mysql;

import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;

import dao.interfaces.VehiculoDAO;
import entities.Vehiculo;

public class VehiculoDAOMySQL implements VehiculoDAO {
	
	private Connection conexion;

	@Override
	public int insert(Vehiculo v) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Vehiculo Vehiculv) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean delete(String dni) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<dao.interfaces.Vehiculo> findall() {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Reparacion>

	@Override
	public dao.interfaces.Vehiculo findByDni(String dni) {
		// TODO Auto-generated method stub
		return null;
	}

}
