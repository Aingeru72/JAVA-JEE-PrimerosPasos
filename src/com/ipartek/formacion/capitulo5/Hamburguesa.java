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
	 * Devuelve la posici�n del ingrediente en INGREDIENTES que se corresponde con
	 * la posici�n de su precio en INGREDIENTES_PRECIOS
	 * 
	 * @param ingrediente:
	 *            String con el nombre del ingrediente
	 * @return: posici�n del ingrediente. Si no lo encuentra devuelve -1
	 */
	public int getPriceOfIngredient(String ingrediente) {
		int index = -1;
		int i = 0;

		while (index == -1) {
			if (this.INGREDIENTES[i].equalsIgnoreCase(ingrediente)) {
				index = i;
			}
			i++;
		}

		return index;
	}

	// TODO: crear m�todo que te devuelve el precio de la hamburguesa pasada por
	// parametro
	public float getPrecio(Hamburguesa burguer) {

		return 0;
	}

}
