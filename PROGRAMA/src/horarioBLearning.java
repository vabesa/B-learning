import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class horarioBLearning {

    @FXML
    private Button contenido;

    @FXML
    private Button contacto;

    @FXML
    private Button horario;

    @FXML
    private TableColumn<?, ?> domingo;

    @FXML
    private TableColumn<?, ?> miercoles;

    @FXML
    private Button notas;

    @FXML
    private Button cerrar;

    @FXML
    private TableColumn<?, ?> martes;

    @FXML
    private TableColumn<?, ?> jueves;

    @FXML
    private Button calendario;

    @FXML
    private TableColumn<?, ?> viernes;

    @FXML
    private Button perfil;

    @FXML
    private Button okcurso;

    @FXML
    private ComboBox<?> curso;

    @FXML
    private TableView<?> tabla;

    @FXML
    private TableColumn<?, ?> sabado;

    @FXML
    private TableColumn<?, ?> lunes;

    public void inicio(){

    }

    @FXML
    void handlerContenido(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_contenido);
    	mainGui.contenido_bl.inicio();

    }

    @FXML
    void handlerHorario(ActionEvent event) {

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

    @FXML
    void handlerOK(ActionEvent event) {

    }

}
