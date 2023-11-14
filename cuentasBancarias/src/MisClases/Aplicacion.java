package MisClases;

public class Aplicacion {

	public static void main(String[] args) {
		
		Cuenta cu1;
		cu1=new Cuenta(11133,"Antonio Rojas","7613688B");
		cu1.MostrarDatosCuenta();
		//int retorno=
		cu1.hacerIngreso(500);
		//if(retorno == 1)
			//System.out.println("El ingreso se realidado Correctamente");
		//else System.out.println("Hubo Problemas al Hacer el Ingreso");
		///en caso de intentar hacer un ingreso negativo
		cu1.MostrarDatosCuenta();
		//retorno=cu1.hacerIngreso(-100);
		//if(retorno == 1)
			//System.out.println("El ingreso se realidado Correctamente");
		//else System.out.println("Hubo Problemas al Hacer el Ingreso");
		Cuenta cu2;
		cu2=new Cuenta(11144,"Marco Tulio","7613688B");
		cu2.MostrarDatosCuenta();
		cu1.hacerTranferencia(300, cu2);
		cu1.MostrarDatosCuenta();
		cu2.MostrarDatosCuenta();
	}

}
