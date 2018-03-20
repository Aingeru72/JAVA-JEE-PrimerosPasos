package com.ipartek.formacion.capitulo5;

import java.util.Scanner;

// import org.apache.commons.lang3.StringUtils;

import com.ipartek.formacion.capitulo3.Mesa;

public class CalculadorPrecioMesa {

	// Variables globales
	private static int patas;
	private static int dimension;
	private static String color;
	private static String material;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int precio = 0;

		System.out.println("CALCULADORA DE PRECIO DE MESA");
		System.out.println("-----------------------------");

		pedirDatos(sc);
		int materialId = parsearMaterial(material);
		if (materialId != 0) {
			Mesa mesa = new Mesa(patas, dimension, color, materialId);
			precio = mesa.getPrecio();
			imprimirFactura(patas, dimension, color, material, precio);
		} else {
			System.out.println("No podemos construir una mesa con ese material");
		}

	}

	public static void pedirDatos(Scanner sc) {
		System.out.println("¿Número de patas?");
		patas = sc.nextInt();

		System.out.println("¿Dimensión?");
		dimension = sc.nextInt();

		System.out.println("¿Color?");
		color = sc.next();

		System.out.println("¿Material?");
		material = sc.next();
	}

	public static int parsearMaterial(String material) {
		int result = 0;
		material = material.toLowerCase();
		// reemplazar carácteres especiales
		material = normalizar(material);
		// material = StringUtils.stripAccents(material);

		switch (material) {
		case "plastico": // Plástico
			result = 1;
			break;
		/*
		 * case "plástico": // Plástico result = 1; break;
		 */
		case "madera": // Madera
			result = 2;
			break;
		case "aluminio": // Aluminio
			result = 3;
			break;
		case "acero": // Acero
			result = 4;
			break;
		default: // Optional
			result = 0;
			break;
		}
		return result;
	}

	public static String normalizar(String material) {
		return material.replace('á', 'a').replace('é', 'e').replace('í', 'i').replace('ó', 'o').replace('ú', 'u');
	}

	public static void imprimirFactura(int patas, int dimension, String color, String material, int precio) {
		System.out.println("-----------------------------");
		System.out.println("----- FACTURA RESUMIDA ------");
		System.out.println("-----------------------------");
		System.out.println("* Nº de patas: " + patas + "patas");
		System.out.println("* Dimensión: " + dimension + "m2");
		System.out.println("* Color: " + color);
		System.out.println("* Material: " + material);
		System.out.println("-----------------------------");
		System.out.println("PRECIO: " + precio + "€");
		System.out.println("-----------------------------");
	}

}
