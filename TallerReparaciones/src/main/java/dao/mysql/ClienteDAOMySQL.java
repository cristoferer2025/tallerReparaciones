package dao.mysql;

public class ClienteDAOMySQL {
	private int id_cliente;
	private String nombre;
	private String email;
	
	
	
	public ClienteDAOMySQL (int id_cliente,String nombre,String email  ) {
		super ();
		this.id_cliente=id_cliente;
		this.nombre=nombre;
		this.email=email;
	}
}