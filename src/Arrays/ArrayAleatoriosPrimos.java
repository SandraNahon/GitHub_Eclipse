package Arrays;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ArrayAleatoriosPrimos {

	public static void main(String[] args) {
		/*
		  Crea un array de números de un tamaño pasado por teclado, el array contendrá números aleatorios primos 
		  entre los números deseados, por último nos indica cual es el mayor de todos.
		 */
	Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce el tamano del array: ");
		int[] numero = new int[s.nextInt()];
		//int[] primo = new int[s.nextInt()];
		
		boolean esPrimo;
		int contador = 0;

		int maximo = Integer.MIN_VALUE;
		int posicionMaximo = 0;	
		
		for(int i = 0; i < numero.length; i++) {
			numero[i] = (int) (Math.random() * 10);
	
			if(numero[i] >=  maximo) {
				maximo = numero[i];
				posicionMaximo = i + 1;
				
			}
			System.out.print(numero[i]);
		}
		
		for (int n : numero) {
            esPrimo = true;
            for (int i = 2; i <= Math.sqrt(n) && esPrimo; i ++) {
            	
                if ((n % i) == 0) {
                    esPrimo = false;
                }
            }
            
            if (esPrimo) {
                numero[contador] = n;
                contador ++;
            }
           
        }
		System.out.println();
		for(int i = 0; i < contador; i++) {
			
			 System.out.print(numero[i]);

				if(numero[i] >=  maximo) {
					maximo = numero[i];
					posicionMaximo = i + 1;
					
				}
		 }
		
		
		System.out.println();
		System.out.println ("El máximo es: " + maximo + " y la posición es: " + (posicionMaximo));

	
	}  
	
//	//metodo para visualizar el array
//	
//	public static void mostrarArray(int numero[]){
//        for(int i=0;i<numero.length;i++){
//            System.out.print(numero[i]);
//        }
//    }
//	//metodo para saber el numro mayor
//	
//			public static int mayor(int lista[]){
//		        int mayor=0;
//		        for(int i=0;i<lista.length;i++){
//		            if(lista[i]>mayor){
//		                mayor=lista[i];
//		            }
//		        }
//				return mayor;
        //}
}  // primos 2 3 5 7 
