package entitities;

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
    
    

}
