package com.sofkaCalculadora;

import java.util.Scanner;

public class resta {

	private double num2;
	public double resultadoResta;
	private Scanner input;

	public double resta(double numero1) {
		input = new Scanner(System.in);

		num2 = numero2();
		resultadoResta = restar(numero1);
		System.out.println("La Resta de "+ numero1+" - "+ num2 +" Es: " + resultadoResta);
		System.out.println(" ");
		System.out.println(" ");
		return resultadoResta;
	}

	private double numero2() {
		double numero2;
		System.out.println("Digite  numero a restar: ");
		numero2 = input.nextDouble();
		return numero2;
	}

	public double restar(double numero1) {
		resultadoResta = numero1 - num2;
		return resultadoResta;
	}

}
