import java.util.Scanner;

public class MostrarDatosPersonales {
	String nombre;
	String direccion;
	double altura;
	int edad;
	Scanner MostrarDatos=new Scanner(System.in);
	
	public MostrarDatosPersonales() 
	{
		nombre="desconocido";
		direccion="C/SinNombre ,nº1";
		altura=1.75;
		edad=35;
	}
	public MostrarDatosPersonales(String n1,String d1,double a1,int e1) 
	{
		nombre=n1;
		direccion=d1;
		altura=a1;
		edad=e1;
	}
	
}
