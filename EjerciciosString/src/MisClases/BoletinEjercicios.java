package MisClases;

public class BoletinEjercicios {

	// Ejercicio1
	boolean esPalindromoV2(String cadena) {
		return cadena.equals(invertirCadena(cadena));
	}

	boolean esPalindromo(String cadena) {

		int posIzquierda = 0;
		int posDerecha = cadena.length() - 1;

		boolean resultado = true;

		while (posIzquierda < posDerecha && resultado == true) {
			if (cadena.charAt(posIzquierda) != cadena.charAt(posDerecha))
				resultado = false;

			posIzquierda++;
			posDerecha--;
		}

		return resultado;

	}

	// Ejercicio2
	String invertirCadena(String cadena) {

		String resultado = "";

		for (int i = cadena.length() - 1; i >= 0; i--) {
			resultado += cadena.charAt(i);
		}

		return resultado;

	}

	int contarVocales(String cadena) {

		// Recorremos la cadena de izquierda a derecha
		int numVocales = 0;

		// Convertimos la cadena que nos pasen a minúscula para tener que hacer menos
		// comprobaciones
		cadena = cadena.toLowerCase();

		for (int i = 0; i < cadena.length(); i++) {
			char caracter = cadena.charAt(i);
			if (caracter == 'a' || caracter == 'á' || caracter == 'à' || caracter == 'â' || caracter == 'e'
					|| caracter == 'é' || caracter == 'è' || caracter == 'ê' || caracter == 'i' || caracter == 'í'
					|| caracter == 'ì' || caracter == 'î' || caracter == 'o' || caracter == 'ó' || caracter == 'ò'
					|| caracter == 'ô' || caracter == 'u' || caracter == 'ú' || caracter == 'ù' || caracter == 'û'
					|| caracter == 'ü')
				numVocales++;
		}

		return numVocales;
	}

	// Ejercicio3
	String invertirMayusculasMinusculas(String cadena) {

		String resultado = "";

		String cadenaMinuscula = cadena.toLowerCase();
		String cadenaMayuscula = cadena.toUpperCase();

		for (int i = 0; i < cadena.length(); i++) {

			char caracterOriginal = cadena.charAt(i);
			char caracterMinuscula = cadenaMinuscula.charAt(i);
			if (caracterOriginal == caracterMinuscula) {
				// Está en minúscula
				resultado = resultado + cadenaMayuscula.charAt(i);
			} else {
				// Está en mayúscula
				resultado = resultado + cadenaMinuscula.charAt(i);
			}
		}

		return resultado;
	}

	// Ejercicio4
	String quitarEspacios(String cadena) {
		String resultado = "";

		for (int i = 0; i < cadena.length(); i++) {
			char caracterLeido = cadena.charAt(i);
			if (caracterLeido != ' ') {
				resultado = resultado + caracterLeido;
			}
		}
		return resultado;

	}

	// Ejercicio5
	String devolverIniciales(String cadena) {
		String resultado = "";

		for (int i = 0; i < cadena.length(); i++) {
			char caracterLeido = cadena.charAt(i);
			if (caracterLeido != ' ') {
				if (i == 0 || cadena.charAt(i - 1) == ' ') {
					resultado = resultado + caracterLeido + '.';
				}
			}
		}
		return resultado;

	}
	
	/**String devolverInicialesV2(String cadena) {
		String resultado = "";
		boolean anteriorEspacio=true;
		
		for (int i = 0; i < cadena.length(); i++) {
			char caracterLeido = cadena.charAt(i);
			if (caracterLeido != ' ') {
				anteriorEspacio=true;
				
				else {
				 if (caracterLeido==true)
					 resultado = resultado + caracterLeido + '.';
				 anteriorEspacio=false;
				}
				}
			}
		return resultado;

	}**/
	//Ejercicio6
	int contarNumVeces(String cadena,char letra) {
		int contador =0;

		for (int i = 0; i < cadena.length(); i++) {
			char caracterLeido = cadena.charAt(i);
		if(caracterLeido==letra) {}
			contador++;
		

	}
	return contador;
}
	int ContarValores(String cadena,char letra) {
		int contador =0;

		for (int i = 0; i < cadena.length(); i++) {
			char caracterLeido = cadena.charAt(i);
		if(caracterLeido==letra) 
			contador++;
			}
		
		return contador;

	}
	//Ejercicio7
	//Ejercicio8
	int numVecesIncluida(String cadena, String palabra) {
		int contador=0;
		
		int posicion=cadena.indexOf(palabra);
		while(posicion!=-1) {
			contador++;
			posicion=cadena.indexOf(palabra,posicion+1);
			
		}
		return contador;
	}
	//Ejercicio9
		int numMaximosUnos
		(String cadena) {
			int numUnosSeguidos=0;
			int numMaximo=0;
			for (int i = 0; i < cadena.length(); i++) {
				char caracter = cadena.charAt(i);
			if(caracter=='1') {
				numUnosSeguidos++;
				if(numUnosSeguidos > numMaximo)
					numMaximo=numUnosSeguidos;
			} 
			else if(caracter=='0') {
				numUnosSeguidos=0;
			}
			else {
				return -1; //Cadena no valida porque tiene caracter distinto de 0 y 1
			}
				
		}
			
			return numMaximo;
		}
		//Ejercicio10
}