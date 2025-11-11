package entitities;

public class Vehiculo {
	private int idvehiculo;
	private String matricula;
	private String marca;
	private String modelo;
	private int cliente_id;
	
	
	
	
	public Vehiculo(int idvehiculo, String matricula, String marca, String modelo, int cliente_id) {
		super();
		this.idvehiculo = idvehiculo;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.cliente_id = cliente_id;
		
		
		
	}




	public int getIdvehiculo() {
		return idvehiculo;
	}




	public void setIdvehiculo(int idvehiculo) {
		this.idvehiculo = idvehiculo;
	}




	public String getMatricula() {
		return matricula;
	}




	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}




	public String getMarca() {
		return marca;
	}




	public void setMarca(String marca) {
		this.marca = marca;
	}




	public String getModelo() {
		return modelo;
	}




	public void setModelo(String modelo) {
		this.modelo = modelo;
	}




	public int getCliente_id() {
		return cliente_id;
	}




	public void setCliente_id(int cliente_id) {
		this.cliente_id = cliente_id;
	}

}
