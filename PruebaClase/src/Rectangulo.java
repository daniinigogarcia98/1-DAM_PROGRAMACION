
public class Rectangulo {
	//Atributos de la clase
	public double lado1;
	public double lado2;
	
	
	//Métodos de la clase
	
	//Constructor
	
	public Rectangulo() 
	{
		lado1=7;
		lado2=3;
	}
	
	public Rectangulo(double l1,double l2) 
	{
		lado1=l1;
		lado2=l2;
	}
	public double calcularArea() 
	{
		double resultado=lado1*lado2;
		return resultado;
		//alternativa return lado1*lado2;	
	}
	public double calcularPerimetro() 
	{
		return(2*lado1) + (2*lado2);
	}
}
