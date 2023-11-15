package JuegoSimon;

import java.util.Random;
import java.util.Scanner;

public class Juego {
	// Creo el objeto teclado con Scanner y que me capture
	// las iteracciones que haga por teclado
	Scanner teclado = new Scanner(System.in);
	static int maxAciertos = 0;// Establezco el número máximos de aciertos
	// en 0 en este caso
	static int aciertos = 0;// Establezco el número de aciertos en 0
	static int tiempoEspera = 1000;// Establecemos una variable llamada tiempoEspera
	// en ella almacenaremos el tiempo que necesitamos de espera que sera 1000
	static boolean salir = false; // Este booleano establecerá si las sentencias
	// de código son verdaderas o falsas
	String secuencia = ""; // Me guarda la secuencia que se genere

	// Constructor
	void JuegoSimon() {
		while (salir == false) {
			System.out.println("-----------------------------------");
			System.out.println("|" + "Elige una de las opciones: " + "|");
			System.out.println("|" + "1 - Nueva Partida" + "|");
			System.out.println("|" + "2 - Modificar tiempo de espera entre valor (actual " + tiempoEspera + ") " + "|");
			System.out.println("");
			System.out.println("|" + "3 - Ver número máximo de acierto en la actual ejecución" + "|");
			System.out.println("");
			System.out.println("|" + "4 - Salir " + "|");
			System.out.println("");
			System.out.println("------------------------------------------------");
			System.out.println("");
			System.out.println("Introduce una opción: ");
			// La variable opcion guardara nuestra opcion dada por teclado
			int opcion = teclado.nextInt();
			// Con el switch estableceremos las opciones del menu
			switch (opcion) {
			case 1:
				// MaxCiertos dependerá de la partida nueva mas el tiempo espera
				// y lo que se digite en el teclado(la secuencia correcta)
				aciertos = 0;
				maxAciertos = jugarPartida(tiempoEspera, teclado);
				break;
			case 2:
				// Por defecto está establecido en 1000
				// aqui cambiamos el tiempo entre 100 a 1000 Ms
				tiempoEspera = modificarTiempoEspera(teclado);
				break;
			case 3:
				// Muestra el numero de aciertos en la ultima partida (si se ha jugado)
				mostrarMaxAciertos(maxAciertos);
			case 4:
				// salimos del juego(nos salimos del bucle while)
				salir = true;
				break;
			default:
				// simulamos que la opcion selecionada no es correcta y devolvemos un texto de
				// error
				System.out.println("Opción Inválida");
			}
		}
	}

	// Métodos
	// Este metodo nos dará una secuencia de números aleatorios con el método Random
	// aqui nos iniciaria la partida recogiendo el tiempo de espera y la respuesta
	// del teclado
	private static int jugarPartida(int tiempoEspera, Scanner teclado) {
		String secuencia = ""; // almacenaremos aqui la secuencia de los numeros
		int aciertos = 0; // almacenaremos los aciertos de la partida
		Random num = new Random();// Establecera numeros de forma aleatoria
		while (true) {
			// Crearemos una variable llamada colores que almacene los números que usaremos
			// en lugar de los colores
			int colores = num.nextInt(1, 4);// establecemos que los números aleatorios
			// esten comprendidos entre 1 y el 4 (1,2,3,4) o (2,1,3,4)
			// para generar la secuencia
			secuencia = secuencia + colores;
			mostrarSecuencia(secuencia, tiempoEspera);
			System.out.println("Introduce la secuencia: ");
			// almacenaremos la secuencia que le demos por teclado
			String respuesta = teclado.next();
			// si la respuesta es igual a la secuencia incrementa el acierto en 1
			if (respuesta.equals(secuencia)) {
				aciertos++;
				System.out.println(" "+" "+" " + "¡Correcto!");
				System.out.println();
				System.out.println();
				System.out.println();
				// establecemos on else para si no es correcta la secuencia nos muestre un
				// mensaje
				// de incorrecto
			} else {
				System.out.println("  " + "¡Incorrecto!");
				break;
			}
			if(aciertos>maxAciertos) {
				maxAciertos=aciertos;
			}
		}
		return aciertos;
	}

	private static void mostrarSecuencia(String secuencia, int tiempoEspera) {
		// Esta función se encarga de mostrar la secuencia al usuario.
		// Muestra cada número de la secuencia durante un tiempo determinado
		// el establecido en tiempoEspera por defecto es 1000
		for (int i = 0; i < secuencia.length(); i++) {
			char caracter = secuencia.charAt(i); 
			System.out.print(caracter);
			try {
				Thread.sleep(tiempoEspera);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("\b");
		}
	}

	// Esta función se encarga de modificar el tiempo de espera
	// Pide al usuario que introduzca el nuevo tiempo de espera y
	// devuelve el valor introducido.
	private static int modificarTiempoEspera(Scanner teclado) {
		System.out.print("Introduce el nuevo tiempo de espera (en milisegundos): ");
		System.out.println();
		return teclado.nextInt();
	}

	// Esta función se encarga de mostrar el número máximo de aciertos
	private static void mostrarMaxAciertos(int maxAciertos) {
		System.out.println("Número máximo de aciertos en la última ejecución: " + maxAciertos);
	}
}