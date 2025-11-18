package dao.interfaces;

import java.util.ArrayList;

public interface VehiculoDAO {
	int insert (entities.Vehiculo v);
	int update (entities.Vehiculo Vehiculv);
	int delete (String dni);
	ArrayList<Vehiculo> findall();
	Vehiculo findByDni(String dni);

}
