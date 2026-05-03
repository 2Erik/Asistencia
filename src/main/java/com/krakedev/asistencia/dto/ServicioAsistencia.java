package com.krakedev.asistencia.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ServicioAsistencia {
	private ArrayList<RegistroAsistencia> registros = new ArrayList<RegistroAsistencia>();
	private final ServicioEstudiantes servicioEstudiantes;
	
	public ServicioAsistencia(ServicioEstudiantes servicioEstudiantes){
		this.servicioEstudiantes = servicioEstudiantes;
	}
	
	public RegistroAsistencia registroAsistencia(String cedula) {
		Estudiante estudiante = servicioEstudiantes.busEstudiante(cedula);
		if(estudiante != null) {
			Asistencia asistencia = new Asistencia(LocalDate.now(), LocalDateTime.now(), "P");
			RegistroAsistencia registroAsistencia = new RegistroAsistencia(estudiante, asistencia);
			registros.add(registroAsistencia);
			return registroAsistencia;	
		}
		return null;
	}
	
	public ArrayList<Asistencia> consultarAsistencias(String cedula){
		ArrayList<Asistencia> asistencias = new ArrayList<Asistencia>();
		for (RegistroAsistencia ra : registros) {
			if (ra.getEstudiante().getCedula().equals(cedula)) {
				Asistencia asistencia = ra.getAsistencia();
				asistencias.add(asistencia);
			}
		}
		return asistencias;
	}
	
}
