package entities;

import java.util.Scanner;

public class Usuario {
	private int idusuario;
	private String nombreusuario;
	private String password;
    private String rol;
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Usuario(int idusuario, String nombreusuario, String password, String rol) {
		super();
		this.idusuario = idusuario;
		this.nombreusuario = nombreusuario;
		this.password = password;
		this.rol = rol;
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public String getNombreusuario() {
		return nombreusuario;
	}
	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
    
	
	
	
	public static Usuario leerUsuario() {
		Scanner sc = new Scanner(System.in);

		System.out.println("> Dame idusuario:");
		int idusuario = sc.nextInt();
		sc.nextLine();

		System.out.println("> Dame nombreusuario:");
		String nombreusuario = sc.nextLine();

		System.out.println("> Dame password:");
		String password = sc.nextLine();
		sc.nextLine();
		
		System.out.println("> Dame rol:");
		String rol = sc.nextLine();
		sc.nextLine();

		System.out.println("Dame fecha de entrada");

		sc.close();

		return new Usuario(idusuario, nombreusuario, password, rol);
	}

	public static void mostrarUsuario(Usuario u) {
		System.out.println("--------- Cliente ---------");
		System.out.println("> Cliente idusuario:" + u.getIdusuario());
		System.out.println("> Dame nombreusuario:" + u.getIdusuario());
		System.out.println("> Dame password:" + u.getPassword());
		System.out.println("> Dame rol:" + u.getRol());
		
	}
    

}
