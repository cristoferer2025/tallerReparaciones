package dao.interfaces;

import java.util.ArrayList;

public interface ReparacionDAO {
	int insert (entities.Reparacion r);
	int update (entities.Reparacion r);
	int delete (String dni);
	ArrayList<Reparacion> findall();
	Reparacion findByDni(String dni);

}
