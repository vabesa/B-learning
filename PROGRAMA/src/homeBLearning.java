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
    	if (usertextlog.getText().equals("profe")){
    		mainGui.primaryStage.setScene(mainGui.scene_inicioprofe);
    	}else{
    		mainGui.primaryStage.setScene(mainGui.scene_inicio);
    		mainGui.alumno_en_linea = Sistema.getINSTANCE().getNiveles().get(0).getAlumnos().get(0);
    		
    	}

    }

    @FXML
    void handlerSignIn(ActionEvent event) {

    }

}
