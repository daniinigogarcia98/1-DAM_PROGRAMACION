
public class EjercicioRectangulo {
	//Atributos de la clase
		public double lado1;
		public double lado2;
		
		
	public EjercicioRectangulo() {
		lado1=10;
		lado2=9;
	}
	public EjercicioRectangulo(double l1,double l2) 
	{
		lado1=l1;
		lado2=l2;
	}
	public double calcularArea() 
	{
		double resultado=lado1*lado2;
		return resultado;
	}
	public double calcularPerimetro() 
	{
		return (2*lado1)+(2*lado2);
	}
}