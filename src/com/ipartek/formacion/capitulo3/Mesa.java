// 1. Definición del paquete
package com.ipartek.formacion.capitulo3;

// 2. Import de librerías

// 3. Definición de la Clase
public class Mesa {

	// Constantes
	final static int PRECIO_PATA = 1;
	final static int PRECIO_M2 = 5;
	final static int PRECIO_MATERIAL_PLASTICO = 2;
	final static int PRECIO_MATERIAL_MADERA = 4;
	final static int PRECIO_MATERIAL_ALUMINIO = 5;
	final static int PRECIO_MATERIAL_ACERO = 6;
	final static int PRECIO_COLOR_CUSTOM = 23;
	final int MATERIAL_PLASTICO = 1;
	final int MATERIAL_MADERA = 2;
	final int MATERIAL_ALUMINIO = 3;
	final int MATERIAL_ACERO = 4;
	final static String PRECIO_COLOR_NAME_CUSTOM = "custom";

	// 4. Definición de atributos
	private int numPatas;
	private int dimension; // m2
	private String color;
	private int material;

	/*
	 * 5. Definición de Métodos 5.1 Constructor(es) 5.2 Getters & Setters 5.3 Otros
	 * métodos
	 */

	// 5.1 Constructores
	public Mesa() {
		super();
		this.numPatas = 4;
		this.dimension = 1;
		this.color = "blanco";
		this.material = 2;
	}

	/**
	 * Crear nueva instancia del tipo Mesa
	 * 
	 * @param numPatas
	 *            : entero con el número de patas, SI es negativo se inicializa a 0
	 * @author Aingeru Sanchez
	 */
	public Mesa(int numPatas, int dimension, String color, int material) {
		super();
		// this.numPatas = numPatas;
		this.setNumPatas(numPatas);
		this.setDimension(dimension);
		this.setColor(color);
		this.setMaterial(material);
	}

	// 5.2 Getters & Setters
	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = (numPatas < 0) ? 0 : numPatas;
	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaterial() {
		return material;
	}

	public void setMaterial(int materrial) {
		this.material = materrial;
	}

	@Override
	public String toString() {
		return "Mesa [numPatas=" + numPatas + ", dimension=" + dimension + ", color=" + color + ", materrial="
				+ material + "]";
	}

	// 5.3 Otros métodos
	static int getPrecio(Mesa mesa) {
		int precio = 0;

		// Calculamos el precio por pata
		precio += mesa.getNumPatas() * PRECIO_PATA;
		// Calculamos el precio por m2
		precio += mesa.getDimension() * PRECIO_M2;
		// Calculamos precio por color
		if (PRECIO_COLOR_NAME_CUSTOM.equals(mesa.getColor())) {
			precio += PRECIO_COLOR_CUSTOM;
		}
		// Calculamos precio por material
		switch (mesa.getMaterial()) {
		case 1: // Plástico
			precio += PRECIO_MATERIAL_PLASTICO;
			break;
		case 2: // Madera
			precio += PRECIO_MATERIAL_MADERA;
			break;
		case 3: // Aluminio
			precio += PRECIO_MATERIAL_ALUMINIO;
			break;
		case 4: // Acero
			precio += PRECIO_MATERIAL_ACERO;
			break;

		default: // Optional
			break;
		}

		return precio;
	}
}
