package ar.edu.unq.po2.tp6;

public class Propiedad {
	
	/*
	 Se podr�a hacer que esta clase implemente una interface "Garantizable" que tenga el m�todo valorFiscal como requisito de implementaci�n.
	 Con esto podr�a tener una clase Auto por ejemplo que implemente la misma interfaz y me de lugar a poder ten�r una solicitud de cr�dito distinta
	 como por ejemplo Cr�dito Prendario -ltittarelli.
	 */

	private String descripcion;
	private String direccion;
	private double valorFiscal;

	public Propiedad(String descripcion, String direccion, double valorFiscal) throws Exception {
		if (valorFiscal < 0) throw new Exception("El valor fiscal no puede ser negativo");
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFiscal = valorFiscal;
	}

	public double valorFiscal() {
		return valorFiscal;
	}

}
