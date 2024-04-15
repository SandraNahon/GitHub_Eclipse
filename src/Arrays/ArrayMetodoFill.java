package Arrays;

import java.util.Arrays;

public class ArrayMetodoFill {

	public static void main(String[] args) {
		
		/*
		 * El método fill() nos permite rellenar elementos de un arreglo seleccionando la posición inicial y 
		 * final de los elementos que queremos rellenar con el valor que le pasemos. 
		 * Ten en cuenta que este arreglo modifica el array.
		 */
		 //creo el array
        int num[]=new int[10];
         
        //relleno todo el array con 20
        Arrays.fill(num, 20);
         
        //Relleno desde la posicion 3 hasta el final
        Arrays.fill(num, 3, num.length, -1);
         
        //Muestro el array
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }

	}

}
