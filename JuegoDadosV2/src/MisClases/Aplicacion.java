package MisClases;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimuladorDados juego=new SimuladorDados();
		
		
		juego.lanzarDados();
		juego.mostrarUltimaJugada();
		
		juego.estadisticasTiradas(1000);
		
		
		System.out.println("Número de tiradas hasta póker en esta ocasión : "+ juego.tiradasHastaPoker());
		
		
	}

}
