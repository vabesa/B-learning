package backend;

import java.util.ArrayList;

public class Profesor {

	public Profesor(String nombre, String curso) {
		super();
		this.nombre = nombre;
		this.curso = curso;
		this.cursos = new ArrayList<Curso>();
	}
	public String nombre;
	public String curso;
	public ArrayList<Curso> cursos;

	public void ponerNota(double nota, Curso curso, Alumno alumno){
		for (Nota n: alumno.getNotas()){
			if (n.getCurso() == curso.getNombre()){
				n.getListanotas()[n.contadorlista+1] = nota;
				n.setContadorlista(n.getContadorlista()+1);
				n.setNotas(String.valueOf(nota));
			}
		}
	}
	public void AgregarEvento(Nivel nivel, String mes, int semana, String dia, String evento){
		for (Semana s: nivel.getSemanas()){
			if (s.getMes() == mes && s.getNumero() == semana){
				if (dia == "Lunes" || dia == "lunes"){
					s.setLunes(evento);
				}
				if (dia == "Martes" || dia == "martes"){
					s.setMartes(evento);
				}
				if (dia == "Miercoles" || dia == "miercoles"){
					s.setMiercoles(evento);
				}
				if (dia == "Jueves" || dia == "jueves"){
					s.setJueves(evento);
				}
				if (dia == "Viernes" || dia == "viernes"){
					s.setViernes(evento);
				}
				if (dia == "Sabado" || dia == "sabado"){
					s.setSabado(evento);
				}
				if (dia == "Domingo" || dia == "domingo"){
					s.setDomingo(evento);
				}
			}
		}

	}
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
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
}