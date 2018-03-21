package com.ipartek.formacion.capitulo5;

import java.util.Arrays;

public class Hamburguesa {

	// Constantes
	final static String[] INGREDIENTES = { "pan", "hamburguesa", "tomate", "lechuga", "pepino", "queso" };
	final static float[] INGREDIENTES_PRECIOS = { 0.3f, 0.7f, 0.5f, 0.25f, 0.3f, 0.7f };
	final static float PRECIO_BASE = 1.0f;

	// Variables
	private String[] ingredientes = new String[6];

	// Constructor
	public Hamburguesa() {
		super();
		this.ingredientes[0] = "pan";
		this.ingredientes[1] = "hamburguesa";
	}

	public String[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}

	@Override
	public String toString() {
		return "Hamburguesa [ingredientes=" + Arrays.toString(ingredientes) + "]";
	}

	/**
	 * Devuelve la posición del ingrediente en INGREDIENTES que se corresponde con
	 * la posición de su precio en INGREDIENTES_PRECIOS
	 * 
	 * @param ingrediente:
	 *            String con el nombre del ingrediente
	 * @return: posición del ingrediente. Si no lo encuentra devuelve -1
	 */
	public static int getPriceOfIngredient(String ingrediente) {
		int index = -1;
		int i = 0;

		while (index == -1) {
			if (Hamburguesa.INGREDIENTES[i].equalsIgnoreCase(ingrediente)) {
				index = i;
			}
			i++;
		}

		return index;
	}


	public float getPrecio(String[] ingredientes) {
		float precio = 0;
		int i = 0;
		int posIngrdiente = 0;
		boolean fin = false;

		while ( i < ingredientes.length && !fin ) {
			if ( ingredientes[i] != null ) {
				posIngrdiente = Hamburguesa.getPriceOfIngredient(ingredientes[i]);
				precio += Hamburguesa.INGREDIENTES_PRECIOS[posIngrdiente];
			} else {
				fin = true;
			}
			i++;
		}
		
		return precio;
	}

}
