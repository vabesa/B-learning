package backend;

public class Topico {

	public String nombre;
	public Curso curso;
	public String ruta;
	
	
	public Topico(String nombre, Curso curso, String ruta) {
		this.nombre = nombre;
		this.curso = curso;
		this.ruta = ruta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public String getRuta() {
		return ruta;
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}


}
