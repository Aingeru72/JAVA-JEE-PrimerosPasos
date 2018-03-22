package com.ipartek.formacion.capitulo5;

import java.util.Scanner;

public class HacerPedido {

	public static void main(String[] args) {

		Hamburguesa burguer = new Hamburguesa();
		System.out.println(burguer);
		Scanner sc = new Scanner(System.in);
		int pos = 2;
		float precio = Hamburguesa.PRECIO_BASE;

		System.out.println("¿Quiere añadir tomate? Sí (s) / No (n)");
		String quiereTomate = sc.next();

		System.out.println("¿Quiere añadir lechuga? Sí (s) / No (n)");
		String quiereLechuga = sc.next();

		System.out.println("¿Quiere añadir pepino? Sí (s) / No (n)");
		String quierePepino = sc.next();

		System.out.println("¿Quiere añadir queso? Sí (s) / No (n)");
		String quiereQueso = sc.next();

		sc.close();

		if ("s".equalsIgnoreCase(quiereTomate)) {
			burguer.getIngredientes()[pos] = "tomate";
			pos++;
		}
		if ("s".equalsIgnoreCase(quiereLechuga)) {
			burguer.getIngredientes()[pos] = "lechuga";
			pos++;
		}
		if ("s".equalsIgnoreCase(quierePepino)) {
			burguer.getIngredientes()[pos] = "pepino";
			pos++;
		}
		if ("s".equalsIgnoreCase(quiereQueso)) {
			burguer.getIngredientes()[pos] = "queso";
			pos++;
		}

		precio = burguer.getPrecio(burguer.getIngredientes());

		System.out.println("SU PEDIDO: \n" + burguer.toString());
		System.out.println("TOTAL: " + precio + "€");

	}

}
