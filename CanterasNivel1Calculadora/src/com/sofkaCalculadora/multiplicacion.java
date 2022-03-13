package com.sofkaCalculadora;

import java.util.Scanner;

public class multiplicacion {

	private double num2;
	public double resultadoMultiplicacion;
	private Scanner input;


	public double multiplicacion(double numero1) {
		input = new Scanner(System.in);

		num2 = numero2();
		resultadoMultiplicacion = multiplicar(numero1);
		System.out.println("La Multiplicación de "+ numero1+" * "+ num2 +" Es: " +resultadoMultiplicacion);
		System.out.println(" ");
		System.out.println(" ");
		return resultadoMultiplicacion;
	}

	private double numero2() {
		double numero2;
		System.out.print("Digite numero a multiplicar: ");
		numero2 = input.nextDouble();
		return numero2;
	}

	public double multiplicar(double numero1) {
		resultadoMultiplicacion = numero1 * num2;
		return resultadoMultiplicacion;
	}

}
