package MisClases;

public class Cuenta {
	///Atributos de La clase
	int idCuenta;
	String titular;
	String dni;
	double saldo;
	
	
	///Metodos
	
	///constructor
	
	Cuenta(int id , String tit, String dniTitular)
	{
		idCuenta = id;
		titular = tit;
		dni = dniTitular;
		saldo = 0;
	}
	
	double obtenerSaldo()
	{
		return saldo;
	}
	///metodo ingreso
	int hacerIngreso(double cantidad)
	{
		if(cantidad>0) {
		saldo = saldo + cantidad;
		return 1;
		///resumen de saldo = saldo + cantidad
		///saldo +=cantidad;
		}
		else return -1; //Ha habido un error al hacer el ingreso
	}
	///metodo Reintegro
	int hacerReintegro(double cantidad)
	{
		if(cantidad > saldo) {
			return -1;///saldo Insuficiente
		}
		else 
		{
			saldo = saldo - cantidad;
			return 1;
		}
	}
	
	///Metodo Mostrar los datos de la cuenta
	void MostrarDatosCuenta() 
	{
		System.out.println("El id de la cuenta es:"+ idCuenta);
		System.out.println("Su titular es:"+titular);
		System.out.println("El saldo actual de la cuenta es:"+saldo);
		System.out.println("");
	}
	//Metodo Transferencia
	
	int hacerTranferencia(double cantidad,Cuenta cuentaDestino)
	{
		//compruebo que tengo saldo suficiente
		if(saldo >= cantidad)
		{
			//disminuyo el saldo de la cuenta origen
			saldo = saldo -cantidad;
			//incremento el saldo de la cuenta destino
			cuentaDestino.hacerIngreso(cantidad);
			return 1;
		}
		else return -1; //Hay un problema y no se ha podido hacer
	}
}
