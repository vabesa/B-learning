import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class contenidoBLearning {
	

    @FXML
    private MediaView mediaViw;
	
    @FXML
    private ComboBox<?> cursos;

    @FXML
    private Button contenido;

    @FXML
    private Button contacto;

    @FXML
    private Button horario;

    @FXML
    private Button buscar;

    @FXML
    private Button notas;

    @FXML
    private Button cerrar;

    @FXML
    private Button calendario;

    @FXML
    private ComboBox<?> topicos;

    @FXML
    private Button perfil;

    @FXML
    void handlerContenido(ActionEvent event) {

    }

    @FXML
    void handlerHorario(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_horario);

    }

    @FXML
    void handlerContacto(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_enviarmsj);

    }

    @FXML
    void handlerNotas(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_notas);

    }

    @FXML
    void handlerCalendario(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_calendario);

    }

    @FXML
    void handlerPerfil(ActionEvent event) {

    }

    @FXML
    void handlerBuscar(ActionEvent event) {
    	Media musicfile = new Media("file:///C:/Users/Vicente%20Besa/Documents/cancion.mp3");
    	Media videofile = new Media("file:///C:/Users/Vicente%20Besa/Documents/video.mp4");
    	MediaPlayer mediaplayer = new MediaPlayer(videofile);
    	mediaViw.setMediaPlayer(mediaplayer);
    	mediaplayer.play();
    	
    
    }

    @FXML
    void handlerCerrar(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_home);

    }

}

