package Conecta4;

import java.util.Scanner;

public class Juego {
	final private int numFilas=6;
	final private int numColumnas=7;
	
	private int turno;
	
	private int numCasillasVacias;
	
	private char [][]tablero;
	
	
	
	
	// Constructor
	void JuegoConecta4(){
		Scanner teclado=new Scanner(System.in);
		boolean salir = false;
		while(salir==false) {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Bienvenido a Conecta 4:");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("1~ Jugar ");
			System.out.println("2~ Salir");
			System.out.println("3~ Verificar Ganador");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			int opcion = teclado.nextInt();
			switch(opcion) {
			case 1:
			 partida();
			 break;
			 
			case 2:
				salir = true;
				break;
			case 3:
				verificaGanador();
				break;
			default:
				System.err.println("No hay mas opciones");
			}
		}
		teclado.close();
	}
	Juego() {
		tablero=new char[numFilas][numColumnas];
		turno=1;
	}
	
	
	void vaciarTablero() {
		for(int i=0;i<numFilas;i++ ) {
			for(int j=0;j<numColumnas;j++ ) {			
				tablero[i][j]=' ';
			}
		}
			
		numCasillasVacias=numFilas*numColumnas;
	}
		
	
	void pintarTablero() {
		for(int i=0;i<numFilas;i++ ) {
			for(int j=0;j<numColumnas;j++ ) {
				System.out.print("|" + tablero[i][j] +"|");
			}
			System.out.println("");   // Para que haga el salto de línea
		}
	}
	

	int[] introducirFicha() {
		if(numCasillasVacias==0)
			return null;
		int i = 0;
		int columna=0;
		Scanner teclado=new Scanner(System.in);
		
		boolean opcionValida=false;
		while(opcionValida==false) {
			System.out.print("Jugador"+" "+turno+"  Introduce el número de columna : ");
			columna=teclado.nextInt();

			// Comprobamos que la columna que ha elegido el usuario está en los límites del tablero
			if(columna>=0 && columna < numColumnas ) {
				/// Recorremos las posiciones de la tabla para esa columna de abajo a arriba
				for(i=numFilas-1 ; i>=0 ; i--) {

					if(tablero[i][columna]==' ') {
						// Hemos encontrado posición vacía
						opcionValida=true;  /// Para salirnos del bucle while
						if(turno==1)
							tablero[i][columna]='X';
						
						else tablero[i][columna]='O';
						
						break;  // Me salgo del bucle for
					}
				}
			}
		}
	
		int[] resultado= {i,columna};
		return resultado;
		
	}
	
	
	void partida() {
		
		/// Vaciamos el tablero
		vaciarTablero();
		
		/// Pintamos el tablero para ver su estado
		pintarTablero();
		
		while ((int[]res=introducirFicha())!=null) {
			// Chequeamos si hay ganador
			
			// cambiamos el turno del jugador
			if(turno==1)
				turno=2;
			else turno=1;
			
			// Decrementamos el número de casillas vacías
			numCasillasVacias--;
			
			pintarTablero();			
		}
		
		
	
	}
	private void verificaGanador() {
	    boolean ganador = false;
	    // Verificamos horizontalmente
	    for (int i = 0; i < numFilas; i++) {
	        for (int j = 0; j < numColumnas; j++) {
	            if (tablero[i][j] != ' ') {
	            }
	        }
	    }
	}

}
