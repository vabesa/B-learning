
public class Usuario extends Persona{
	
	private String nombre_usuario;
	private String clave;
	private String correo_electronico;
	public static Usuario[] lista_usuarios = new Usuario[10000];
	public static int numero_usuarios;
	
	
	public Usuario(String nombre, int edad, String rut, String nombre_usuario,
			String clave) {
		super(nombre, edad, rut);
		this.nombre_usuario = nombre_usuario;
		this.clave = clave;
		Usuario.lista_usuarios[numero_usuarios]=this;
		numero_usuarios++;
	}
	public static Usuario getUsuario(String nombre_usuario,String clave){
		Usuario usuario_elegigo = null;
		for (int i=0; i<numero_usuarios;i++){
			Usuario usuario_actual = Usuario.lista_usuarios[i];
			if (usuario_actual.getClave().equals(clave) && usuario_actual.getNombre_usuario().equals(nombre_usuario)){
				return usuario_actual;
			}
		}
		return usuario_elegigo;
	}
	public static boolean ingresar_usuario(String nombre_usuario,String clave){
		for (int i=0; i<numero_usuarios;i++){
			Usuario usuario_actual = Usuario.lista_usuarios[i];
			if (usuario_actual.getNombre_usuario().equals(nombre_usuario) && usuario_actual.getClave().equals(clave)){
				return true;
			}
		}
		return false;
	}
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getCorreo_electronico() {
		return correo_electronico;
	}
	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}
	
	
	


}
