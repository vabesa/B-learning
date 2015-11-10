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
<<<<<<< HEAD
    
=======

>>>>>>> 12280a0933283dbf6a9c5a8d7096ad65c1ac1f46
    @FXML
    private Button perfil;

    @FXML
    void handlerContenido(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_contenido);
    }

    @FXML
    public void initialize(){
<<<<<<< HEAD
    	
=======
    	year.getItems().addAll("2015");

>>>>>>> 12280a0933283dbf6a9c5a8d7096ad65c1ac1f46
    }
    @FXML
    void handlerHorario(ActionEvent event) {

    }

    @FXML
    void handlerContacto(ActionEvent event) {

    }
    public ObservableList<Nota> data = FXCollections.observableArrayList();

    @FXML
    void handlerAno(ActionEvent event) {
<<<<<<< HEAD
    	//for (Nota n: mainGui.alumno_en_linea.getNotas()){
    		//data.add(n);
    	data.add(new Nota("matematicas"));
    	data.get(0);
    	curso.setCellValueFactory(
                new PropertyValueFactory<Nota, String>("Materia"));
=======
    	for (Nota n: mainGui.alumno_en_linea.getNotas()){
    		data.add(n);
    	}
    	curso.setCellValueFactory(
                new PropertyValueFactory<Nota, String>("Curso"));
>>>>>>> 12280a0933283dbf6a9c5a8d7096ad65c1ac1f46
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

    }

    @FXML
    void handlerPerfil(ActionEvent event) {

    }

    @FXML
    void handlerCerrar(ActionEvent event) {

    }

}
