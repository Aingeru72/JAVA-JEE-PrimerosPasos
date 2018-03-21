package com.ipartek.formacion.capitulo5;

import static org.junit.Assert.*;

import org.junit.Test;

public class HamburguesaTest {

	@Test
	public void testHamburguesa() {
		Hamburguesa burguer = new Hamburguesa();
		String ing0 = burguer.getIngredientes()[0];
		assertEquals("El 1. ingrediente debería ser PAN", "pan", ing0);
		String ing1 = burguer.getIngredientes()[1];
		assertEquals("El 2. ingrediente debería ser HAMBURGUESA", "hamburguesa", ing1);
		// Testear el tamaño del Array de ingredientes
		assertEquals("El tamaño de la lista de ingredientes debería ser 6", 6, burguer.getIngredientes().length);
	}

	@Test
	public void testGetPrecio() {
		float precio = 0;
		
		Hamburguesa viuda = new Hamburguesa();
		precio = viuda.getPrecio(viuda.getIngredientes());
		assertEquals("El precio de la H.Viuda debería ser de 1.0€", 1.0, precio, 0.01);
		
		Hamburguesa completa = new Hamburguesa();
		String[] ingredientesCompleta = {"pan", "hamburguesa", "tomate", "lechuga", "pepino", "queso"};
		completa.setIngredientes(ingredientesCompleta);
		precio = completa.getPrecio(completa.getIngredientes());
		assertEquals("El precio de la H.Completa debería ser de 2.75€", 2.75, precio, 0.01);
		
		// TODO: probar otras ocombinadiones de ingredientes
	}

}
