package com.desafio.menu;

import java.util.Scanner;

public class OperacionesBasicas {
	
	public void ejecutar(Scanner scan) { 
		 System.out.print("Ingrese el primer número entero: ");
	     int numero1 = scan.nextInt();
	     System.out.print("Ingrese el segundo número entero: ");
	     int numero2 = scan.nextInt();
	     int suma = numero1 + numero2;
	     int resta = numero1 - numero2;
	     int multiplicacion = numero1 * numero2;
	     double division = 0;
	     
	     if (numero2 != 0) {
	    	 division = (double) numero1 / numero2;
	     }

	  
	     System.out.println("Suma: " + suma);
	     System.out.println("Resta: " + resta);
	     System.out.println("Multiplicación: " + multiplicacion);
	     System.out.println("División: " + division);



	}
	
	
   
}
