package com.ipartek.formacion.capitulo2;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		String nombre = "";

		System.out.println("Introduce tu nombre:");
		Scanner user_input = new Scanner(System.in);
		nombre = user_input.next();
		System.out.println("¡Hola " + nombre + "!");
		user_input.close();
	}

}
