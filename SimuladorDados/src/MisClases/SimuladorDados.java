package MisClases;

import java.util.Random;

public class SimuladorDados {
	
		// Atributos
		private int dado1;
		private int dado2;
		private int dado3;
		private int dado4;
		int numeroIntentos;
		
		// Métodos
		
		//Constructor
		
		SimuladorDados(){
			numeroIntentos=0;
			dado1=1;
			dado2=1;
			dado3=1;
			dado4=1;
		}
		
		private int lanzarDado() {
			Random numeroAleatorio=new Random();
			return numeroAleatorio.nextInt(1,7);
		}
		
		public void lanzarDados() {
			dado1=lanzarDado();
			dado2=lanzarDado();
			dado3=lanzarDado();
			dado4=lanzarDado();
			numeroIntentos++;
		}
		
		public void mostrarUltimajugada() {
			System.out.println("La ultima tirada ha sido:" +dado1 +dado2 +dado3 +dado4);
			System.out.println("La ultima tirada ha sido:" +dado1 +dado2 +dado3 +dado4 +"XXXX");
		}
		
		public int getNumeroIntentos() {
			return numeroIntentos;
		}
		public int sumaUltimaJugada() {
			return dado1+dado2+dado3+dado4;
		}
		public int comprobarResultadoUltimoLanzamiento() {
			//Evaluamos el poker
			if(dado1==dado2 && dado1==dado3 && dado1==dado4)
				return 4;
			//Evaluamos el trio
			if((dado1==dado2 && dado1==dado3) ||//123
			if(dado1==dado2 && dado1==dado4) ||//124
			if(dado2==dado3 && dado2==dado4) ||//234
			if(dado1==dado3 && dado1==dado4)   //134
				)return 3;
			}
		//Evaluamos la doble pareja
		if((dado1==dado2 && dado3==dado4)|| //12 34
		if(dado1==dado3 && dado2==dado4) || //13 24
		if(dado1==dado4 && dado2==dado3)    //14 23
			)return 2;
		
		
		}

		