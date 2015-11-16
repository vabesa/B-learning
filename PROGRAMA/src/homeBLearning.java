import java.util.ArrayList;

import backend.Alumno;
import backend.Nivel;
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
    	String usuario = usertextlog.getText();
    	String clave = passlog.getText();
    	Alumno alumno_seleccionado = null;
    	Profesor profe_seleccionado = null;
    	for (Nivel n: Sistema.getINSTANCE().getNiveles()){
    		for (Alumno a: n.getAlumnos()){
    			if (a.getClave().equals(clave) && a.getUsuario().equals(usuario)){
        			alumno_seleccionado = a;
        		}
    		}
    		

    	}
    	for (Profesor p:Sistema.getINSTANCE().getProfes()){
    		if (p.getClave().equals(clave) && p.getUsuario().equals(usuario)){
    			profe_seleccionado = p;
    		}
    	}
    	if (alumno_seleccionado!=null){
    		mainGui.primaryStage.setScene(mainGui.scene_inicio);
    		mainGui.setAlumno_en_linea(alumno_seleccionado);
    	}else if (profe_seleccionado!=null){
    		mainGui.primaryStage.setScene(mainGui.scene_inicioprofe);
    		mainGui.setProfesor_en_linea(profe_seleccionado);
    		mainGui.inicioprofe_bl.inicio();
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
    	mainGui.primaryStage.setScene(mainGui.scene_signin);
    	mainGui.signin_bl.handlerNombre(signuser.getText());

    }

}
