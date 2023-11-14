package MisClases;

import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		
		boolean salir=false;
		Scanner teclado=new Scanner(System.in);
		
		Juego miJuego=new Juego();
		
		while(salir==false)
		{
			System.out.println("Tu saldo actual es : " + miJuego.getSaldo());
			System.out.println("¿Qué quieres hacer?");
			System.out.println("1 - Recargar saldo");			
			System.out.println("2 - Hacer apuesta");
			System.out.println("3 - Salir");
			int opcion=teclado.nextInt();
			
			if(opcion==1)
			{
				// Recargar saldo
				System.out.println("¿Cuánto quieres recargar?");
				int cantidad=teclado.nextInt();
				miJuego.incrementarSaldo(cantidad);
			}
			else if(opcion==2)
			{
				System.out.println("¿Cuánto quieres apostar?");
				int cantidad=teclado.nextInt();
				if(miJuego.hacerApuesta(cantidad)==-1)
					System.out.println("No tienes saldo suficiente");					
			}
			else salir=true;
		}
		
		
		// Cerramos el objeto de la clase Scanner
		teclado.close();
	}

}
