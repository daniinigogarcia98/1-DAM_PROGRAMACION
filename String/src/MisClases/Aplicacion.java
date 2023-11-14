package MisClases;

public class Aplicacion {

	public static void main(String[] args) {
		String cadena="Hola mundo";
		System.out.println(cadena);
		//toUpperCase convierte en mayusculas
		System.out.println(cadena.toUpperCase());
		//toLowerCase convierte en minusculas
		System.out.println(cadena.toLowerCase());
		//substring Devuelve una subcadena de la cadena original que abarca
		//desde posInicial (incluida) hasta el final.
		System.out.println(cadena.substring(5));
		//substring Devuelve una subcadena de la cadena original
		//que abarca desde posInicial (incluida) hasta posFinal (no incluido).
		System.out.println(cadena.substring(5,7));
		System.out.println("La longitud de la cadena es:"+cadena.length());//muestra la longitud
		
		//chartAT Devuelve el carácter de la cadena que ocupa la posición
		//especificada por el parámetro pasado
		for(int i=0; i < cadena.length(); i++)
			System.out.println(cadena.charAt(i));//devuelve la posicion de la cadena de derecha a izquierda
		
		for(int i= cadena.length()-1; i>=0; i--)
			System.out.println(cadena.charAt(i));//devuelve la posicion de la cadena de izquierda a derecha
		
		String cadena2="Hola mundo";
		String cadena3=new String("Hola mundo");
		
		if(cadena==cadena2)
		System.out.println("La direccion del objeto es el mismo");
		else System.out.println("La direccion del objeto es Distinto");
		
		if(cadena==cadena3) // compara direccion del objeto
			System.out.println("La direccion del objeto es el mismo");
			else System.out.println("La direccion del objeto es Distinto");
		
		if(cadena.equals(cadena3)) // Compara si la cadena es igual a otra cadena (se diferencian
			//mayúsculas y minúsculas)
			System.out.println("El Contenido del objeto es el mismo");
			else System.out.println("El Contenido del objeto es Distinto");
	}

}
