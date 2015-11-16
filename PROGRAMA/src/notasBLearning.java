import backend.Nota;
import backend.Semana;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class notasBLearning {

	@FXML
    private Button contenido;

    @FXML
    private Button contacto;

    @FXML
    private TableColumn<Nota, String> tusnotas;

    @FXML
    private Button horario;

    @FXML
    private ComboBox<String> year;

    @FXML
    private TableColumn<Nota, String> curso;

    @FXML
    private TableColumn<Nota, String> promedio;

    @FXML
    private Button notas;

    @FXML
    private Button cerrar;

    @FXML
    private Button calendario;

    @FXML
    private TableView<Nota> table;

    @FXML
    private Button perfil;

    @FXML
    void handlerContenido(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_contenido);
    	mainGui.contenido_bl.inicio();
    }

    @FXML
    public void inicio(){
    	year.getItems().clear();
    	year.getItems().addAll("2015");

    }
    @FXML
    void handlerHorario(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_horario);
    	mainGui.horario_bl.inicio();
    }

    @FXML
    void handlerContacto(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_enviarmsj);
    	mainGui.enviarmsj_bl.inicio();

    }
    public ObservableList<Nota> data = FXCollections.observableArrayList();

    @FXML
    void handlerAno(ActionEvent event) {
    	data.clear();
    	curso.setCellValueFactory(
                new PropertyValueFactory<Nota, String>("Materia"));

    	curso.setCellValueFactory(
                new PropertyValueFactory<Nota, String>("Materia"));
    	for (Nota n: mainGui.alumno_en_linea.getNotas()){
    		data.add(n);
    	}
    	for (Nota n: mainGui.alumno_en_linea.getNotas()){
    		n.setPromedio();
    		n.setPromedio_string();
    		}
    	curso.setCellValueFactory(
                new PropertyValueFactory<Nota, String>("Curso"));
    	tusnotas.setCellValueFactory(
                new PropertyValueFactory<Nota, String>("Notas"));
    	promedio.setCellValueFactory(
                new PropertyValueFactory<Nota, String>("Promedio"));
    	table.setItems(data);
    }
    @FXML
    void handlerNotas(ActionEvent event) {

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

}
