package com.krakedev.asistencia.dto;

public class Estudiante {
	private String cedula;
	private String nombre;
	private String apellido;
	
	//GETTERS AND SETTERS
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedila) {
		this.cedula = cedila;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	//METODO toString
	@Override
	public String toString() {
		return "Estudiante [cedila=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
}
