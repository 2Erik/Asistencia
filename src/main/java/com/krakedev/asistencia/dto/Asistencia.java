package com.krakedev.asistencia.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Asistencia {
	
	private LocalDate fechaClase; //Solo fecha
	private LocalDateTime fechaHoraRegistro; //Fecha y hora
	private String estado;
	
	public LocalDate getFechaClase() {
		return fechaClase;
	}
	public void setFechaClase(LocalDate fechaClase) {
		this.fechaClase = fechaClase;
	}
	public LocalDateTime getFechaHoraRegistro() {
		return fechaHoraRegistro;
	}
	public void setFechaHoraRegistro(LocalDateTime fechaHoraRegistro) {
		this.fechaHoraRegistro = fechaHoraRegistro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return "Asistencia [fechaClase=" + fechaClase + ", fechaHoraRegistro=" + fechaHoraRegistro + ", estado="
				+ estado + "]";
	} 
	
	
}
