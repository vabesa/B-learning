import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class mainGui extends Application{
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
		
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		primaryStage = stage;
		primaryStage.setTitle("B-learning service app");
		primaryStage.setScene(scene_home);
		primaryStage.show();
		
	}
}

