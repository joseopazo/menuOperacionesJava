package com.desafio.menu;

import java.util.Scanner;

public class CalculoAreaCirculo {
	
	
	      public void ejecutar(Scanner scan) {
	          System.out.print("Ingrese el radio del círculo: ");
	          double radio = scan.nextDouble();
	          double area = Math.PI * radio * radio;
	          System.out.println("El área del círculo es: " + area);
	      }
	    	  
	      

}
