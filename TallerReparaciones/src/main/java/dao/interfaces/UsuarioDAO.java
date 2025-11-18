package dao.interfaces;

import java.util.ArrayList;

public interface UsuarioDAO {
	int insert (entities.Usuario U);
	int update (entities.Usuario U);
	int delete (String dni);
	ArrayList<Vehiculo> findall();
	Vehiculo findByDni(String dni);

}
