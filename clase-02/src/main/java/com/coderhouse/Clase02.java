package com.coderhouse;

import java.util.Scanner;

public class Clase02 {

	public static void main(String[] args) {
		/*
		int numeroA = 1; 
		int numeroB = 20;
		
		if (numeroA > numeroB) {
			System.out.println("el numero " + numeroA + "es mayor que " + numeroB);	
		} else {
			System.out.println("el numero " + numeroB + " es mayor que " + numeroA);
		}
		*/
		
		
		//CALCULADORA
		
		/*float numeroA = 10.5f;
		float numeroB = 0; 
		
		float resultado = numeroA / numeroB;
		
		if(numeroB != 0) {
			System.out.println("el resultado de la operacion es = " + resultado);
		} else {
			System.err.println("Error no es posible dividir por cero");
		}
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		//System.out.println("Ingrese un Numero:(que se en formato numerico y entero ");
		//int numeroIngresado = scanner.nextInt(); 
		/*
		if(numeroIngresado > 0 ) {
			System.out.println("Se ha ingresado un numero positivo");
		} else if (numeroIngresado < 0) {
			System.out.println("Se ha ingresado un numero negativo");
		} else if (numeroIngresado == 0) {
			System.out.println("Usted ingreso el Cero");
		} else {
			System.err.println("Usted ingreso un dato no valido ");
		}
		*/
		
		
		/*
		System.out.println("Ingrese un numero de la semana: ");
		int numeroIngresado = scanner.nextInt();
		
		if (numeroIngresado == 1) {
			System.out.println(" HOY ES LUNES ");
		} else if (numeroIngresado == 2) {
			System.out.println( " HOY ES MARTES ");
		} else if (numeroIngresado == 3) {
			System.out.println("HOY ES MIERCOLES");
		} else if (numeroIngresado == 4) { 
			System.out.println("HOY ES JUEVES");
		} else if (numeroIngresado == 5) {
			System.out.println("HOY ES VIERNES");
		} else if (numeroIngresado == 6) {
			System.out.println("HOY ES SABADO");
		} else if (numeroIngresado == 7) {
			System.out.println("HOY ES DOMINGO");
		}else {
			System.err.println(" EL DIA INGRESADO ES INCORRECTO");
		}
		scanner.close();
		*/
		
		
		/*
		System.out.println("Ingrese su edad: ");
		int ingreseSuEdad = scanner.nextInt();
		
		if (ingreseSuEdad >=18 && ingreseSuEdad <= 100) {
			System.out.println("Usted puede ingresar, ES MAYOR DE EDAD ");
		}else if (ingreseSuEdad > 0 && ingreseSuEdad < 18)  {
			System.out.println("usted es menor de edad, NO PUEDE PASAR");
		} else {
			System.out.println("ERROR, LA EDAD INGRESADA ES INCORRECTA! ");
		}
		
		scanner.close();
		*/
		
		
		
		
		/*
		System.out.println("Ingrese un dia de la Semana: ");
		int ingreseUnDiaDeLaSemana = scanner.nextInt();
		String nombreDelDiaDeLaSemana = null;
		
		
		switch (ingreseUnDiaDeLaSemana) {
		case 1:
			nombreDelDiaDeLaSemana = "Lunes";
			break;
		case 2:
			nombreDelDiaDeLaSemana = "Martes";
			break;
		case 3:
			nombreDelDiaDeLaSemana = "Miercoles";
			break;
		case 4:
			nombreDelDiaDeLaSemana  = "Jueves";
			break;
		case 5:
			nombreDelDiaDeLaSemana  = "Viernes";
			break;
		case 6:
			nombreDelDiaDeLaSemana  = "Sabado";
			break;
		case 7:
			nombreDelDiaDeLaSemana  = "Domingo";
			break;
			default:
				nombreDelDiaDeLaSemana = "incorrecto ";
		}
		
		System.out.println("Usted ha ingreado el dia " + nombreDelDiaDeLaSemana);
		
		System.out.println("La ejecucion de su aplicacion ha concluido");
		
		scanner.close();
		
		*/
		
		/*
		System.out.println("Ingrese el de la semana (Con Palabras): ");
		String diaIngresado = scanner.nextLine().trim().toLowerCase();
		
		switch (diaIngresado) {
		case "lunes", "martes", "miercoles", "miércoles", "jueves", "viernes":
			System.out.println("ES UN DIA LABORABLE");
		break;
		case "sabado", "sábado", "domingo":
			System.out.println("HOY ES DIA DE DESCANSO");
		break; 
		default: 
			System.err.println("Error, El dia ingresado es incorrecto");
		
		}
		
		
		scanner.close();
		*/
		
		
		
		//OPERADOR TERNARIO
		
		/*
		int numeroA = 12;
		int numeroB = 5;
		
		boolean condicion =  numeroA >= numeroB;
		
		String mensaje = condicion 
				? "El numero A " + numeroA + " es mayor que el numero B " + numeroB 
				: "El numero B " + numeroB + " es mayor que numero A" + numeroA; 
		
		System.out.println(mensaje);
		
		*/
		
		
		//DATOS RANDOM
		
		/*
		float random = 0;
		
		random = (float) Math.random();
		
		System.out.println(random);
		
		*/
		
		
		
		/*
		int min = 5;
		int max = 10;
		
		int random = (int) (Math.random() * (max - min + 1) + 1 );
		
		System.out.println(random);
		
		// NUMERO PI
		final double PI = Math.PI;
		
		System.out.println(PI);
		*/

	}

}
