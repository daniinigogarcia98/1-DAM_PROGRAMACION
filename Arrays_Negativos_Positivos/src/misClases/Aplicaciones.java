package misClases;

import java.util.Arrays;

public class Aplicaciones {

	public static void main(String[] args) {
		//array que muestre los numeros negativos y positivos
				//Declaramos una variable de tipo a array a enteros
				int[]arNumeros= {15,12,-8,-20,-4,-4,-12,8,6,-4};
				int numPositivos=0;
				int numNegativos=0;
				//Nos Recorremos las distintas posiciones del array
				for(int i=0; i < arNumeros.length;i ++)
				{
					int valor=arNumeros[i];
					if(valor>=0) {
						numPositivos=numPositivos+valor;
					}else {
						numNegativos=numNegativos+valor;
					}
				}
				int [] resultado= {numNegativos,numPositivos};
				System.out.println("El resultado Positivo del Array es :"+ resultado[0]);
				System.out.println("El resultado Negativo del Array es :"+ resultado[1]);
		}
			
}
