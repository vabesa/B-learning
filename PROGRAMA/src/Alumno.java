
public class Alumno extends Usuario {
	
	private String colegio;
	private String curso;
	public static Alumno[] lista_alumnos = new Alumno[1000000];
	public static int numero_alumnos;
	
	
	public Alumno(String nombre, int edad, String rut, String nombre_usuario, String clave) {
		super(nombre, edad, rut, nombre_usuario, clave);
		lista_alumnos[numero_alumnos] = this;
		numero_alumnos++;
	}
	
	public static Alumno getUsuario(String nombre_usuario,String clave){
		Alumno usuario_elegigo = null;
		for (int i=0; i<numero_alumnos;i++){
			Alumno usuario_actual = Alumno.lista_alumnos[i];
			if (usuario_actual.getClave().equals(clave) && usuario_actual.getNombre_usuario().equals(nombre_usuario)){
				return usuario_actual;
			}
		}
		return usuario_elegigo;
	}
	public static boolean ingresar_usuario(String nombre_usuario,String clave){
		for (int i=0; i<numero_alumnos;i++){
			Usuario usuario_actual = Alumno.lista_alumnos[i];
			if (usuario_actual.getNombre_usuario().equals(nombre_usuario) && usuario_actual.getClave().equals(clave)){
				return true;
			}
		}
		return false;
	}
	
	

}
