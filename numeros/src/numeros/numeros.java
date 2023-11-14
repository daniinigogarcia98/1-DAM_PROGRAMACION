package numeros;

import java.util.Scanner;

public class numeros {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		int resultado;
		float Resultadodecimal;
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Escribe el primer número");
		numero1=teclado.nextInt();
		System.out.println("Escribe el segundo número");
		numero2=teclado.nextInt();
		//Mostramos el menu de opciones al usuario
		System.out.println("1-Sumar");
		System.out.println("2-Restar");
		System.out.println("3-Multiplicar");
		System.out.println("4-Division entera");
		System.out.println("5-Division decimal");
		System.out.println("6-Resto");
		//simplificar menu:
		//System.out.println("1-sumar \n 2-Restar");
		// (/n) para separar opciones
		System.out.println("Selecciona una opcion");
		int opcionElegida;
		opcionElegida=teclado.nextInt();
		//switch para comparar
		switch(opcionElegida)
		{
		case 1:
			//suma
			resultado=numero1+numero2;
			System.out.println("El resultado de la suma es:"+ resultado);
		break;
		case 2:
			//resta
			resultado=numero1+numero2;
			System.out.println("El resultado de la suma es:"+ resultado);
		break;
		case 3:
			//Multiplicacion
			resultado=numero1*numero2;
			System.out.println("El Producto es:"+ resultado);
		break;
		default:
			System.out.println("La Opcion no es Correcta:");
			break;
		}
		if(opcionElegida==1) 
		{
			//suma
			resultado=numero1+numero2;
			System.out.println("El resultado de la suma es:"+ resultado);
		}
		
		else if(opcionElegida==2) 
		{
			//Resta
			resultado=numero1-numero2;
			System.out.println("El resultado de la Resta es:"+ resultado);
		}
		
		else if(opcionElegida==3) 
		{
			//Multiplicacion
			resultado=numero1*numero2;
			System.out.println("El Producto es:"+ resultado);
		}
		
		else if(opcionElegida==4) 
		{
			{
				
			}
			//Division Entera
			resultado=numero1/numero2;
			System.out.println("La Division Entera es:"+ resultado);
		}
		else if(opcionElegida==5) 
		{
			//Division Decimal
			Resultadodecimal=((float) numero1/numero2);
			System.out.println("La Division Decimal es:"+ Resultadodecimal);
		}
		else if(opcionElegida==6) 
		{
			//Resto
			resultado=numero1%numero2;
			System.out.println("El Resto de la division es:"+ resultado);
		}
		else  
		{
			System.out.println("La Opcion no es Correcta:");
		}
		//cierre de teclado porque no se usa mas
		teclado.close();
	}

}
