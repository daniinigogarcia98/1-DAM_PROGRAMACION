
public class Aplicacion {

	public static void main(String[] args) {
		Rectangulo r1;

		// declarar en la misma linea
		// Rectangulo r1=new Rectangulo();
		r1 = new Rectangulo();
		// r1=new Rectangulo(1,3);

		// r1.lado1=3;
		// r1.lado2=4;

		// Rectangulo r2;
		// r2=r1;

		double area = r1.calcularArea();
		System.out.println("El área es:" + area);

		System.out.println("El Perímetro es:" + r1.calcularPerimetro());
	}
}
