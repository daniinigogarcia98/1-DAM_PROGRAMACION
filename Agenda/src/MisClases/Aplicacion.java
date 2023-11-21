package MisClases;

import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		Agenda miAgenda=new Agenda(100);
		
		Scanner teclado=new Scanner(System.in);
		boolean salir=false;
		
		while(salir==false) {
			System.out.println("1- Mostrar Entradas");
			System.out.println("2- Añadir Entrada");
			System.out.println("3- Modificar Entrada");
			System.out.println("4- Borrar Entrada");
			System.out.println("5- Buscar Agenda");
			System.out.println("6- Compactar Agenda");
			System.out.println("9- Salir");
			//String opcion=teclado.nextLine();
			int opcion=teclado.nextInt();
			switch(opcion) {
			case 1:
				miAgenda.mostrarEntradasAgenda();
				break;
			case 2:
				miAgenda.insertarEntrada();
				break;
			case 3:
				miAgenda.modificarEntrada();
				break;
			case 4:
				miAgenda.borrarEntrada();
				break;
			case 5:
				miAgenda.buscarAgenda();
				break;
			case 6:
				miAgenda.compactarAgenda();
				break;
			default:
				salir=true;
				break;
			}
			//if(opcion.equals("1")) {
				//miAgenda.mostrarEntradasAgenda();
			//}
			
			//if(opcion.equals("2")) {
				//miAgenda.insertarEntrada();
			//}
			//if(opcion.equals("3")) {
				//miAgenda.modificarEntrada();
			//}
			//if(opcion.equals("4")) {
				//miAgenda.borrarEntrada();
			//}
			//if(opcion.equals("5")) {
				//miAgenda.buscarAgenda();
			//}
			//if(opcion.equals("6")) {
			//miAgenda.compactarAgenda();
		//}
			//if(opcion.equals("9")) {
				//salir=true;
			//}
		}
		teclado.close();
	}
}
