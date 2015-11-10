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
    	String nombre_usuario = usertextlog.getText();
    	String clave = passlog.getText();
    	System.out.println(passlog.getText());
    	if (Alumno.ingresar_usuario(nombre_usuario, clave)){
    		Alumno usuario = Alumno.getUsuario(nombre_usuario, clave);
    		System.out.println(usuario.getClass());
    		mainGui.alumno_enlinea=usuario;
    		mainGui.primaryStage.setScene(mainGui.scene_inicio);
    	}

    }

    @FXML
    void handlerSignIn(ActionEvent event) {

    }

}
