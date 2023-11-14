package MisClases;

public class MedidorTiempos {
	// Atributos
	long puntoReferencia;
	long ultimaMedida;

	// métodos
	// Constructor
	MedidorTiempos() {
		ultimaMedida = 0;
		puntoReferencia = System.currentTimeMillis();
	}

	void setPuntoReferencia() {
		puntoReferencia = System.currentTimeMillis();
	}

	long tomarMedida() {
		long tiempo;
		tiempo = System.currentTimeMillis() - puntoReferencia;

		ultimaMedida = tiempo;
		return tiempo;
	}

	long devolverUltimaMedida() {
		return ultimaMedida;
	}

	double devolverUltimaMedidaSegundos() {
		// ojo con el detalle de la division entara.tiene que ser 1000.0
		// forma de hacer la division
		// return ((double)ultimaMedida) / 1000.0;
		return ultimaMedida / 1000.0;
	}
}
