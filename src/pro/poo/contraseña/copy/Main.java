package pro.poo.contrase�a.copy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Ahora, crea una clase clase ejecutable:

Crea un array de Passwords con el tama�o que tu le indiques por teclado.
Crea un bucle que cree un objeto para cada posici�n del array.
Indica tambi�n por teclado la longitud de los Passwords (antes de bucle).
Crea otro array de booleanos donde se almacene si el password del array de Password es o no fuerte (usa el bucle anterior).
Al final, muestra la contrase�a y si es o no fuerte (usa el bucle anterior). Usa este simple formato:
contrase�a1 valor_booleano1

contrase�a2 valor_bololeano2
		 */
		
		 Scanner entradaEscaner = new Scanner (System.in); //Creaci�n de un objeto Scanner
		 
		//introducimos el tama�o del array y la longitus
		 System.out.println("Introduce un tama�o para el array");
	     int tamanio=entradaEscaner.nextInt();
	     
	     System.out.println("Introduce la longitud del password");
	     int longitud=entradaEscaner.nextInt();
	     
	   //Creamos los arrays
	    Contrasena listaPassword[]=new Contrasena[tamanio];
        boolean fortalezaPassword[]=new boolean[tamanio];
  
        //Creamos objetos, indicamos si es fuerte y mostramos la contrase�a y su fortaleza.
        for(int i=0;i<listaPassword.length;i++){
            listaPassword[i]=new Contrasena(longitud);
            fortalezaPassword[i]=listaPassword[i].esFuerte();
            System.out.println(listaPassword[i].getContrasena()+" "+fortalezaPassword[i]);
        }
	}

}
