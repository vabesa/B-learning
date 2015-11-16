package backend;

public class Topico {

	public String nombre;
	public Curso curso;
	public String ruta;
	public String pregunta;
	public String respuesta_correcta;
	public String respuesta_incorrecta1;
	public String respuesta_incorrecta2;
	public String respuesta_incorrecta3;
	
	
	public Topico(String nombre, Curso curso, String ruta,String respuesta_correcta,
			String respuesta_incorrecta1, String respuesta_incorrecta2, String respuesta_incorrecta3,
			String pregunta) {
		this.nombre = nombre;
		this.curso = curso;
		this.ruta = ruta;
		this.respuesta_correcta = respuesta_correcta;
		this.respuesta_incorrecta1 = respuesta_incorrecta1;
		this.respuesta_incorrecta2 = respuesta_incorrecta2;
		this.respuesta_incorrecta3 = respuesta_incorrecta3;
		this.pregunta = pregunta;
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
