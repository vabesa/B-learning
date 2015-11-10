import java.util.ArrayList;

import backend.Alumno;
import backend.Profesor;
import backend.Sistema;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class homeBLearning {

    @FXML
    private TextField signuser;

    @FXML
    private PasswordField signpass;

    @FXML
    private Button signin;

    @FXML
    private PasswordField passlog;

    @FXML
    private TextField usertextlog;

    @FXML
    private Button login;

    @FXML
    private TextField signmail;

    @FXML
    void handlerLogIn(ActionEvent event) {
    	ArrayList<Alumno> listanivel0 = Sistema.getINSTANCE().niveles.get(0).getAlumnos();
    	ArrayList<Alumno> listanivel1 = Sistema.getINSTANCE().niveles.get(1).getAlumnos();
    	ArrayList<Profesor> listaprofes = Sistema.getINSTANCE().profes;
    	String usuario = usertextlog.getText();
    	String clave = passlog.getText();
    	Alumno alumno_seleccionado = null;
    	Profesor profe_seleccionado = null;
    	for (Alumno a:listanivel0){
    		if (a.getClave().equals(clave) && a.getUsuario().equals(usuario)){
    			alumno_seleccionado = a;
    		}

    	}
    	for (Alumno a:listanivel1){
    		if (a.getClave().equals(clave) && a.getUsuario().equals(usuario)){
    			alumno_seleccionado = a;
    		}

    	}
    	for (Profesor p:listaprofes){
    		if (p.getClave().equals(clave) && p.getUsuario().equals(usuario)){
    			profe_seleccionado = p;
    		}
    	}
    	if (alumno_seleccionado!=null){
    		mainGui.primaryStage.setScene(mainGui.scene_inicio);
    		mainGui.alumno_en_linea = alumno_seleccionado;
    	}else if (profe_seleccionado!=null){
    		mainGui.primaryStage.setScene(mainGui.scene_inicioprofe);
    		mainGui.profesor_en_linea = profe_seleccionado;
    	}

    	/*
    	if (usertextlog.getText().equals("profe")){
    		mainGui.primaryStage.setScene(mainGui.scene_inicioprofe);
    	}else{
    		mainGui.primaryStage.setScene(mainGui.scene_inicio);
<<<<<<< HEAD

    	}
=======
    		mainGui.alumno_en_linea = Sistema.getINSTANCE().getNiveles().get(0).getAlumnos().get(0);

    	}*/

    }

    @FXML
    void handlerSignIn(ActionEvent event) {

    }

}
