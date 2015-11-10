import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class notasprofeBLearning {

    @FXML
    private TextField descripcion;

    @FXML
    private ComboBox<?> nota1;

    @FXML
    private Button contenido;

    @FXML
    private Button contacto;

    @FXML
    private Button horario;

    @FXML
    private ComboBox<String> nota2;

    @FXML
    private Button notas;

    @FXML
    private Button cerrar;

    @FXML
    private Button verLista;

    @FXML
    private Button calendario;

    @FXML
    private ComboBox<String> alumno;

    @FXML
    private Button perfil;

    @FXML
    private Button okcurso;

    @FXML
    private Button subirNota;

    @FXML
    private ComboBox<String> curso;

    @FXML
    public void initialize(){

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
    void handlerVerLista(ActionEvent event) {

    }

    @FXML
    void handlerSubirNota(ActionEvent event) {

    }

}
