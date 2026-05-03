package com.krakedev.asistencia.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krakedev.asistencia.dto.Asistencia;
import com.krakedev.asistencia.dto.RegistroAsistencia;
import com.krakedev.asistencia.dto.ServicioAsistencia;

@RestController
@RequestMapping("/asistencias")
public class AsistenciaControler {
	
	private final ServicioAsistencia servicioAsistencia;

	public AsistenciaControler(ServicioAsistencia servicioAsistencia) {
		super();
		this.servicioAsistencia = servicioAsistencia;
	}
	
	@PostMapping("/{cedula}")
	public RegistroAsistencia registrar(@PathVariable String cedula) {
		return servicioAsistencia.registroAsistencia(cedula);
	}
	
	@GetMapping("/{cedula}")
	public ArrayList<Asistencia> consultar(@PathVariable String cedula){
		return servicioAsistencia.consultarAsistencias(cedula);
	}
}
