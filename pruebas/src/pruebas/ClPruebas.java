package pruebas;


import java.util.Random;


public class ClPruebas 
{

	public static void main(String[] args) 
	{
		
		// Opción 1 de generar número aleatorio
/*		for (int i=0;i<10;i++)
		{
			int numero=  (int) ((Math.random() * 6)+1);
			System.out.println(numero);
		}
*/		
		
		// Opción 2 de generar números aleatorios
		
		int numTiradas=1000000;
		Random r1; 
		r1= new Random();
		int numCaras=0;
		int numCruz=0;		
		
		for(int i=0 ; i< numTiradas; i++)
		{
			// Moneda sin trucar
/*			int resultado=r1.nextInt(2);
			if(resultado==0)
				numCaras++;
			else 
				numCruz++; */
			
			// Moneda trucada 51% cara 49% cruz
			int resultado=r1.nextInt(100);
			if(resultado<=50)
				numCaras++;
			else 
				numCruz++;
		}
		
		double porcentajeCara=((double)numCaras / numTiradas) * 100;
		double porcentajeCruz=((double)numCruz / numTiradas) * 100;
		
		System.out.println("El número de caras es :" + numCaras);
		System.out.println("El número de cruces :" + numCruz);		
		System.out.println("El porcentaje de caras es :" + porcentajeCara);
		System.out.println("El porcentaje de cruces :" + porcentajeCruz);		
	

	}

}
