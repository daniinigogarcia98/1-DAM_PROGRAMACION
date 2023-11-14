package MisClases;

import java.util.Random;
import java.util.Scanner;

public class JuegoTiempo {
	
	// Atributos
	private long momentoInicial;
	private int numSegundosMinimo;
	private int numSegundosMaximo;	
	private int numSegundosMargen;	
	
	// Métodos
	
	// Constructor
	JuegoTiempo(){
		numSegundosMinimo=15;
		numSegundosMaximo=30;	
		numSegundosMargen=3;
	}
	
	JuegoTiempo(int numMinimo,int numMaximo,int numMargen){
		numSegundosMinimo=numMinimo;
		numSegundosMaximo=numMaximo;	
		numSegundosMargen=numMargen;
	}
	
	
	public int getNumSegundosMinimo() {
		return numSegundosMinimo;
	}

	public void setNumSegundosMinimo(int numSegundosMinimo) {
		this.numSegundosMinimo = numSegundosMinimo;
	}

	public int getNumSegundosMaximo() {
		return numSegundosMaximo;
	}

	public void setNumSegundosMaximo(int numSegundosMaximo) {
		this.numSegundosMaximo = numSegundosMaximo;
	}

	public int getNumSegundosMargen() {
		return numSegundosMargen;
	}

	public void setNumSegundosMargen(int numSegundosMargen) {
		this.numSegundosMargen = numSegundosMargen;
	}

	
	
	public void setMomentoInicial() {
		momentoInicial=System.currentTimeMillis();
	}
	
	
	public double medirDiferenciaTiempo() {

		long tiempoActual=System.currentTimeMillis();
		
		long diferencia=tiempoActual-momentoInicial;
		
		return diferencia/1000.0;
	}
	
	public void jugarPartida() {

		// Generamos un número aleatorio
		Random numeroAleatorio=new Random();
		int numSegundos=numeroAleatorio.nextInt(numSegundosMinimo,numSegundosMaximo+1);
		
		System.out.println("El número de segundos a adivinar es : " + numSegundos);
		System.out.println("Pulsa enter cuando quieras que comience la cuenta");

		Scanner teclado=new Scanner(System.in);
		teclado.nextLine();
		// Empezamos a contar el tiempo desde ese momento
		setMomentoInicial();
		
		System.out.println("Pulsa enter cuando creas que han pasado los segundos");		
		teclado.nextLine();
		
		double tiempoEnSegundos=medirDiferenciaTiempo();
		
		// Calculamos la diferencia de tiempo que ha habido
		double diferencia= tiempoEnSegundos - numSegundos;
		
		// Si el usuario se ha quedado corto (diferencia negativa) la pasamos a positivo
		if(diferencia < 0)
			diferencia=-diferencia;
		
		if(diferencia < 1)
			System.out.println("Enhorabuena has ganado. Calculaste " + tiempoEnSegundos + ". La diferencia ha sido:" + diferencia );
		else 
			System.out.println("Lo siento has perdido. Calculaste " + tiempoEnSegundos + ". La diferencia ha sido:" + diferencia );
		
	}
	
	public void jugarPartidaV2() {

		// Generamos un número aleatorio
		Random numeroAleatorio=new Random();
		int numSegundos=numeroAleatorio.nextInt(numSegundosMinimo,numSegundosMaximo+1);

		int margenJuego=numSegundosMargen;
		
		boolean salir=false;
		while (salir==false)
		{
			System.out.println("El número de segundos a adivinar es : " + numSegundos);
			System.out.println("Estás jugando con un margen de : " + margenJuego);			
			System.out.println("Pulsa enter cuando quieras que comience la cuenta");

			Scanner teclado=new Scanner(System.in);
			teclado.nextLine();
			// Empezamos a contar el tiempo desde ese momento
			setMomentoInicial();
		
			System.out.println("Pulsa enter cuando creas que han pasado los segundos");		
			teclado.nextLine();
		
			double tiempoEnSegundos=medirDiferenciaTiempo();
		
			// Calculamos la diferencia de tiempo que ha habido
			double diferencia= tiempoEnSegundos - numSegundos;
		
			// Si el usuario se ha quedado corto (diferencia negativa) la pasamos a positivo
			if(diferencia < 0)
				diferencia=-diferencia;
		
			if(diferencia < 1)
			{
				System.out.println("Enhorabuena has ganado. Calculaste " + tiempoEnSegundos + ". La diferencia ha sido:" + diferencia );
				salir=true;
			}
			else
			{
				if(diferencia > margenJuego)
				{
					System.out.println("Lo siento has perdido. Calculaste " + tiempoEnSegundos + ". La diferencia ha sido:" + diferencia );
					salir=true;
				}
				else
				{
					System.out.println("Te has quedado dentro del margen. Tienes una nueva posibilidad");
					margenJuego--;
				}
			}
		}
	}
	

}
