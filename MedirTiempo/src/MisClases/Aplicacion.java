package MisClases;

public class Aplicacion {

	public static void main(String[] args) {

		MedidorTiempos crono1 = new MedidorTiempos();

		for (int i = 0; i < 100; i++) {
			System.out.println("Hola");
		}
		// hace lo mismo que el bucle for
		// int i=0;
		// while(i<100)
		// {
		// System.out.println("Hola");
		// i++;
		// }

		long tiempo = crono1.tomarMedida();
		System.out.println("El tiempo empleado en hacer el bucle es;" + tiempo);

		// establezco el punto de medida inicial
		crono1.setPuntoReferencia();
		for (int i = 0; i < 10000; i++) {
			System.out.println("Hola");
		}
		tiempo = crono1.tomarMedida();
		System.out.println(
				"El tiempo empleado en segundos en hacer el bucle es;" + crono1.devolverUltimaMedidaSegundos());
	}

}
