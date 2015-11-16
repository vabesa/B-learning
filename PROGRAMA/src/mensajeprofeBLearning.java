import backend.Alumno;
import backend.Curso;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class mensajeprofeBLearning {

    @FXML
    private Button lista;

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
    private Button perfil;

    @FXML
    private ComboBox<String> destinatario;

    @FXML
    private Button enviar;

    @FXML
    private Button okcurso;

    @FXML
    private ComboBox<String> curso;

    @FXML
    private TextField asunto;

    @FXML
    private TextArea mensaje;

    @FXML
    private Label labelcurso;

    @FXML
    public void inicio(){
    	labelcurso.setText(mainGui.curso_en_linea.getNombre());
    	curso.getItems().clear();
    	for (Curso c: mainGui.profesor_en_linea.getCursos()){
    		curso.getItems().addAll(c.getNombre());
    	}
    	destinatario.getSelectionModel().clearSelection();
    	destinatario.getItems().clear();
    	for (Alumno a: mainGui.curso_en_linea.getNivel().getAlumnos()){
    		destinatario.getItems().addAll(a.getNombre());
    	}
    	
    }

    @FXML
    void handlerContenido(ActionEvent event) {

    }

    @FXML
    void handlerHorario(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_horarioprofe);
    	mainGui.horarioprofe_bl.inicio();

    }

    @FXML
    void handlerContacto(ActionEvent event) {

    }

    @FXML
    void handlerNotas(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_notasprofe);
    	mainGui.notasprofe_bl.actualizar_lista();

    }

    @FXML
    void handlerCalendario(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_calendarioprofe);
    	mainGui.calendarioprofe_bl.inicio();

    }

    @FXML
    void handlerPerfil(ActionEvent event) {

    }

    @FXML
    void handlerCerrar(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_home);
    	mainGui.setProfesor_en_linea(null);
    	mainGui.setCurso_en_linea(null);

    }

    @FXML
    void handlerOK(ActionEvent event) {
    	for (Curso c: mainGui.getProfesor_en_linea().getCursos()){
    		if (curso.getValue() == c.getNombre()){
    			mainGui.setCurso_en_linea(c);
    		}
    	}
    	if (mainGui.getCurso_en_linea() != null){
    		labelcurso.setText(mainGui.getCurso_en_linea().getNombre());
    	}
    	inicio();
    }

    @FXML
    void handlerLista(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_verlistaprofe);
    	mainGui.verlistaprofe_bl.inicio();

    }

    @FXML
    void handlerEnviar(ActionEvent event) {
    	asunto.clear();
    	mensaje.clear();
    	destinatario.getSelectionModel().clearSelection();
    }

}
