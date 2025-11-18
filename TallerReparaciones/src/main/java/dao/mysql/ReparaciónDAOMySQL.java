package dao.mysql;

import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;

import dao.interfaces.ReparacionDAO;
import entities.Reparacion;

public class ReparaciónDAOMySQL implements ReparacionDAO {
	
	private Connection conexion;

	@Override
	public int insert(Reparacion r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Reparacion r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String dni) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<dao.interfaces.Reparacion> findall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public dao.interfaces.Reparacion findByDni(String dni) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
