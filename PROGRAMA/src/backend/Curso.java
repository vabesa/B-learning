package backend;

import java.util.ArrayList;

public class Curso {

	public Curso(Nivel nivel, String nombre, Profesor profesor) {
		super();
		this.nivel = nivel;
		this.nombre = nombre;
		this.topicos = new ArrayList<Topico>();
		this.profesor = profesor;

	}
	public Profesor profesor;
	public Nivel nivel;
	public String nombre;
	public ArrayList<Topico> topicos;

	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Topico> getTopicos() {
		return topicos;
	}
	public void setTopicos(ArrayList<Topico> topicos) {
		this.topicos = topicos;
	}
	public Nivel getNivel() {
		return nivel;
	}
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

}
