package entitities;

import java.sql.Date;
import java.util.Scanner;

public class Reparacion {
	private int idreparacion;
	private String matricula;
	private Date fecha_entrada;
	private double coste_estimado;
	private int estado;
	private int vehiculo_id;
	private int usuario_id;
	
	


	public Reparacion(int idreparacion, String matricula, Date fecha_entrada, double coste_estimado, int estado,
			int vehiculo_id, int usuario_id) {
		super();
		this.idreparacion = idreparacion;
		this.matricula = matricula;
		this.fecha_entrada = fecha_entrada;
		this.coste_estimado = coste_estimado;
		this.estado = estado;
		this.vehiculo_id = vehiculo_id;
		this.usuario_id = usuario_id;
	}




	public int getIdreparacion() {
		return idreparacion;
	}




	public void setIdreparacion(int idreparacion) {
		this.idreparacion = idreparacion;
	}




	public String getMatricula() {
		return matricula;
	}




	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}




	public Date getFecha_entrada() {
		return fecha_entrada;
	}




	public void setFecha_entrada(Date fecha_entrada) {
		this.fecha_entrada = fecha_entrada;
	}




	public double getCoste_estimado() {
		return coste_estimado;
	}




	public void setCoste_estimado(double coste_estimado) {
		this.coste_estimado = coste_estimado;
	}




	public int getEstado() {
		return estado;
	}




	public void setEstado(int estado) {
		this.estado = estado;
	}




	public int getVehiculo_id() {
		return vehiculo_id;
	}




	public void setVehiculo_id(int vehiculo_id) {
		this.vehiculo_id = vehiculo_id;
	}




	public int getUsuario_id() {
		return usuario_id;
	}




	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}
	
	
	
	private int idreparacion;
	private String matricula;
	private Date fecha_entrada;
	private double coste_estimado;
	private int estado;
	private int vehiculo_id;
	private int usuario_id;
	
	
	
	
	
	public static Reparacion leerReparacion() {
		Scanner sc = new Scanner(System.in);

		System.out.println("> Dame id:");
		int idreparacion = sc.nextInt();
		sc.nextLine();

		System.out.println("> Dame matricula:");
		String matricula = sc.nextLine();

		System.out.println("> Dame email:");
		String email = sc.nextLine();
		sc.nextLine();

		System.out.println("Dame fecha de entrada");

		sc.close();

		return new Cliente(id_cliente, nombre, email);
	}

	public static void mostrarPersona(Cliente c) {
		System.out.println("--------- Cliente ---------");
		System.out.println("> Cliente id_cliente:" + c.getId_cliente());
		System.out.println("> Dame nombre:" + c.getNombre());
		System.out.println("> Dame email:" + c.getEmail());
		
	}
}
