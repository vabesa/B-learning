import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class signinBLearning {

	public ArrayList<String> lista = new ArrayList<String>();

    @FXML
    private ComboBox<String> curso_problema;

    @FXML
    private ComboBox<String> curso;

    @FXML
    private ComboBox<String> promedio;

    @FXML
    private Button signin;

    @FXML
    private ComboBox<String> año_ingreso;

    @FXML
    private AnchorPane nombre_usado;

    @FXML
    private TextField colegio;

    @FXML
    private Label nombre;

    @FXML
    void handlerSignIn(ActionEvent event) {
    	curso.getSelectionModel().clearSelection();
    	año_ingreso.getSelectionModel().clearSelection();
    	curso_problema.getSelectionModel().clearSelection();
    	promedio.getSelectionModel().clearSelection();
    	mainGui.primaryStage.setScene(mainGui.scene_home);


    }

    public void handlerNombre(String name){
    	colegio.clear();
    	curso.getItems().clear();
    	promedio.getItems().clear();
    	curso_problema.getItems().clear();
    	año_ingreso.getItems().clear();

    	nombre.setText(name);
    	curso.getItems().addAll("1ero_basico");
    	curso.getItems().addAll("2do basico");
    	curso.getItems().addAll("3ero basico");
    	curso.getItems().addAll("4to basico");
    	curso.getItems().addAll("5to basico");
    	curso.getItems().addAll("6to basico");
    	curso.getItems().addAll("7mo basico");
    	curso.getItems().addAll("8vo basico");
    	curso.getItems().addAll("1ero medio");
    	curso.getItems().addAll("2do medio");
    	curso.getItems().addAll("3ero medio");
    	curso.getItems().addAll("4to medio");
    	for(int i=2015;i>1990;i-=1){
    		año_ingreso.getItems().addAll(Integer.toString(i));
    	}
    	for(int i=10;i<71;i+=1){
    		promedio.getItems().addAll(Double.toString(i/10.0));
    	}
    	curso_problema.getItems().addAll("Ninguno");
    	curso_problema.getItems().addAll("Matematicas");
    	curso_problema.getItems().addAll("Lenguaje");
    	curso_problema.getItems().addAll("Historia");
    	curso_problema.getItems().addAll("Ingles");
    	curso_problema.getItems().addAll("Ciencias");
    	curso_problema.getItems().addAll("Todos");
    }

}
