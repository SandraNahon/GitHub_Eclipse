package Arrays;

import java.util.Random;

public class ArrayPrimos {

	public static void main(String[] args) {
		/*
		 Escribe un programa que genere 20 números enteros aleatorios entre 0 y 99 y
		  los almacene en un array.
   El programa debe crear un nuevo array con los números primos que haya entre esos 
   20 números. Luego debe mostrar los dos arrays.
  
		 */
		// Random rnd = new Random(); //aleatorio
		// int aleatorio = rnd.nextInt(n); produce un aleatorio entre 0 y 99
		
		int[] numero = new int[20];
		int[] primo = new int[20];
		boolean esPrimo;
		int contador = 0;
		
		//usamos un for para generar de forma aleatoria
		System.out.println("Generamos 20 numeros aleatorios: ");
		for(int i = 0; i < numero.length; i++) {
			numero[i] = (int) (Math.random() * 99); //(int) (Math.random() * n) + 1;
		}
		
		//revisamos si un numero es primo o no
		 for (int n : numero) {
	            esPrimo = true;
	            for (int i = 2; i <= Math.sqrt(n) && esPrimo; i ++) {
	                if ((n % i) == 0) {
	                    esPrimo = false;
	                }
	            }
	            if (esPrimo) {
	                primo[contador] = n;
	                contador ++;
	            }
	            System.out.println("Los numeros generado son: " + n);
	        }
		 
		 
		 for(int i = 0; i < contador; i++) {
			 System.out.println("Los numeros primos de la secuencia son: " + primo[i]);
		 }
		 System.out.println();

	}

}
