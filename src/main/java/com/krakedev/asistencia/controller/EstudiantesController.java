package com.krakedev.asistencia.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krakedev.asistencia.dto.Estudiante;
import com.krakedev.asistencia.dto.ServicioEstudiantes;

@RestController
@RequestMapping("/estudiantes")
public class EstudiantesController {
	
	private final ServicioEstudiantes servicioEstudiantes;

	public EstudiantesController(ServicioEstudiantes servicioEstudiantes) {
		super();
		this.servicioEstudiantes = servicioEstudiantes;
	}
	
	@PostMapping   //CREA RECUROS
	public void agregar(@RequestBody Estudiante estudiante) {
		servicioEstudiantes.agregar(estudiante);
	}
	
	@GetMapping("/{cedula}")   //CONSULTA INFORMACION
	public Estudiante buscar(@PathVariable String cedula) {
		return servicioEstudiantes.busEstudiante(cedula);
	}
	
	@DeleteMapping("/{cedula}")
	public void eliminar(@PathVariable String cedula) {
		servicioEstudiantes.eliminar(cedula);
	}
	
	@PutMapping("/{cedula}")
	public void actualizar(@PathVariable String cedula, @RequestBody Estudiante estudiante) {
		servicioEstudiantes.actualizar(cedula, estudiante);
	}
	
	@GetMapping
	public ArrayList<Estudiante> listar() {
		return servicioEstudiantes.listar();
	}
}
