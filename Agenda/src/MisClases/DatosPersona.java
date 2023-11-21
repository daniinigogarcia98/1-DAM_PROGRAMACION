package MisClases;

public class DatosPersona {
	//Atributos
	
private String nombre;
private String apellidos;
private String direccion;
private String numFijo;
private String numMovil;
private String eMail;
	
	//Constructor
	
	DatosPersona(String nom,String ape,String dir,String fijo,String movil,String mail){
		nombre=nom;
		apellidos=ape;
		direccion=dir;
		numFijo=fijo;
		numMovil=movil;
		eMail=mail;
		
	}
	
	public String formatoCorto(){
		String resultado;
		resultado=nombre + " "+ apellidos+" ("+numFijo+" , "+numMovil+")";
		return resultado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String valor) {
		nombre=valor;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNumFijo() {
		return numFijo;
	}

	public void setNumFijo(String numFijo) {
		this.numFijo = numFijo;
	}
	
	public String getNumMovil() {
		return numMovil;
	}

	public void setNumMovil(String numMovil) {
		this.numMovil = numMovil;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
}
