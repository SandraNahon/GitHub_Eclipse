package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 Escribe un programa en Java para convertir un objeto de tipo String en int, long, float y double.
		 */
		
		Scanner s = new Scanner(System.in);
		
		String dato = "12345";
		
		
		//convertir en int
		
		int IntDato = Integer.parseInt(dato);
		System.out.println(dato + " convertido en int seria " + IntDato);
		
		//convertido en long
		Long ldato1 = Long.valueOf(dato);
		long lDato = Long.parseLong(dato);
		System.out.println(" Convertido en long seria " + lDato + " y en Long: " + ldato1);
		
		//convertir rn float
		Float fDato1 = Float.valueOf(dato);
		float fDato = Float.parseFloat(dato);
		
		//convertir en double
		Double dDato1 = Double.valueOf(dato);
		double dDato = Double.parseDouble(dato);

	}

}
