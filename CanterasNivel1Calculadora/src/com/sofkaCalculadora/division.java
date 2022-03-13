package com.sofkaCalculadora;

import java.util.Scanner;

public class division {

	private double num2;
	public double resultadoDivision;
	private Scanner input;

	public double division(double numero1) {
		input = new Scanner(System.in);

		num2 = numero2();
		resultadoDivision = dividir(numero1);
		System.out.println("La División de "+ numero1+" / "+ num2 +" Es:" + resultadoDivision);
		System.out.println(" ");
		System.out.println(" ");
		return resultadoDivision;
	}

	private double numero2() {
		double numero2;
		System.out.println("Digite numero a dividir");
		numero2 = input.nextDouble();
		return numero2;
	}

	public double dividir(double numero1) {
		resultadoDivision = numero1 / num2;
		return resultadoDivision;
	}

}
