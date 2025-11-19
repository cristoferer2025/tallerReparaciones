package entities;

import java.sql.Date;
import java.util.Scanner;

public class Reparacion {
	private int idreparacion;
	private String descripcion;
	private Date fecha_entrada;
	private double coste_estimado;
	private String  estado;
	private int vehiculo_id;
	private int usuario_id;
	
	


	public Reparacion(int idreparacion, String matricula, Date fecha_entrada, double coste_estimado, String estado,
			int vehiculo_id, int usuario_id) {
		super();
		this.idreparacion = idreparacion;
		this.descripcion = matricula;
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




	public String getdescripcion() {
		return descripcion;
	}




	public void setdescripcion(String descripcion) {
		this.descripcion = descripcion;
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




	public String getEstado() {
		return estado;
	}




	public void setEstado(String estado) {
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
	
	
	
	
	
	
	
	
	public static Reparacion leerReparacion() {
		Scanner sc = new Scanner(System.in);

		System.out.println("> Dame idreparacion:");
		int idreparacion = sc.nextInt();
		sc.nextLine();


		System.out.println("> Dame descripcion:");
		String descripcion = sc.nextLine();


		
		System.out.println("> Dame fecha_entrada:");
		int fecha_entrada = sc.nextInt();
		sc.nextLine();

		System.out.println("> Dame coste_estimado:");
		String coste_estimado = sc.nextLine();

		System.out.println("> Dame estado:");
		String estado = sc.nextLine();
		sc.nextLine();
		
		System.out.println("> Dame vehiculo_id:");
		int vehiculo_id = sc.nextInt();
		sc.nextLine();

		System.out.println("> Dame usuario_id:");
		int usuario_id = sc.nextInt();
		sc.nextLine();
		

		return new Reparacion(idreparacion, descripcion, fecha_entrada, coste_estimado,estado, vehiculo_id, usuario_id);
	}

	public static void mostarReparacion(Reparacion r) {
		System.out.println("--------- Reparacion ---------");
		System.out.println("> idreparacion:" + r.getIdreparacion());
		System.out.println("> Dame descripcion:" + r.getdescripcion());
		System.out.println("> Dame fecha_entrada:" + r.getFecha_entrada());
		System.out.println("> Dame coste_estimado:" + r.getCoste_estimado());
		System.out.println("> Dame estado:" + r.getEstado());
		System.out.println("> Dame vehiculo_id:" + r.getVehiculo_id());
		System.out.println("> Dame fecha_entrada:" + r.getUsuario_id());
	
		
		
	}
}
