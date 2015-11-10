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
    public void initialize(){
    	labelcurso.setText(mainGui.curso_en_linea.getNombre());
    	for (Curso c: mainGui.profesor_en_linea.getCursos()){
    		curso.getItems().addAll(c.getNombre());
    	}
    	for(double i=1;i<7.1;i+=0.1){
    		nota1.getItems().addAll(String.valueOf(i));
    		nota2.getItems().addAll(String.valueOf(i));
    	}
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
    	for (Curso c: mainGui.profesor_en_linea.getCursos()){
    		if (c.getNombre() == curso.getValue()){
    			mainGui.curso_en_linea = c;
    		}
    	}
    	labelcurso.setText(mainGui.curso_en_linea.getNombre());

    }

    @FXML
    void handlerVerLista(ActionEvent event) {

    }

    @FXML
    void handlerSubirNota(ActionEvent event) {
    	for (Alumno a: mainGui.curso_en_linea.getNivel().getAlumnos()){
    		if (a.getNombre() == alumno.getValue()){
    			mainGui.profesor_en_linea.ponerNota(Double.parseDouble(nota1.getValue()), mainGui.curso_en_linea, a);
    				}
    			}
    	alumno.getSelectionModel().clearSelection();
    	nota1.getSelectionModel().clearSelection();
    	nota2.getSelectionModel().clearSelection();
    		}


}

