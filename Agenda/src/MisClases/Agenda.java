package MisClases;

import java.util.Scanner;

public class Agenda {
	//Atributos
	DatosPersona[] agenda;
	
	Agenda(int numEntradas){
		agenda=new DatosPersona[numEntradas];
	}
	
	
	int insertarEntrada() {
		boolean encontrado=false;
		int i=0;
		// Buscamos el primer hueco vacio en la Agenda
		for(i=0; i <agenda.length;i++) {
			if(agenda[i]==null) {
				break;
			}
		}
		if(encontrado==true) {
			//He encontrado el elemento
			//Le pedimos al usuario los datos del nuevo Registro
			Scanner teclado=new Scanner(System.in);
			System.out.println("Introduce el Nombre: ");
			String nombre=teclado.nextLine();
			System.out.println("Introduce Los Apellidos: ");
			String apellidos=teclado.nextLine();
			System.out.println("Introduce la Dirección: ");
			String direccion=teclado.nextLine();
			System.out.println("Introduce el NúmeroFijo: ");
			String fijo=teclado.nextLine();
			System.out.println("Introduce el NúmeroMóvil: ");
			String movil=teclado.nextLine();
			System.out.println("Introduce el Email: ");
			String eMail=teclado.nextLine();
			
			//Creamos un objeto de la clase DatosPersona
			
			DatosPersona nuevoRegistro=new DatosPersona(nombre,apellidos,direccion,fijo,movil,eMail);
		
			//Inserto el objeto en la posición Buscada en la agenda
			agenda[i]=nuevoRegistro;
			
		}
		else {
			//La agenda estaba llena
			return-1;
			
		}
	}
	
	
	
	//Método
}
