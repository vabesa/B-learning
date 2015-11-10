import backend.Alumno;
import backend.Profesor;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class mainGui extends Application{
	public static Alumno alumno_en_linea = null;
	public static Profesor profesor_en_linea = null;
	public static Stage primaryStage;

	public static Parent home_Blearning;
	public static FXMLLoader loader_home = new FXMLLoader();
	public static homeBLearning home_bl;
	public static Scene scene_home;

	public static Parent inicio_Blearning;
	public static FXMLLoader loader_inicio = new FXMLLoader();
	public static inicioBLearning inicio_bl;
	public static Scene scene_inicio;

	public static Parent contenido_Blearning;
	public static FXMLLoader loader_contenido = new FXMLLoader();
	public static contenidoBLearning contenido_bl;
	public static Scene scene_contenido;

	public static Parent calendario_Blearning;
	public static FXMLLoader loader_calendario = new FXMLLoader();
	public static calendarioBLearning calendario_bl;
	public static Scene scene_calendario;

	public static Parent enviarmsj_Blearning;
	public static FXMLLoader loader_enviarmsj = new FXMLLoader();
	public static enviarmsjBLearning enviarmsj_bl;
	public static Scene scene_enviarmsj;

	public static Parent horario_Blearning;
	public static FXMLLoader loader_horario = new FXMLLoader();
	public static horarioBLearning horario_bl;
	public static Scene scene_horario;

	public static Parent inicioprofe_Blearning;
	public static FXMLLoader loader_inicioprofe = new FXMLLoader();
	public static inicioprofeBLearning inicioprofe_bl;
	public static Scene scene_inicioprofe;

	public static Parent notas_Blearning;
	public static FXMLLoader loader_notas = new FXMLLoader();
	public static notasBLearning notas_bl;
	public static Scene scene_notas;

	public static Parent calendarioprofe_Blearning;
	public static FXMLLoader loader_calendarioprofe = new FXMLLoader();
	public static calendarioprofeBLearning calendarioprofe_bl;
	public static Scene scene_calendarioprofe;

	public static Parent horarioprofe_Blearning;
	public static FXMLLoader loader_horarioprofe = new FXMLLoader();
	public static horarioprofeBLearning horarioprofe_bl;
	public static Scene scene_horarioprofe;

	public static Parent mensajeprofe_Blearning;
	public static FXMLLoader loader_mensajeprofe = new FXMLLoader();
	public static mensajeprofeBLearning mensajeprofe_bl;
	public static Scene scene_mensajeprofe;

	public static Parent notasprofe_Blearning;
	public static FXMLLoader loader_notasprofe = new FXMLLoader();
	public static notasprofeBLearning notasprofe_bl;
	public static Scene scene_notasprofe;

	public static Parent verlistaprofe_Blearning;
	public static FXMLLoader loader_verlistaprofe = new FXMLLoader();
	public static verlistaprofeBLearning verlistaprofe_bl;
	public static Scene scene_verlistaprofe;

	public static Parent signin_Blearning;
	public static FXMLLoader loader_signin = new FXMLLoader();
	public static signinBLearning signin_bl;
	public static Scene scene_signin;

	public static void main(String[] args){
		launch(args);

	}

	@Override
	public void init() throws Exception {

		loader_home.setLocation(mainGui.class.getResource("login_signin.fxml"));
		home_Blearning = (Parent) loader_home.load();
		home_bl = loader_home.getController();
		scene_home = new Scene(home_Blearning);

		loader_inicio.setLocation(mainGui.class.getResource("inicio.fxml"));
		inicio_Blearning = (Parent) loader_inicio.load();
		inicio_bl = loader_inicio.getController();
		scene_inicio = new Scene(inicio_Blearning);

		loader_contenido.setLocation(mainGui.class.getResource("contenido.fxml"));
		contenido_Blearning = (Parent) loader_contenido.load();
		contenido_bl = loader_contenido.getController();
		scene_contenido = new Scene(contenido_Blearning);

		loader_calendario.setLocation(mainGui.class.getResource("calendario.fxml"));
		calendario_Blearning = (Parent) loader_calendario.load();
		calendario_bl = loader_calendario.getController();
		scene_calendario = new Scene(calendario_Blearning);

		loader_enviarmsj.setLocation(mainGui.class.getResource("enviarmsje.fxml"));
		enviarmsj_Blearning = (Parent) loader_enviarmsj.load();
		enviarmsj_bl = loader_enviarmsj.getController();
		scene_enviarmsj = new Scene(enviarmsj_Blearning);

		loader_horario.setLocation(mainGui.class.getResource("horario.fxml"));
		horario_Blearning = (Parent) loader_horario.load();
		horario_bl = loader_horario.getController();
		scene_horario = new Scene(horario_Blearning);

		loader_inicioprofe.setLocation(mainGui.class.getResource("inicio_profe.fxml"));
		inicioprofe_Blearning = (Parent) loader_inicioprofe.load();
		inicioprofe_bl = loader_inicioprofe.getController();
		scene_inicioprofe= new Scene(inicioprofe_Blearning);

		loader_notas.setLocation(mainGui.class.getResource("notas.fxml"));
		notas_Blearning = (Parent) loader_notas.load();
		notas_bl = loader_notas.getController();
		scene_notas= new Scene(notas_Blearning);

		loader_calendarioprofe.setLocation(mainGui.class.getResource("profe_calendario.fxml"));
		calendarioprofe_Blearning = (Parent) loader_calendarioprofe.load();
		calendarioprofe_bl = loader_calendarioprofe.getController();
		scene_calendarioprofe= new Scene(calendarioprofe_Blearning);

		loader_horarioprofe.setLocation(mainGui.class.getResource("profe_horario.fxml"));
		horarioprofe_Blearning = (Parent) loader_horarioprofe.load();
		horarioprofe_bl = loader_horarioprofe.getController();
		scene_horarioprofe= new Scene(horarioprofe_Blearning);

		loader_mensajeprofe.setLocation(mainGui.class.getResource("profe_mensaje.fxml"));
		mensajeprofe_Blearning = (Parent) loader_mensajeprofe.load();
		mensajeprofe_bl = loader_mensajeprofe.getController();
		scene_mensajeprofe= new Scene(mensajeprofe_Blearning);

		loader_notasprofe.setLocation(mainGui.class.getResource("profe_notas.fxml"));
		notasprofe_Blearning = (Parent) loader_notasprofe.load();
		notasprofe_bl = loader_notasprofe.getController();
		scene_notasprofe= new Scene(notasprofe_Blearning);

		loader_verlistaprofe.setLocation(mainGui.class.getResource("profe_verlista.fxml"));
		verlistaprofe_Blearning = (Parent) loader_verlistaprofe.load();
		verlistaprofe_bl = loader_verlistaprofe.getController();
		scene_verlistaprofe = new Scene(verlistaprofe_Blearning);

		loader_signin.setLocation(mainGui.class.getResource("signin.fxml"));
		signin_Blearning = (Parent) loader_signin.load();
		signin_bl = loader_signin.getController();
		scene_signin = new Scene(signin_Blearning);







	}

	@Override
	public void start(Stage stage) throws Exception {
		primaryStage = stage;
		primaryStage.setTitle("B-learning service app");
		primaryStage.setScene(scene_home);
		primaryStage.show();

	}
}

