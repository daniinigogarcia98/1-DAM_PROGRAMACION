
public class AplicacionRectangulo {

	public static void main(String[] args) {
		EjercicioRectangulo r1=new EjercicioRectangulo();
		r1=new EjercicioRectangulo(1,3);
	double area= r1.calcularArea();
		System.out.println("El área es:" +area);
		System.out.println("El Perímetro es:" +r1.calcularPerimetro());

	}

}
