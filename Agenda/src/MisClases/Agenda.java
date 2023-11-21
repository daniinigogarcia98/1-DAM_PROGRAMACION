package MisClases;

import java.util.Arrays;
import java.util.Scanner;

public class Agenda {
	//Atributos
	DatosPersona[] agenda;
	Scanner teclado;
	Agenda(int numEntradas){
		agenda=new DatosPersona[numEntradas];
		teclado=new Scanner(System.in);
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
		if(encontrado==false) {
			//He encontrado el elemento
			//Le pedimos al usuario los datos del nuevo Registro
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
			return i;
		}
		else {
			//La agenda estaba llena
			return-1;
			
		}
		
		
		
	}
	
	public void mostrarEntradasAgenda(){
		System.out.println("**********************************");
		for(int i=0;i<agenda.length;i++) {
			if(agenda[i]!=null) {
				//Muestro los datos de la entrada
				
				System.out.println(i + " - " + agenda[i].formatoCorto());
				
			}
		}
		System.out.println("**********************************");
	}
	
	
	public int borrarEntrada() {
		int entradaBorrada=-1;
		System.out.println("Introduce el índice de la entrada a borrar");
		int numero=teclado.nextInt();
		teclado.nextLine();
		if(agenda[numero]!=null) {
			agenda[numero]=null;
			entradaBorrada=numero;
			System.out.println("La entrada "+ numero + "se borró correctamente");
		}
		else System.err.println("La entrada seleccionada no tiene datos");
		
		
		return entradaBorrada;
	}
	
	public int modificarEntrada() {
		int entradaModificada =-1;
		System.out.println("Introduce el índice de la entrada a Modificar");
		int numero=teclado.nextInt();
		teclado.nextLine();
		if(agenda[numero]!=null) {
			System.out.println("Introduce el Nombre: ("+ agenda[numero].getNombre()+")");
			String nombre=teclado.nextLine();
			if(!nombre.isEmpty())
			  agenda[numero].setNombre(nombre);
			System.out.println("Introduce Los Apellidos: ("+ agenda[numero].getApellidos()+")");
			String apellidos=teclado.nextLine();
			if(!apellidos.isEmpty())
				  agenda[numero].setApellidos(apellidos);;
			System.out.println("Introduce la Dirección: ("+ agenda[numero].getDireccion()+")");
			String direccion=teclado.nextLine();
			if(!direccion.isEmpty())
				  agenda[numero].setDireccion(direccion);;
			System.out.println("Introduce el NúmeroFijo: ("+ agenda[numero].getNumFijo()+")");
			String fijo=teclado.nextLine();
			if(!fijo.isEmpty())
				  agenda[numero].setNumFijo(fijo);
			System.out.println("Introduce el NúmeroMóvil: ("+ agenda[numero].getNumMovil()+")");
			String movil=teclado.nextLine();
			if(!movil.isEmpty())
				  agenda[numero].setNumMovil(movil);
			System.out.println("Introduce el Email:("+ agenda[numero].geteMail()+")");
			String eMail=teclado.nextLine();
			if(!eMail.isEmpty())
				  agenda[numero].seteMail(eMail);
		}
		else System.err.println("La entrada seleccionada no tiene datos");
		
		
		return entradaModificada;
	}
	public void buscarAgenda() {
		System.out.println("Introduce el término de búsqueda :");
		String termino=teclado.nextLine();
		termino=termino.toUpperCase();
		for(int i=0;i<agenda.length;i++) {
			if(agenda[i]!=null) {
				boolean deboMostrar=false;
				if(agenda[i].getNombre().toUpperCase().contains(termino))
					deboMostrar=true;
				else if(agenda[i].getNumMovil().toUpperCase().contains(termino))
					deboMostrar=true;
				else if(agenda[i].getNumFijo().toUpperCase().contains(termino))
					deboMostrar=true;
				else if(agenda[i].geteMail().toUpperCase().contains(termino))
					deboMostrar=true;
				
				if(deboMostrar==true)
				System.out.println(i + " - " + agenda[i].formatoCorto());
			}
		}
	}
	public void compactarAgenda() {
		DatosPersona[] arAuxiliar=new DatosPersona[agenda.length];
		int j=0;
		for(int i=0;i<agenda.length;i++) {
			if(agenda[i]!=null) {
				arAuxiliar[j]=agenda[i];
				j++;
			}
		}
		agenda=arAuxiliar;
	}
	//Métodos
}
