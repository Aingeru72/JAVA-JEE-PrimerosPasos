package com.ipartek.formacion.capitulo3;

public class EjercicioMesas {

	public static void main(String[] args) {

		System.out.println("LISTADO DE MESAS");
		System.out.println("---------------------------");

		Mesa mesaIzaskun = new Mesa(8, 6, "negro", 2);
		Mesa mesaMikel = new Mesa(2, 5, "verde", 2);
		Mesa mesaAingeru = new Mesa(5, 7, "plateado", 4);
		Mesa mesaJoseba = new Mesa(3, 5, "amarillo", 3);
		Mesa mesaAnder = new Mesa(1, 2, "custom", 1);

		System.out.println(mesaIzaskun);
		System.out.println("La mesa de Izaskun cuesta: " + mesaIzaskun.getPrecio() + "€");
		System.out.println(mesaMikel);
		System.out.println("La mesa de Mikel cuesta: " + mesaMikel.getPrecio() + "€");
		System.out.println(mesaAingeru);
		System.out.println("La mesa de Aingeru cuesta: " + mesaAingeru.getPrecio() + "€");
		System.out.println(mesaJoseba);
		System.out.println("La mesa de Joseba cuesta: " + mesaJoseba.getPrecio() + "€");
		System.out.println(mesaAnder);
		System.out.println("La mesa de Ander cuesta: " + mesaAnder.getPrecio() + "€");
	}
}
