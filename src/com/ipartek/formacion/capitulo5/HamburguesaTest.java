package com.ipartek.formacion.capitulo5;

import static org.junit.Assert.*;

import org.junit.Test;

public class HamburguesaTest {

	@Test
	public void testHamburguesa() {
		Hamburguesa burguer = new Hamburguesa();
		String ing0 = burguer.getIngredientes()[0];
		assertEquals("El 1. ingrediente deber�a ser PAN", "pan", ing0);
		String ing1 = burguer.getIngredientes()[1];
		assertEquals("El 2. ingrediente deber�a ser HAMBURGUESA", "hamburguesa", ing1);
		// Testear el tama�o del Array de ingredientes
		assertEquals("El tama�o de la lista de ingredientes deber�a ser 6", 6, burguer.getIngredientes().length);
	}

	@Test
	public void testGetPrecio() {
		float precio = 0;
		
		Hamburguesa viuda = new Hamburguesa();
		precio = viuda.getPrecio(viuda.getIngredientes());
		assertEquals("El precio de la H.Viuda deber�a ser de 1.0�", 1.0, precio, 0.01);
		
		Hamburguesa completa = new Hamburguesa();
		String[] ingredientesCompleta = {"pan", "hamburguesa", "tomate", "lechuga", "pepino", "queso"};
		completa.setIngredientes(ingredientesCompleta);
		precio = completa.getPrecio(completa.getIngredientes());
		assertEquals("El precio de la H.Completa deber�a ser de 2.75�", 2.75, precio, 0.01);
		
		// TODO: probar otras ocombinadiones de ingredientes
	}

}
