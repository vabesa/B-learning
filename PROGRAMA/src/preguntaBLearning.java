import java.util.concurrent.TimeUnit;

import backend.Curso;
import backend.Nivel;
import backend.Sistema;
import backend.Topico;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class preguntaBLearning {
	public Topico topico;
	public Image correcto;
	public Image incorrecto;
    @FXML
    private Button play;

    @FXML
    private ComboBox<?> cursos;

    @FXML
    private Button contenido;

    @FXML
    private Button contacto;

    @FXML
    private Button horario;

    @FXML
    private Button notas;

    @FXML
    private Button cerrar;

    @FXML
    private Button calendario;

    @FXML
    private ComboBox<?> topicos;

    @FXML
    private Button pause;

    @FXML
    private Button perfil;

    @FXML
    private Label pregunta;

    @FXML
    private ComboBox<String> respuestas;

    @FXML
    private Button stop;

    @FXML
    private ImageView verimagen;

    @FXML
    private Button buscar;

    @FXML
    void handlerContenido(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_contenido);

    }

    @FXML
    void handlerHorario(ActionEvent event) {

    }

    @FXML
    void handlerContacto(ActionEvent event) {

    }

    @FXML
    void handlerNotas(ActionEvent event) {

    }

    @FXML
    void handlerCalendario(ActionEvent event) {

    }

    @FXML
    void handlerPerfil(ActionEvent event) {

    }

    @FXML
    void handlerBuscar(ActionEvent event) {

    }

    @FXML
    void handlerCerrar(ActionEvent event) {

    }

    @FXML
    void play(ActionEvent event) {

    }

    @FXML
    void stop(ActionEvent event) {

    }

    @FXML
    void pause(ActionEvent event) {

    }

    @FXML
    void responder(ActionEvent event) {
    	String respuesta = respuestas.getValue();
    	if (respuesta.equals(this.topico.respuesta_correcta)){
    		verimagen.setImage(correcto);
    		
    	}else{
    		verimagen.setImage(incorrecto);
    		System.out.println("Incorrecto");
    		
    		
    	}

    }

    
    public void iniciar(Topico topico){
    	correcto = new Image("file:///C:/Users/Vicente%20Besa/Documents/correcto.png");
    	incorrecto = new Image("file:///C:/Users/Vicente%20Besa/Documents/incorrecto.png");
    	this.topico=topico;
    	respuestas.getItems().clear();
    	respuestas.getItems().addAll(this.topico.respuesta_incorrecta1,this.topico.respuesta_correcta,this.topico.respuesta_incorrecta2,this.topico.respuesta_incorrecta3);
    	pregunta.setText(this.topico.pregunta);
    	
    }
    	

}
