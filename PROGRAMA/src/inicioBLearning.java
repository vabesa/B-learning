import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class inicioBLearning {

    @FXML
    private Button contenido;

    @FXML
    private Button contacto;

    @FXML
    private Button horario;

    @FXML
    private Button notas;

    @FXML
    private Button calendario;

    @FXML
    private Button perfil;

    @FXML
    private Button cerrar;

    @FXML
    void handlerContenido(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_contenido);
    	mainGui.contenido_bl.inicio();

    }

    @FXML
    void handlerHorario(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_horario);
    	mainGui.horario_bl.inicio();

    }

    @FXML
    void handlerContacto(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_enviarmsj);
    	mainGui.enviarmsj_bl.inicio();

    }

    @FXML
    void handlerNotas(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_notas);
    	mainGui.notas_bl.inicio();

    }

    @FXML
    void handlerCalendario(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_calendario);
    	mainGui.calendario_bl.inicio();

    }

    @FXML
    void handlerPerfil(ActionEvent event) {


    }
    @FXML
    void handlerCerrar(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_home);
    	mainGui.setAlumno_en_linea(null);
    }
}