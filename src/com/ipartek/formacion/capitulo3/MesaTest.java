package com.ipartek.formacion.capitulo3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MesaTest {

	@Test
	public void testMesa() {
		Mesa mesa = new Mesa();
		assertEquals(4, mesa.getNumPatas());
		assertEquals(1, mesa.getDimension());
		assertEquals("blanco", mesa.getColor());
		assertEquals(Mesa.MATERIAL_MADERA, mesa.getMaterial());
	}

	@Test
	public void testMesaIntIntStringInt() {
		Mesa mesa = new Mesa(7, 10, "negro", Mesa.MATERIAL_ACERO);
		assertEquals(7, mesa.getNumPatas());
		assertEquals(10, mesa.getDimension());
		assertEquals("negro", mesa.getColor());
		assertEquals(Mesa.MATERIAL_ACERO, mesa.getMaterial());
	}

	@Test
	public void testSetNumPatas() {
		Mesa mesa = new Mesa();

		// Prueba estandar
		mesa.setNumPatas(5);
		assertEquals(5, mesa.getNumPatas());

		// Prueba límite
		mesa.setNumPatas(0);
		assertEquals(1, mesa.getNumPatas());

		// Prueba out-of-bounds
		mesa.setNumPatas(-5);
		assertEquals(1, mesa.getNumPatas());
	}

	@Test
	public void testGetPrecio() {

		final int PRECIO_BASE = 13;
		int precio = 0;

		Mesa mesa = new Mesa();
		// Precio de mesa creada con valores por defecto
		assertEquals(PRECIO_BASE, mesa.getPrecio());

		/* PRUEBA DE COLORES */
		// Precio de mesa con color "custom"
		mesa.setColor("custom");
		assertEquals((PRECIO_BASE + Mesa.PRECIO_COLOR_CUSTOM), mesa.getPrecio());

		// Precio de mesa con un color estandar
		mesa.setColor("plata");
		assertEquals(PRECIO_BASE, mesa.getPrecio());

		/* PRUEBA DE MATERIALES */
		mesa = new Mesa();
		// Precio material acero
		mesa.setMaterial(Mesa.MATERIAL_ACERO);
		precio = PRECIO_BASE - Mesa.PRECIO_MATERIAL_MADERA + Mesa.PRECIO_MATERIAL_ACERO;
		assertEquals(precio, mesa.getPrecio());

		// TODO: probar resto de materiales

		/* PRUEBAS DE DIMENSIONES */
		mesa = new Mesa();
		int nuevaDimension = 5;
		mesa.setDimension(nuevaDimension);
		precio = PRECIO_BASE + (Mesa.PRECIO_M2 * mesa.getDimension()) - Mesa.PRECIO_M2;
		assertEquals(precio, mesa.getPrecio());

		/* PRUEBA DE NÚMERO DE PATAS */
		mesa = new Mesa();
		int nuevaCantPatas = 10;
		mesa.setNumPatas(nuevaCantPatas);
		precio = PRECIO_BASE + (Mesa.PRECIO_PATA * mesa.getNumPatas()) - Mesa.PRECIO_PATA * 4;
		assertEquals(precio, mesa.getPrecio());

	}

}
