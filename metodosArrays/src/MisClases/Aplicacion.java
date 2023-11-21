package MisClases;

public class Aplicacion {

	public static void main(String[] args) {
		String cadena="Hola";
		//nos devuelve un char(carácter) en un array
		//char []ar=cadena.toCharArray();
		//ar[0]='B';
		//System.out.println(ar);
		System.out.println(sustitucion(cadena,'a'));
		//crear array apartir del array de caracteres anterior
	
		//metodo que reciba una cadena y va a recibir un caracter y devolver un string
		
	}
	public static String sustitucion(String cadena,char caracter){
		char[]ar=cadena.toCharArray();
		for(int i=0;i<ar.length;i++) {
			if(caracter==ar[i])
				ar[i]='-';
		}
		
		return new String(ar);
	}

}
