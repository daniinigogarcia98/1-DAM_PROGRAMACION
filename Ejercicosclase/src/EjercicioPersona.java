
public class EjercicioPersona {

	public static void main(String[] args) {
		MostrarDatosPersonales p1=new MostrarDatosPersonales();
		MostrarDatosPersonales p2=new MostrarDatosPersonales();
		p1=new MostrarDatosPersonales("Antonio","C/SinNombre, nº1",1.80,40);
		System.out.println("Tu Nombre es:" + p1.nombre);
		System.out.println("Tu Direccion es:" + p1.direccion);
		System.out.println("Tu altura es:" + p1.altura);
		System.out.println("Tu edad es:" + p1.edad);
		
		System.out.println("Datos De la Persona");
		System.out.println("El Nombre es:" + p2.nombre);
		System.out.println("La Direccion es:" + p2.direccion);
		System.out.println("La altura es:" + p2.altura);
		System.out.println("La edad es:" + p2.edad);
		
		
	}
	
}
