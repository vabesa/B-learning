import javafx.fxml.FXML;
import backend.Curso;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class inicioprofeBLearning {

    @FXML
    private Button lista;

    @FXML
    private Button contenido;

    @FXML
    private Button contacto;

    @FXML
    private Button horario;

    @FXML
    private Button okcurso;

    @FXML
    private ComboBox<String> curso;

    @FXML
    private Button notas;

    @FXML
    private Button cerrar;

    @FXML
    private Button calendario;

    @FXML
    private Button perfil;
    
    @FXML
    private Label labelcurso;
    
    @FXML
    private void initialize(){
    	labelcurso.setText(mainGui.curso_en_linea.getNombre());
    	for (Curso c: mainGui.profesor_en_linea.getCursos()){
    		curso.getItems().addAll(c.getNombre());
    	}
    }

    @FXML
    void handlerContenido(ActionEvent event) {

    }

    @FXML
    void handlerHorario(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_horarioprofe);

    }

    @FXML
    void handlerContacto(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_mensajeprofe);

    }

    @FXML
    void handlerNotas(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_notasprofe);

    }

    @FXML
    void handlerCalendario(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_calendarioprofe);

    }

    @FXML
    void handlerPerfil(ActionEvent event) {

    }

    @FXML
    void handlerCerrar(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_home);

    }

    @FXML
    void handlerOK(ActionEvent event) {

    }

    @FXML
    void handlerLista(ActionEvent event) {

    }

}
