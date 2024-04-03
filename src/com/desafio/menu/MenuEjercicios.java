package com.desafio.menu;

import java.util.Scanner;

public class MenuEjercicios {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean opcionMenu = true;  
		System.out.println("*** MENU ***");
		System.out.println("=== INGRESE LA OPERACION QUE DESEA REALIZAR ===");
		System.out.println("================================================");
         
		
		 while (opcionMenu) {
	            System.out.println("Seleccione un ejercicio:");
	            System.out.println("1. Conversión de Temperatura (Celsius a Fahrenheit):");
	            System.out.println("2. Cálculo de área de un círculo");
	            System.out.println("3. Operaciones con Dos Números");
	            System.out.println("4. Descuento en una Compra");
	            System.out.println("5. Salir del programa");
	            System.out.println("====================================================");
	         
	            System.out.println("Ingrese la operacion que desea realizar: ");
	          int  opcion = scan.nextInt();

	            switch (opcion) {
	                case 1:
	                	ConversionTemperatura convTemp = new ConversionTemperatura();
	                	convTemp.ejecutar(scan);
	                    break;
	                  
	                case 2:
	                	CalculoAreaCirculo calCir = new CalculoAreaCirculo();
	                	calCir.ejecutar(scan);
	                    break;
	                case 3:
	                	OperacionesBasicas opeBasic = new OperacionesBasicas();
	                	opeBasic.ejecutar(scan);
	                	
	                	break;
	                case 4:
	                	DescuentoCompra descComp = new DescuentoCompra();
	                	descComp.ejecutar(scan);
	                    break;
	                case 5:
	                	opcionMenu = false;
	                	System.out.println("Saliendo del Programa......");
	                	scan.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Opción no válida. Por favor, ingrese un número válido.");
	            }
	            
	            if(opcionMenu) {
	            	System.out.println("\n¿Desea continuar? (Sí: 1 / No: 0)");
	            	int continuarMenu = scan.nextInt();
	            	opcionMenu = continuarMenu == 1;
	            	
	            }
	            
	           
	            
	        }
		 scan.close();
		 }
}
