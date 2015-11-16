import backend.Curso;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class enviarmsjBLearning {

    @FXML
    private Button contenido;

    @FXML
    private Button contacto;

    @FXML
    private Button enviar;

    @FXML
    private Button horario;

    @FXML
    private Button notas;

    @FXML
    private Button cerrar;

    @FXML
    private TextField asunto;

    @FXML
    private Button calendario;

    @FXML
    private TextArea mensaje;

    @FXML
    private Button perfil;

    @FXML
    private ComboBox<String> destinatario;
    @FXML
    public void inicio(){
    	mostardest();
    }
    public void mostardest(){
    	destinatario.getItems().clear();
    	for (Curso c: mainGui.alumno_en_linea.getNivel().getCursos()){
    		destinatario.getItems().add(c.profesor.getNombre());
    	}
    }
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
    void handlerEnviar(ActionEvent event) {
    	mensaje.clear();
    	asunto.clear();
    }

}
