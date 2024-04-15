package pro.poo.contraseña.copy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Ahora, crea una clase clase ejecutable:

Crea un array de Passwords con el tamaño que tu le indiques por teclado.
Crea un bucle que cree un objeto para cada posición del array.
Indica también por teclado la longitud de los Passwords (antes de bucle).
Crea otro array de booleanos donde se almacene si el password del array de Password es o no fuerte (usa el bucle anterior).
Al final, muestra la contraseña y si es o no fuerte (usa el bucle anterior). Usa este simple formato:
contraseña1 valor_booleano1

contraseña2 valor_bololeano2
		 */
		
		 Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
		 
		//introducimos el tamaño del array y la longitus
		 System.out.println("Introduce un tamaño para el array");
	     int tamanio=entradaEscaner.nextInt();
	     
	     System.out.println("Introduce la longitud del password");
	     int longitud=entradaEscaner.nextInt();
	     
	   //Creamos los arrays
	    Contrasena listaPassword[]=new Contrasena[tamanio];
        boolean fortalezaPassword[]=new boolean[tamanio];
  
        //Creamos objetos, indicamos si es fuerte y mostramos la contraseña y su fortaleza.
        for(int i=0;i<listaPassword.length;i++){
            listaPassword[i]=new Contrasena(longitud);
            fortalezaPassword[i]=listaPassword[i].esFuerte();
            System.out.println(listaPassword[i].getContrasena()+" "+fortalezaPassword[i]);
        }
	}

}
