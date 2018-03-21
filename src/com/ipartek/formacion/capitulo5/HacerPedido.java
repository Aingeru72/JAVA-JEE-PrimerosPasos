package com.ipartek.formacion.capitulo5;

import java.util.Scanner;

public class HacerPedido {

	public static void main(String[] args) {

		Hamburguesa burguer = new Hamburguesa();
		System.out.println(burguer);
		Scanner sc = new Scanner(System.in);
		int pos = 2;
		float precio = Hamburguesa.PRECIO_BASE;
		int iPrecioIngrediente = 0;

		System.out.println("¿Quiere añadir tomate? Sí (s) / No (n)");
		String quiereTomate = sc.next();

		System.out.println("¿Quiere añadir lechuga? Sí (s) / No (n)");
		String quiereLechuga = sc.next();

		System.out.println("¿Quiere añadir pepino? Sí (s) / No (n)");
		String quierePepino = sc.next();

		System.out.println("¿Quiere añadir queso? Sí (s) / No (n)");
		String quiereQueso = sc.next();

		if ("s".equalsIgnoreCase(quiereTomate)) {
			burguer.getIngredientes()[pos] = "tomate";
			pos++;
			iPrecioIngrediente = burguer.getPriceOfIngredient("tomate");
			precio += actualizarPrecio(iPrecioIngrediente);
		}
		if ("s".equalsIgnoreCase(quiereLechuga)) {
			burguer.getIngredientes()[pos] = "lechuga";
			pos++;
			iPrecioIngrediente = burguer.getPriceOfIngredient("lechuga");
			precio += actualizarPrecio(iPrecioIngrediente);
		}
		if ("s".equalsIgnoreCase(quierePepino)) {
			burguer.getIngredientes()[pos] = "pepino";
			pos++;
			iPrecioIngrediente = burguer.getPriceOfIngredient("pepino");
			precio += actualizarPrecio(iPrecioIngrediente);
		}
		if ("s".equalsIgnoreCase(quiereQueso)) {
			burguer.getIngredientes()[pos] = "queso";
			pos++;
			iPrecioIngrediente = burguer.getPriceOfIngredient("queso");
			precio += actualizarPrecio(iPrecioIngrediente);
		}

		System.out.println("SU PEDIDO: \n" + burguer.toString());
		System.out.println("TOTAL: " + precio + "€");

	}

	private static float actualizarPrecio(int iPrecioIngrediente) {
		float result = 0;

		if (iPrecioIngrediente != -1) {
			result = Hamburguesa.INGREDIENTES_PRECIOS[iPrecioIngrediente];
		} else {
			System.out.println("Ha ocurrido un error al procesar su pedido");
		}

		return result;
	}

}
