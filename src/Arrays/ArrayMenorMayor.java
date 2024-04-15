package Arrays;

import java.util.Scanner;

public class ArrayMenorMayor {

	public static void main(String[] args) {
		/*
		 Escribe un programa que pida 10 números por teclado, los almacene en un array y que luego muestre el máximo valor, 
          el mínimo y las posiciones que ocupan en el array.
		 */
		Scanner s = new Scanner(System.in);
		int[] numero = new int[10];
		
		//ponemos los atributos para las posiciones
		int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int posicionMaximo = 0;
        int posicionMinimo = 0;
		
		System.out.println("Introduce 10 numeros ");
		
		// hacemos un for para las localizaciones del array
		for(int i = 0; i < numero.length; i++) {
			numero[i] = s.nextInt();
			
			if(numero[i] <=  minimo) {
				minimo = numero[i];
				posicionMinimo = i + 1;
			}
			if(numero[i] >=  maximo) {
				maximo = numero[i];
				posicionMaximo = i + 1;
			}
			
			
		}
		
		 System.out.println ("El máximo es: " + maximo + " y la posición es: " + (posicionMaximo));
	     System.out.println ("El mínimo es: " + minimo + " y la posición es: " + (posicionMinimo));
	}

}
