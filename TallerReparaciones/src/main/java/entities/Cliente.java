package entities;

import java.util.Scanner;


public class Cliente {
	private int id_cliente;
	private String nombre;
	private String email;
	
	
	
	public Cliente (int id_cliente,String nombre,String email  ) {
		super ();
		this.id_cliente=id_cliente;
		this.nombre=nombre;
		this.email=email;
	}



	public int getId_cliente() {
		return id_cliente;
	}



	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
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
	
	
	
	public static Cliente leerCliente() {
		Scanner sc = new Scanner(System.in);

		System.out.println("> Dame id:");
		int id_cliente = sc.nextInt();
		sc.nextLine();

		System.out.println("> Dame nombre:");
		String nombre = sc.nextLine();

		System.out.println("> Dame email:");
		String email = sc.nextLine();
		sc.nextLine();

		

		sc.close();

		return new Cliente(id_cliente, nombre, email);
	}

	public static void mostrarCliente(Cliente c) {
		System.out.println("--------- Cliente ---------");
		System.out.println("> Cliente id_cliente:" + c.getId_cliente());
		System.out.println("> Dame nombre:" + c.getNombre());
		System.out.println("> Dame email:" + c.getEmail());
		
	}
}
