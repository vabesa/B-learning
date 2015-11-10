package backend;

import java.util.ArrayList;

public class Sistema {

	public Sistema() {
		super();
		this.niveles = new ArrayList<Nivel>();
		this.profes = new ArrayList<Profesor>();
		this.niveles.add(new Nivel("8vo basico"));
		this.niveles.add(new Nivel("7mo basico"));
		this.profes.add(new Profesor("Shruti", "Matematicas","clave123","profe1"));
		this.profes.add(new Profesor ("Leo", "Lenguaje","clave321","profe2"));
		this.niveles.get(0).getCursos().add(new Curso(this.niveles.get(0), "Matematicas 7mo", this.profes.get(0)));
		this.niveles.get(1).getCursos().add(new Curso(this.niveles.get(1), "Lenguaje 8vo", this.profes.get(1)));
		this.niveles.get(0).getAlumnos().add(new Alumno("Ignacio Toresano", "13", this.niveles.get(0),"nacho123","itoresano"));
		this.niveles.get(1).getAlumnos().add(new Alumno("ROlf heerwagen", "33", this.niveles.get(1),"rolf123","rheerwagen"));
		this.niveles.get(0).getAlumnos().add(new Alumno("Vicente Besa", "13", this.niveles.get(0),"besa123","vabesa"));
		this.niveles.get(1).getAlumnos().add(new Alumno("Jorge Garcia-Huidobro", "14", this.niveles.get(1),"garcia123","jgarcia"));
		this.niveles.get(0).getAlumnos().add(new Alumno("Juan Pablo Schele", "12", this.niveles.get(0),"schele123","jpschele"));
		this.niveles.get(0).getCursos().get(0).topicos.add(new Topico("fracciones",this.niveles.get(0).getCursos().get(0) , "file:///C:/Users/Vicente%20Besa/Videos/DivX%20Movies/video2.mp4"));
		this.niveles.get(1).getCursos().get(0).topicos.add(new Topico("Figuras literarias",this.niveles.get(1).getCursos().get(0) , "file:///C:/Users/Vicente%20Besa/Videos/DivX%20Movies/video.mp4"));
		


	}

	private static Sistema INSTANCE = new Sistema();

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
	public static Sistema getINSTANCE() {
		return INSTANCE;
	}
	public static void setINSTANCE(Sistema iNSTANCE) {
		INSTANCE = iNSTANCE;
	}


}
