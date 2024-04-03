package com.desafio.menu;

import java.util.Scanner;

public class DescuentoCompra {
	
	public void ejecutar(Scanner scan) {
	      
	        System.out.print("Ingrese el precio original del producto: ");
	        double precioOriginal = scan.nextDouble();
	        double descuento = 0.15 * precioOriginal;
	        double precioFinal = precioOriginal - descuento;
	        System.out.println("El precio final con descuento aplicado es: " + precioFinal);
	     
		
	}

}
