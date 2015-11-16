import java.util.ArrayList;

import backend.Curso;
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

public class calendarioBLearning {

    @FXML
    private Button contenido;

    @FXML
    private Button contacto;

    @FXML
    private Button horario;

    @FXML
    private TableColumn<Semana, String> domingo;

    @FXML
    private TableColumn<Semana, String> miercoles;

    @FXML
    private Button notas;

    @FXML
    private Button cerrar;

    @FXML
    private TableColumn<Semana, String> martes;

    @FXML
    private TableColumn<Semana, String> jueves;

    @FXML
    private Button calendario;

    @FXML
    private TableColumn<Semana, String> viernes;

    @FXML
    private Button perfil;

    @FXML
    private ComboBox<String> mes;

    @FXML
    private TableView<Semana> tabla;

    @FXML
    private TableColumn<Semana, String> sabado;

    @FXML
    private TableColumn<Semana, String> lunes;

    @FXML
    void handlerContenido(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_contenido);
    	mainGui.contenido_bl.inicio();

    }
    @FXML
    public void inicio(){
    	llenarCombo();
    }
    public void llenarCombo(){
    	mes.getItems().addAll("Enero","Febrero","Marzo","Abril","Junio","Julio","Agosto","Septiembre","Noviembre","Diciembre");
    }
    public ObservableList<Semana> data = FXCollections.observableArrayList();
    public void handlerMes(){
    	for (Semana s: mainGui.alumno_en_linea.getNivel().getSemanas()){
    		if (s.getMes() == mes.getValue()){
    			data.add(s);
    		}
    	}
    	lunes.setCellValueFactory(
                new PropertyValueFactory<Semana, String>("Lunes"));
    	martes.setCellValueFactory(
                new PropertyValueFactory<Semana, String>("Martes"));
    	miercoles.setCellValueFactory(
                new PropertyValueFactory<Semana, String>("Miercoles"));
    	jueves.setCellValueFactory(
                new PropertyValueFactory<Semana, String>("Jueves"));
    	viernes.setCellValueFactory(
                new PropertyValueFactory<Semana, String>("Viernes"));
    	sabado.setCellValueFactory(
                new PropertyValueFactory<Semana, String>("Sabado"));
    	domingo.setCellValueFactory(
                new PropertyValueFactory<Semana, String>("Domingo"));
    	tabla.setItems(data);
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

    @FXML
    void handlerNotas(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_notas);
    	mainGui.notas_bl.inicio();

    }

    @FXML
    void handlerCalendario(ActionEvent event) {

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
