package backend;

import java.util.ArrayList;

public class Alumno {

	public Alumno(String nombre, String edad, Nivel nivel, String clave, String usuario) {
		this.nombre = nombre;
		this.edad = edad;
		this.nivel = nivel;
		this.clave=clave;
		this.usuario=usuario;
		this.notas = new ArrayList<Nota>();
		for (Curso c: nivel.getCursos()){
			this.notas.add(new Nota(c.getNombre()));
		}
		this.horario = new ArrayList<Modulo>();
	}
	String nombre;
	String edad;
	Nivel nivel;
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	String usuario;
	String clave;
	ArrayList<Nota> notas;
	ArrayList<Modulo> horario;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public Nivel getNivel() {
		return nivel;
	}
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	public ArrayList<Modulo> getHorario() {
		return horario;
	}
	public void setHorario(ArrayList<Modulo> horario) {
		this.horario = horario;
	}
	public ArrayList<Nota> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

}
