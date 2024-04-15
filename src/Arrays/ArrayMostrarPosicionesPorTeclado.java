package Arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayMostrarPosicionesPorTeclado {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		//Crea un array de números de un tamaño pasado por teclado, el array contendrá números aleatorios entre 1 y 300 
		
		System.out.println("Introduce el tamano del array: ");
		int Array[] = new int[s.nextInt()];
		int ultimoDigito;
		
		for(int i = 0; i < Array.length; i++) {
			Array[i] = (int) (Math.random() * 300);
		}
		
		//mostrar aquellos números que acaben en un dígito que nosotros le indiquemos por teclado
		
		do{
            System.out.println("Introduce numero entre 0 y 9");
            ultimoDigito = s2.nextInt();
            
           // int Array2[] = new int[Array.length];
//    		
//    		for(int i = 0; i < Array2.length; i++) {
//    			if(Array2[i] == ultimoDigito ) {
//    				System.out.println("El numero " + Array2[i] + " acaba en el numero deseado");
//    			}
//    		}
        }while(!(ultimoDigito>=0 && ultimoDigito<=9));
		
		//creamos un nuevo array para almacenarlo
		
		int Array2[]=numTerminadosEn(Array, ultimoDigito);
		
		mostrarArray(Array2);
	
		
	}

	private static int[] numTerminadosEn(int[] array, int ultimoDigito) {
		int Array2[] = new int[array.length];
		int num = 0;
		
		for(int i = 0; i > Array2.length; i++) {
			num=array[i]-(array[i]/10*10);
			if(num == ultimoDigito) {
			Array2[i] = array[i];
			}
			//System.out.println("El numero "+Array2[i]+" acaba en el numero deseado");
		}
		
		return Array2;
	}
	
	public static void mostrarArray(int lista[]){
		for(int i=0;i<lista.length;i++){
            //No incluimos las posiciones que tengan un 0
            if(lista[i]!=0){
                System.out.println("El numero "+lista[i]+" acaba en el numero deseado");
            }
        }
    }

}
