
import backend.Curso;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class horarioprofeBLearning {

    @FXML
    private Button lista;

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
    private ComboBox<String> curso;

    @FXML
    private TableView<?> tabla;

    @FXML
    private TableColumn<?, ?> sabado;

    @FXML
    private TableColumn<?, ?> lunes;

    @FXML
    private Label labelcurso;

    @FXML
    public void inicio(){
    	labelcurso.setText(mainGui.curso_en_linea.getNombre());
    	curso.getItems().clear();
    	for (Curso c: mainGui.profesor_en_linea.getCursos()){
    		curso.getItems().addAll(c.getNombre());
    	}
    }

    @FXML
    void handlerContenido(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_mensajeprofe);
    	mainGui.mensajeprofe_bl.inicio();
    }

    @FXML
    void handlerHorario(ActionEvent event) {

    }

    @FXML
    void handlerContacto(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_mensajeprofe);
    	mainGui.mensajeprofe_bl.inicio();

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
    	mainGui.primaryStage.setScene(mainGui.scene_home);

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

}
