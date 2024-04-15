package Arrays;

import java.util.Arrays;

public class ArrayInvertirDatos {

	public static void main(String[] args) {
		/*
		 *  Dado un array de números de 5 posiciones con los siguiente valores {1,2,3,4,5}, 
		 *  guardar los valores de este array en otro array distinto pero con los valores 
		 *  invertidos, es decir, que el segundo array debera tener los valores {5,4,3,2,1}.
		 */
		
		//int array[] = new int[5];
		int array[] = {1,2,3,4,5};
		int array3[] = {1,8,5,6,7};
		int array2[];
		array2 = array;
		
		for(int j = 0; j < array.length; j++) {
			System.out.print(array[j]);
		}
		
		for(int i = 0; i < array2.length/2; i++) {
			
		int j = array2.length -i -1;
		int a = array2[i];
		int b = array2[j];
		array2[i] = b;
		array2[j] = a;
		System.out.println();
		}
		
		for (int i = 0; i < array.length; i++) {
            System.out.print(array2[i]);
		}
		
		
		//compara el intrerior de las caqdenas
		if(Arrays.equals(array,array3)) {
			System.out.println();
			System.out.println("Son iguales.");
		}else {
			System.out.println();
			System.out.println("Las cadenas no son iguales.");
			System.out.println();
		}
		
		//ordeno cadenas´  
        Arrays.sort(array3);
      //Muestro el array
        for(int i=0;i<array3.length;i++){
            System.out.print(array3[i]);
        }

	}

}
