package backend;

import java.util.ArrayList;

public class Nivel {

	public Nivel(String nombre) {
		super();
		this.nombre = nombre;
		this.cursos = new ArrayList<Curso>();
		this.alumnos = new ArrayList<Alumno>();
		this.semanas = new ArrayList<Semana>();
		this.meses = new ArrayList<String>();
		this.meses.add("Enero");//"Febrero","Marzo","Abril","Junio","Julio","Agosto","Septiembre","Noviembre","Diciembre")
		this.meses.add("Febrero");
		this.meses.add("Marzo");
		this.meses.add("Abril");
		this.meses.add("Mayo");
		this.meses.add("Junio");
		this.meses.add("Julio");
		this.meses.add("Agosto");
		this.meses.add("Septiembre");
		this.meses.add("Octubre");
		this.meses.add("Noviembre");
		this.meses.add("Diciembre");
		for (String s: this.meses){
			for (int i=1;i<5;i++){
				this.semanas.add(new Semana(i, s, "","","","","","",""));
			}
		}
	}
	public ArrayList<String> meses;
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
	public ArrayList<String> getMeses() {
		return meses;
	}
	public void setMeses(ArrayList<String> meses) {
		this.meses = meses;
	}
}
