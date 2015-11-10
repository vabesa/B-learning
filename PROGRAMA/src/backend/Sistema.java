package backend;

import java.util.ArrayList;

public class Sistema {

	public Sistema() {
		super();
		this.niveles = new ArrayList<Nivel>();
		this.profes = new ArrayList<Profesor>();
	}
	public ArrayList<Nivel> niveles;
	public ArrayList<Profesor> profes;
	public ArrayList<Nivel> getNiveles() {
		return niveles;
	}
	public void setNiveles(ArrayList<Nivel> niveles) {
		this.niveles = niveles;
	}
	public ArrayList<Profesor> getProfes() {
		return profes;
	}
	public void setProfes(ArrayList<Profesor> profes) {
		this.profes = profes;
	}


}
