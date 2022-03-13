package com.sofkaCalculadora;

import java.util.Scanner;

public class suma {

	private double num2;
	public double resultadoSuma;
	private Scanner input;

	public double suma(double numero1) {
		input = new Scanner(System.in);

		num2 = numero2();
		resultadoSuma = sumar(numero1);
		System.out.println("La Suma de "+ numero1+" + "+ num2 +" Es: " + resultadoSuma);
		System.out.println(" ");
		System.out.println(" ");
		return resultadoSuma;
	}

	private double numero2() {
		double numero2;
		System.out.print("Digite numero a sumar: ");
		numero2 = input.nextDouble();
		return numero2;
	}

	public double sumar(double numero1) {
		resultadoSuma = numero1 + num2;
		return resultadoSuma;
	}

}


