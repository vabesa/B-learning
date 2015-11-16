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
    public void inicio(){
    	if (mainGui.getCurso_en_linea() == null){
    		labelcurso.setText("ninguno");
    	}
    	else if (mainGui.getCurso_en_linea() != null){
    	labelcurso.setText(mainGui.curso_en_linea.getNombre());
    	}
    	curso.getItems().clear();
    	for (Curso c: mainGui.profesor_en_linea.getCursos()){
    		curso.getItems().addAll(c.getNombre());
    	}
    }

    @FXML
    void handlerContenido(ActionEvent event) {

    }

    @FXML
    void handlerHorario(ActionEvent event) {
    	if (mainGui.getCurso_en_linea() != null){
    		mainGui.primaryStage.setScene(mainGui.scene_horarioprofe);
    		mainGui.horarioprofe_bl.inicio();
    	}
    	
    	

    }

    @FXML
    void handlerContacto(ActionEvent event) {
    	if (mainGui.getCurso_en_linea() != null){
    	mainGui.primaryStage.setScene(mainGui.scene_mensajeprofe);
    	mainGui.mensajeprofe_bl.inicio();
    	}
    }

    @FXML
    void handlerNotas(ActionEvent event) {
    	if (mainGui.getCurso_en_linea() != null){
    		mainGui.primaryStage.setScene(mainGui.scene_notasprofe);
    		mainGui.notasprofe_bl.actualizar_lista();
    	}
    }

    @FXML
    void handlerCalendario(ActionEvent event) {
    	if (mainGui.getCurso_en_linea() != null){
    	mainGui.primaryStage.setScene(mainGui.scene_calendarioprofe);
    	mainGui.calendarioprofe_bl.inicio();
    	}
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
    	else if (mainGui.getCurso_en_linea() == null){
    		labelcurso.setText("ninguno");
    	}
    }

    @FXML
    void handlerLista(ActionEvent event) {
    	if (mainGui.getCurso_en_linea() != null){
    	mainGui.primaryStage.setScene(mainGui.scene_verlistaprofe);
    	mainGui.verlistaprofe_bl.inicio();
    	}
    }

}
