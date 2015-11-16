import backend.Alumno;
import backend.Curso;
import backend.Nota;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class notasprofeBLearning {

    @FXML
    private TextField descripcion;

    @FXML
    private ComboBox<String> nota1;

    @FXML
    private Button contenido;

    @FXML
    private Label labelcurso;

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
    public void inicio(){

    	for(int i=10;i<71;i+=1){
    		nota1.getItems().addAll(Double.toString(i/10.0));
    		nota2.getItems().addAll(Double.toString(i/10.0));
    	}
    	alumno.getItems().clear();
    	for (Alumno a: mainGui.curso_en_linea.getNivel().getAlumnos()){
    		alumno.getItems().addAll(a.getNombre());
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
    public void actualizar_lista(){
    	inicio();
    	labelcurso.setText(mainGui.curso_en_linea.getNombre());
    	curso.getItems().clear();
    	for (Curso c: mainGui.profesor_en_linea.getCursos()){
    		curso.getItems().addAll(c.getNombre());
    	}
    }

    @FXML
    void handlerContacto(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_mensajeprofe);
    	mainGui.mensajeprofe_bl.inicio();

    }

    @FXML
    void handlerNotas(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_notasprofe);

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
    	actualizar_lista();
    }

    @FXML
    void handlerVerLista(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_verlistaprofe);
    	mainGui.verlistaprofe_bl.inicio();
    }

    @FXML
    void handlerSubirNota(ActionEvent event) {
    	for (Alumno a: mainGui.getCurso_en_linea().getNivel().getAlumnos()){
    		if (a.getNombre() == alumno.getValue()){
    			mainGui.getProfesor_en_linea().ponerNota(Double.parseDouble(nota1.getValue()), mainGui.getCurso_en_linea(), a);
    				}
    			}
    	alumno.getSelectionModel().clearSelection();
    	nota1.getSelectionModel().clearSelection();
    	nota2.getSelectionModel().clearSelection();
    		}


}

