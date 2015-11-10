package backend;

import java.util.ArrayList;

public class Nivel {

	public Nivel(String nombre) {
		super();
		this.nombre = nombre;
		this.cursos = new ArrayList<Curso>();
		this.alumnos = new ArrayList<Alumno>();
		this.semanas = new ArrayList<Semana>();

	}
	public ArrayList<Semana> semanas;
	public String nombre;
	public ArrayList<Curso> cursos;
	public ArrayList<Alumno> alumnos;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}
	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	public ArrayList<Semana> getSemanas() {
		return semanas;
	}
	public void setSemanas(ArrayList<Semana> semanas) {
		this.semanas = semanas;
	}
}
