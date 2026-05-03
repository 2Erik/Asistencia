package com.krakedev.asistencia.dto;

import java.util.ArrayList;

public class ServicioAsistencia {
	private ArrayList<RegistroAsistencia> registro = new ArrayList<RegistroAsistencia>();
	private final ServicioEstudiantes servicioEstudiantes;
	
	public ServicioAsistencia(ServicioEstudiantes servicioEstudiantes){
		this.servicioEstudiantes = servicioEstudiantes;
	}
	
	public RegistroAsistencia registroAsistencia(String cedula) {
		return null;
	}
	
	public ArrayList<Asistencia> consultarAsistencias(String cedula){
		return null;
	}
	
}
