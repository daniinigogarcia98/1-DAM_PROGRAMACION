package MisClases;

import java.util.Random;

public class Juego {
	
	// Atributos
	int saldo;
	int dado1;
	int dado2;
	int dado3;
	
	// Métodos
	
	void incrementarSaldo(int cantidad) {
		if(cantidad > 0)
			saldo=saldo+cantidad;
	}
	
	int getSaldo() {
		return saldo;
	}

	
	void lanzarDados() {
		
		Random numAleatorio=new Random();
		dado1=numAleatorio.nextInt(1,7);
		dado2=numAleatorio.nextInt(1,7);
		dado3=numAleatorio.nextInt(1,7);
	}
	
	int comprobarResultado(){
		
		int resultado;
		// Comprobación de los valores que tienen los dados

		// Comprobamos si los tres dados son iguales
		if ((dado1==dado2) && (dado2==dado3))
			resultado=10;
		// Comprobamos si hay dos dados iguales
		else if ((dado1==dado2) || (dado2==dado3) || (dado1==dado3))
			resultado=2;
		else resultado=0;
		
		return resultado;
	}
	
	int hacerApuesta(int cantidad) {
		int retorno=1;
		
		if(saldo>=cantidad) {
			
			saldo = saldo - cantidad;			
			
			// Lanzamos los dados
			lanzarDados();
			
			System.out.println("Han salido los valores :" + dado1 + dado2 + dado3);
			
			// Comprobamos el resultado
			int resultado=comprobarResultado();
			if(resultado==0)
				System.out.println("Lo sentimos, perdiste la apuesta");
			else if(resultado==2)
				System.out.println("Hay dos valores iguales. Has ganado " + resultado*cantidad);
			else System.out.println("Has hecho pleno!!!. Has ganado " + resultado*cantidad); 
 
			// Actualizamos el saldo
			saldo=saldo + (resultado*cantidad);
		}
		else retorno=-1;
		
		return retorno;
	}
	
	
	
}
