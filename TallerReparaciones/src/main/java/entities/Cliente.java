package entities;

import java.util.Scanner;


public class Cliente {
	private int id_cliente;
	private String dni;
	private String nombre;
	private String email;;
	private String telefono;
	
	
	
	public Cliente (int id_cliente,String dni, String nombre,String email, String telefono) {
		super ();
		this.id_cliente=id_cliente;
		this.dni=dni;
		this.nombre=nombre;
		this.email=email;
		this.telefono=telefono;
		
	}



	public int getId_cliente() {
		return id_cliente;
	}



	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	
	
	public String getDni() {
		return dni;
	}
	
	
	public void setDni(String dni) {
		this.dni = dni;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
    public String getTelefono(String telefono) {
		return telefono;
    	
    }
	
    public void setTelefono() {
    	this.telefono=telefono;
    }
	
	
	public static Cliente leerCliente() {
		Scanner sc = new Scanner(System.in);

		System.out.println("> Dame id:");
		int id_cliente = sc.nextInt();
		sc.nextLine();
		
		System.out.println("> Dame dni:");
		String dni = sc.nextLine();

		System.out.println("> Dame nombre:");
		String nombre = sc.nextLine();

		System.out.println("> Dame email:");
		String email = sc.nextLine();
		sc.nextLine();
		
		
		System.out.println("> Dame telefono:");
		String telefono = sc.nextLine();
		

		

		sc.close();

		return new Cliente(id_cliente, nombre, email, dni, telefono);
	}

	public static void mostrarCliente(Cliente c) {
		System.out.println("--------- Cliente ---------");
		System.out.println("> Cliente id_cliente:" + c.getId_cliente());
		System.out.println("> Dame dni:" + c.getDni());
		System.out.println("> Dame nombre:" + c.getNombre());
		System.out.println("> Dame email:" + c.getEmail());
		
		
	}
}
