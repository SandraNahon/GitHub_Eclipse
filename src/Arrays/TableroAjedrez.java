package Arrays;

import java.util.Scanner;

public class TableroAjedrez {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int filas = 8;
        final int columnas = 8;
        final char cuadroBlanco = '\u25A1';
        final char cuadroNegro = '\u25A0';
        final char DAMA = '۩';
        
        char [][] tablero = new char[filas][columnas];
        boolean blanco = false;
        char color;
        
        String posicion = new String();
        int filaDama;
        int columnaDama;
        
        System.out.println("Pintamos el tablero.");
        for(int i = filas - 1; i >= 0; i--) {
        	System.out.print(i + 1 + " ");
        	for(int j = 0; j < columnas; j++) {
        		//si es blanco
        		if(((i + j) % 2) != 0){
        			color = cuadroBlanco;
        		}else {
        			color = cuadroNegro;
        		}
        		System.out.print(color + " ");
        		tablero[i][j] = color;
        	}
        	System.out.println();
        		
        }
        //posiciones 
        System.out.print("  ");
        for (char letra = 'a'; letra <= 'h'; letra ++) {
            System.out.print(letra + " ");
        }
        System.out.println();
        
        //calcular donde poner la dama
        
        System.out.println("Dame la posición de la dama: ");
        posicion = scanner.nextLine();
        columnaDama = (int) (posicion.charAt(0) - 'a');
        filaDama = (int) (posicion.charAt(1) - '1');
        tablero[filaDama][columnaDama] = DAMA;
        
        
        //  calcular posiciones a las que se puede mover la dama
        //en el tablero
        for (int fila = filas - 1; fila >= 0; fila --) {
            System.out.print(fila + 1 + " ");
            for (int columna = 0; columna < columnas; columna ++) {
                System.out.print(tablero[fila][columna] + " ");
            }
            System.out.println();
        }
        System.out.print("  ");
        for (char letra = 'a'; letra <= 'h'; letra ++) {
            System.out.print(letra + " ");
        }
        System.out.println();

	}

}
