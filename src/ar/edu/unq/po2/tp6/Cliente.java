package ar.edu.unq.po2.tp6;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Cliente {

	private double sueldoNeto;
	private LocalDate fechaNacimiento;
	private String direccion;
	private String apellido;
	private String nombre;

	public Cliente(String nombre, String apellido, String direccion, LocalDate fechaNacimiento, double sueldoNeto) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.fechaNacimiento = fechaNacimiento; 
		this.sueldoNeto = sueldoNeto;
	}

	public double sueldoNetoAnual() {
		return sueldoNeto * 12;
	}

	public boolean menorA65En(int cantidadDeMeses) {
		return ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now().plusMonths(cantidadDeMeses)) <= 65;
	}

	public double sueldoNeto() {
		return sueldoNeto;
	}

}
