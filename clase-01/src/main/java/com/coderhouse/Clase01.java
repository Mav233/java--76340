package com.coderhouse;

public class Clase01 {

	public static void main(String[] args) {
		
		//String entrada = "hola coder";
		String entrada = "hola maico";
		
		//System.out.println(entrada);
		
		int miPrimerNumero = 25;
		
		float numeroConDecimal= 3.14f;
		
		int numeroEntero = 05; 
		
		
		String mes = "abril";
		
		int ano = 2025;
		
		//System.out.println(numeroEntero + " de " + mes + " del "+ ano );
		
		//Operaciones Matematicas y concatenación 
		
		int suma = 1 + 2; // ESTO ES VARIABLE, SE PUEDE REDEFINIR
		int suma2 = 3 + 5;
		
		final int NUMERO_A = 10; //PARA DEFINIR UNA CONSTANTE, NO SE PUEDE REDIFINIR
		
		
		//System.out.println( NUMERO_A);
		
		//CONTADOR DE INCREMENTO/DECREMENTO
		
		int contador = 0;
		
		contador = 1;
		
		contador = contador + 1;
		contador++;
		contador= contador - 1;
		contador--;
		//System.out.println(contador);
		
		
		//OPERADORES RELACIONALES
		
		
		int numeroA = 10;
		int numeroB = 10;
		String numeroC = "10";
		//TODAS ESTAS COMPARACIONES DEVUELVEN UN BOOLEAN.
		
		System.out.println(numeroA == numeroB); // IGUAL
		System.out.println(numeroA != numeroB); //DISTINTO
		System.out.println(numeroA < numeroB); //MENOR QUE
		System.out.println(numeroA > numeroB); //MAYOR QUE
		System.out.println(numeroA <= numeroB); //MENOR O IGUAL QUE
		System.out.println(numeroA >= numeroB); //MAYOR O IGUAL QUE 
		
		
		//Comparacion no permitada por ser FUERTEMENTE TIPADO
		//System.out.println(numeroA == numeroC);
		
		

	}

}
