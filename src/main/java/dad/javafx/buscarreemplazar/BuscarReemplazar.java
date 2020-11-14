package dad.javafx.buscarreemplazar;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BuscarReemplazar extends Application{
	
	private Controlador controlador = new Controlador();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Scene escena = new Scene(controlador.getVista(), 500, 300);
		
		primaryStage.setScene(escena);
		primaryStage.setTitle("Buscar y Reemplazar");
		primaryStage.show();
		
	}
	
	public static void main(String[] ar) {
		launch(ar);
	}

}
