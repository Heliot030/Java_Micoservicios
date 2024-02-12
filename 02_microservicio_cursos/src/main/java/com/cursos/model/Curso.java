package com.cursos.model;


public class Curso {
	private String nombre;
	private int duracion;
	private String horarios;
	public Curso(String nombre, int duracion, String horarios) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
		this.horarios = horarios;
	}
	
	public Curso(){
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getHorarios() {
		return horarios;
	}

	public void setHorarios(String horarios) {
		this.horarios = horarios;
	}
	
	
}
