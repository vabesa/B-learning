import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import backend.Curso;
import backend.Nivel;
import backend.Sistema;
import backend.Topico;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class contenidoBLearning {
	public Nivel nivel;
	public MediaPlayer mediaplayer = new MediaPlayer(new Media("file:///C:/Users/Vicente%20Besa/Documents/cancion.mp3"));
	public Topico topico;

    @FXML
    private Button play;
    
    @FXML
    private Button pause;
    
    @FXML
    private Button stop;
    
    @FXML
    private VBox vboxql;
    
    @FXML
    private MediaView mediaViw;
	
    @FXML
    private ComboBox<String> cursos;

    @FXML
    private Button contenido;

    @FXML
    private Button contacto;

    @FXML
    private Button horario;

    @FXML
    private Button buscar;

    @FXML
    private Button notas;

    @FXML
    private Button cerrar;

    @FXML
    private Button calendario;

    @FXML
    private ComboBox<String> topicos;

    @FXML
    private Button perfil;

    @FXML
    void handlerContenido(ActionEvent event) {

    }

    @FXML
    void handlerHorario(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_horario);
    	mediaplayer.stop();

    }

    @FXML
    void handlerContacto(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_enviarmsj);
    	mediaplayer.stop();

    }

    @FXML
    void handlerNotas(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_notas);
    	mediaplayer.stop();

    }

    @FXML
    void handlerCalendario(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_calendario);
    	mediaplayer.stop();

    }

    @FXML
    void handlerPerfil(ActionEvent event) {

    }

    @FXML
    void handlerBuscar(ActionEvent event) {
    	mediaplayer.stop();
    	String ruta = "file:///C:/Users/Vicente%20Besa/Videos/DivX%20Movies/video.mp4";
    	for (Curso c:nivel.getCursos()){
    		for (Topico t:c.getTopicos()){
    			if (t.nombre.equals(topicos.getValue())){
    				ruta = t.ruta;
    				this.topico = t;
    			}
    		}
    	}
    	Media musicfile = new Media("file:///C:/Users/Vicente%20Besa/Documents/cancion.mp3");
    	Media videofile = new Media(ruta);
    	mediaplayer = new MediaPlayer(videofile);
    	mediaViw.setMediaPlayer(mediaplayer);
    	mediaViw.toFront();

  
    	
    
    }

    @FXML
    void handlerCerrar(ActionEvent event) {
    	mainGui.primaryStage.setScene(mainGui.scene_home);
    	mediaplayer.stop();

    }
    
    public void initialize(){
    	System.out.println(mainGui.alumno_en_linea.getNombre());
    	for (Nivel n: Sistema.getINSTANCE().getNiveles()){
    		if (n.equals(mainGui.alumno_en_linea.getNivel())){
    			this.nivel=n;
    		}
			
		}
    	cursos.getItems().clear();
    	for (Curso c: this.nivel.cursos){
    		cursos.getItems().addAll(c.nombre);
    	}
    	cursos.valueProperty().addListener(new ChangeListener<String>(){
			@Override
			public void changed(ObservableValue<? extends String>arg0,String antes,
					String despues){
				topicos.getItems().clear();
				for (Nivel n: Sistema.getINSTANCE().getNiveles()){
					for (Curso c:n.getCursos()){
						if (c.getNombre().equals(despues)){
							for (Topico t:c.getTopicos()){
								topicos.getItems().addAll(t.nombre);
							}
						}
					}
				}
			}
		});
    	
    }
    

    @FXML
    void play(ActionEvent event) {
    	mediaplayer.play();
    	try {
			TimeUnit.SECONDS.sleep(17);
			System.out.println("se espero 15 segundos");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	mediaplayer.stop();
    	mainGui.primaryStage.setScene(mainGui.scene_pregunta);
    	mainGui.pregunta_bl.iniciar(topico);
    	

    }

    @FXML
    void stop(ActionEvent event) {
    	mediaplayer.stop();

    }

    @FXML
    void pause(ActionEvent event) {
    	mediaplayer.pause();

    }


}

