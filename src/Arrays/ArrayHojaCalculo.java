package Arrays;

public class ArrayHojaCalculo {

	public static void main(String[] args) {
		/*
		   Escribe un programa que genere al azar 20 números enteros comprendidos entre 0 y 9. 
  Estos números se deben introducir en un array de 4 filas por 5 columnas.

El programa mostrará las sumas parciales de filas y columnas igual que si de una hoja de cálculo se tratara.
 La suma total debe aparecer en la esquina inferior derecha.
		 */

		final int filas = 4;
		final int columnas = 5;
		int[][] numero = new int[filas][columnas];
		
		int suma;
		int sumaTotal = 0;
		
		//se genera los numeros aleatrorios de las filas y columnas
		//
		System.out.println("Generamos 20 numeros aleatorios.");
		for(int i = 0; i < filas; i++) {
			suma = 0;
			for(int j = 0; j < columnas; j++) {
				numero[i][j] = (int) (Math.random() * 9);
				System.out.print(numero[i][j] + "\t");
				suma += numero[i][j];                
            }            
          System.out.println("S: " + suma);
			
		}
		
		// se hacen las sumas de las columnsa y para la suma total
		 for (int j = 0; j < columnas; j ++) {
	            suma = 0;
	            for (int i = 0; i < filas; i ++) {
	                suma += numero[i][j];
	            }
	            System.out.print(suma + "\t");
	            sumaTotal += suma;            
	        }
		 System.out.print("T: " + sumaTotal);
	     System.out.println();

	}

}
