import backend.Alumno;
import backend.Curso;
import backend.Nota;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class verlistaprofeBLearning {

    @FXML
    private ListView<?> lista;

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
    private Button verLista;

    @FXML
    private Button calendario;

    @FXML
    private Button perfil;

    @FXML
    private TableColumn<Alumno, String> alumno;

    @FXML
    private TableView<Alumno> table;

    @FXML
    private Label labelcurso;
    
    public ObservableList<Alumno> data = FXCollections.observableArrayList();

    @FXML
    public void inicio(){
    	labelcurso.setText(mainGui.curso_en_linea.getNombre());
    	curso.getItems().clear();
    	for (Curso c: mainGui.profesor_en_linea.getCursos()){
    		curso.getItems().addAll(c.getNombre());
    	}
    	data.clear();
    	alumno.setCellValueFactory(
                new PropertyValueFactory<Alumno, String>("Nombre"));
    	for (Alumno a: mainGui.getCurso_en_linea().getNivel().getAlumnos()){
    		data.add(a);
    	}
    	table.setItems(data);
 
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
    void handlerVerLista(ActionEvent event) {

    }

}
