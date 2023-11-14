package MisClases;

import java.util.Random;

public class SimuladorDados {
	
	// Atributos
	private int dado1;
	private int dado2;
	private int dado3;
	private int dado4;	
	private int numeroIntentos;

	// Métodos
	
	// Constructor
	SimuladorDados(){
		numeroIntentos=0;
		dado1=1;
		dado2=1;
		dado3=1;
		dado4=1;		
	}
	
	private int lanzarDado() {
		Random numeroAleatorio=new Random();
		return numeroAleatorio.nextInt(1, 7);
	}
	
	
	public void lanzarDados() {
		dado1=lanzarDado();
		dado2=lanzarDado();
		dado3=lanzarDado();
		dado4=lanzarDado();
		numeroIntentos++;
	}
	
	public void mostrarUltimaJugada() {
		System.out.println("La última tirada ha sido : " + dado1 + dado2 + dado3 + dado4);
	}
		
	public int getNumeroIntentos() {
		return numeroIntentos;
	}
	
	
	public int sumaUltimaJugada() {
		return dado1+dado2+dado3+dado4;
	}
	
	public int comprobarResultadoUltimoLanzamiento() {
		
		// Evaluamos el póker
		if(dado1==dado2 && dado1==dado3 && dado1==dado4 )    
			return 4;
		
		// Evaluamos el trío
		if(    ( dado1==dado2 && dado1==dado3 )  ||       // 123		
			   ( dado1==dado2 && dado1==dado4 )  ||       // 124
			   ( dado2==dado3 && dado2==dado4 )  ||       // 234
			   ( dado1==dado3 && dado1==dado4 )           // 134			   
		  )
			return 3;

		// Evaluamos la doble pareja
		if(    ( dado1==dado2 && dado3==dado4 )  ||       // 12  34		
			   ( dado1==dado3 && dado2==dado4 )  ||       // 13  24
			   ( dado1==dado4 && dado2==dado3 )           // 14  23
			  )
			return 2;

		// Evaluamos la pareja simple
		if( dado1==dado2 || dado1==dado3 || dado1==dado4 || dado2==dado3 || 
			dado2==dado4 || dado3==dado4)
			return 1;
		
		return 0;
	}
	
	
	public void estadisticasTiradas(int numero) {
		int numeroPoker=0;
		int numeroTrio=0;		
		int numeroParejasDobles=0;		
		int numeroParejas=0;		
		
		for(int i=0;i<numero;i++)
		{
			// lanzamos los dados una vez
			lanzarDados();
			// Comprobamos si hay alguna jugada con puntos
			int resultado=comprobarResultadoUltimoLanzamiento();
			if(resultado==4)
				numeroPoker++;
			else if(resultado==3)
				numeroTrio++;
			else if(resultado==2)
				numeroParejasDobles++;
			else if(resultado==1)
				numeroParejas++;
		
		}

		System.out.println("Número de tiradas total: " + numero);
		System.out.println("------------------------------");			
		System.out.println("Número de póker " + numeroPoker);			
		System.out.println("Número de tríos " + numeroTrio);
		System.out.println("Número de dobles parejas " + numeroParejasDobles);
		System.out.println("Número de parejas simples " + numeroParejas);
		System.out.println("------------------------------");			
		
/*		int i=0;
		while(i<numero)
		{
			...
			...
			i++;
		}
*/

	}
	
	
	public int tiradasHastaPoker()
	{
		int contador=0;
		boolean salir=false;
		while(salir==false)
		{
			contador++;
			
			lanzarDados();
			// Comprobamos si hay alguna jugada con puntos
			if(comprobarResultadoUltimoLanzamiento()==4)
				salir=true;
		}
		
		return contador;
	}

}
