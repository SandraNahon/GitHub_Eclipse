package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	 public static void main(String[] args) {
	
		 /*
		 Escribe un script que lea un numero entero positivo y cuente la cantidad de digitos 
	 */
	
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero"
				+ ": ");
		
		 if (s.hasNextLong()) {
		Long numero =s.nextLong();
		
			 if (numero < 0) {
	
				 numero *= -1;

			 }

		 	if (numero >= 10000000000L){

			System.out.println("El número es igual o más grande que 10,000,000,000!");

		     }else {
		
		
			int digitos = 1;
			
			if(numero >= 10 && numero < 100) {
				digitos = 2;
			}
			
			else if(numero >= 100 && numero < 1000) {
				digitos = 3;
			}
			
			else if(numero >= 1000 && numero < 10000) {
				digitos = 4;
			}
			
			else if(numero >= 10000  && numero < 100000) {
				digitos = 5;
			}
			
			else if(numero >= 100000  && numero < 1000000) {
				digitos = 6;
			}
			
			else if(numero >= 1000000  && numero < 10000000) {
				digitos = 7;
			}
			
			else if(numero >= 10000000  && numero < 100000000) {
				digitos = 8;
			}
			
			else if(numero >= 100000000  && numero < 1000000000) {
				digitos = 9;
			}
			
			else if(numero >= 1000000000  && numero < 10000000000L) {
				digitos = 10;
			}
				
			System.out.println("Dígitos en el número entero: " + digitos);
			
		     }
		
		 
		 }
		 else {

             System.out.println("El número no es un numero entero");

        }

		
	}
}
