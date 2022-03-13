package com.sofkaCalculadora;

import java.util.Scanner;

public class main {

	private static Scanner input;
	private static String opcion;
	private static double numero1, resultado;

	public static void main(String[] args) {
		input = new Scanner (System.in);
		suma s = new suma();
		resta r=new resta();
		multiplicacion m= new multiplicacion();
		division d = new division();
		modulo mod = new modulo();
		
		
		System.out.println(" ");
		System.out.println("-----------------------------------------------");
		System.out.println("|                                              |");
		System.out.println("|   ***** BIENVNIDOS A SU CALCULADORA *****    |");
		System.out.println("|----------------------------------------------|");
		System.out.println("| DIGITE EL SIGNO DE LA OPERACION A REALIZAR:  |");
		System.out.println("| + . SUMA                                     |");
		System.out.println("| - . resta                                    |");
		System.out.println("| * . multiplicacion                           |");
		System.out.println("| / . division                                 |");
		System.out.println("| % . modulo                                   |");
		System.out.println("| Digite (salir) para terminar                 |");
		System.out.println("|----------------------------------------------|");
		System.out.println(" ");
		
		
		opcion = opcion();
		numero1();
		
		if (opcion.equals("+")) {
			resultado = s.suma(numero1);
		}
		else if (opcion.equals("-")) {
			resultado = r.resta(numero1);
		}
		else if (opcion.equals("*")) {
			resultado =m.multiplicacion(numero1);
		}
		else if (opcion.equals("/")) {
			resultado =d.division(numero1);
		}
		else if (opcion.equals("%")) {
			resultado =mod.modulo(numero1);
		}
		
		do {
			System.out.println(" ");
			System.out.println("-----------------------------------------------");
			System.out.println("|                                              |");
			System.out.println("|   ***** BIENVNIDOS A SU CALCULADORA *****    |");
			System.out.println("|----------------------------------------------|");
			System.out.println("| DIGITE EL SIGNO DE LA OPERACION A REALIZAR:  |");
			System.out.println("| + . SUMA                                     |");
			System.out.println("| - . resta                                    |");
			System.out.println("| * . multiplicacion                           |");
			System.out.println("| / . division                                 |");
			System.out.println("| % . modulo                                   |");
			System.out.println("| Digite (salir) para terminar                 |");
			System.out.println("|----------------------------------------------|");
			System.out.println(" ");
			
			opcion = opcion();
			if (opcion.equals("+")) {
				resultado = s.suma(resultado);
			}
			else if (opcion.equals("-")) {
				resultado = r.resta(resultado);
			}
			else if (opcion.equals("*")) {
				resultado = m.multiplicacion(resultado);
			}
			else if (opcion.equals("/")) {
				resultado = d.division(resultado);
			}
			else if (opcion.equals("%")) {
				resultado = mod.modulo(resultado);
			
			}
		
			}while (opcion.equals("salir"));
			System.out.println("Hasta pronto");
			
			
		
	}
	
			
	
	private static String opcion () {
		System.out.println("DIGITE EL SIGNO DE LA OPERACION A REALIZAR");
		return input.next();
	}
	
	public static double numero1() {
	System.out.print("Digite un numero para empezar la operacion: ");
	numero1 = input.nextDouble();
	return numero1;

	}

}
