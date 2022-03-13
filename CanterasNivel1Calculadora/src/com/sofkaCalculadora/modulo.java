package com.sofkaCalculadora;

import java.util.Scanner;

public class modulo {

	private double num2;
	public double resultadoModulo;
	private Scanner input;

	public double modulo(double numero1) {
		input = new Scanner(System.in);

		num2 = numero2();
		resultadoModulo = modular(numero1);
		System.out.println("El Modulo de "+ numero1+" % "+ num2 +" Es:" + resultadoModulo);
		System.out.println(" ");
		System.out.println(" ");
		return resultadoModulo;
	}

	private double numero2() {
		double numero2;
		System.out.println("Digite numero para modular");
		numero2 = input.nextDouble();
		return numero2;
	}

	public double modular(double numero1) {
		resultadoModulo = numero1 % num2;
		return resultadoModulo;
	}

}

