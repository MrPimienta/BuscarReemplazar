package dad.javafx.buscarreemplazar;


import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class Vista extends BorderPane{
	
	//DECLARACION TEXTFIELDS CENTRO
	private TextField tf_buscar;
	private TextField tf_reemplazar;
	
	//DECLARACION CHECKBOXES
	private CheckBox ch_mayusminus;
	private CheckBox ch_expregular;
	private CheckBox ch_buscaratras;
	private CheckBox ch_resaltar;
	
	
	//DECLARACION BOTONES PARTE DERECHA
	private Button bt_buscar;
	private Button bt_reemplazar;
	private Button bt_reemplazartodo;
	private Button bt_cerrar;
	private Button bt_ayuda;
	
	
	
	public Vista() {  //CONSTRUCTOR
		super();
		
		//PARTE DERECHA///////////////////////////////////////////
		bt_buscar = new Button();
		bt_buscar.setText("Buscar");
		bt_buscar.setMaxWidth(100.0);
		
		bt_reemplazar = new Button();
		bt_reemplazar.setText("Reemplazar");
		bt_reemplazar.setMaxWidth(100.0);
		
		bt_reemplazartodo = new Button();
		bt_reemplazartodo.setText("Reemplazar todo");
		bt_reemplazartodo.setMaxWidth(100.0);
		
		bt_cerrar = new Button();
		bt_cerrar.setText("Cerrar");
		bt_cerrar.setMaxWidth(100.0);
		
		bt_ayuda = new Button();
		bt_ayuda.setText("Ayuda");
		bt_ayuda.setMaxWidth(100.0);
		
		VBox derecha = new VBox();
		derecha.getChildren().addAll(bt_buscar, bt_reemplazar, bt_reemplazartodo, bt_cerrar, bt_ayuda);
		derecha.setSpacing(5);
		//////////////////////////////////////////////////////
		
		
		//PARTE IZQUIERDA/////////////////////////////////////
		GridPane izquierda = new GridPane();
		izquierda.setPadding(new Insets(5));
		izquierda.setHgap(5);
		izquierda.setVgap(5);
		
		/*Etiquetas y TextFields*/
		Label lb_buscar = new Label("Buscar:");
		Label lb_reemplazar = new Label("Reemplazar con:");
		izquierda.addRow(0, lb_buscar, tf_buscar); /*Asignacion de cada fila*/
		izquierda.addRow(1, lb_reemplazar, tf_reemplazar); /*Asignacion de cada fila*/
		//////////////////////////////////////////////////////
		
		
		//PARTE DE LOS CHECKBOX//////////////////////////////
		GridPane gp_checkbox = new GridPane();
		gp_checkbox.setPadding(new Insets(5, 5, 0, 0));
		gp_checkbox.setHgap(10);
		gp_checkbox.setVgap(5);
		
		ch_mayusminus = new CheckBox();
		ch_expregular = new CheckBox();
		ch_buscaratras = new CheckBox();
		ch_resaltar = new CheckBox();
		
		gp_checkbox.addRow(0, ch_mayusminus, new Label("Mayúsculas y minusculas"), ch_buscaratras, new Label("Buscar hacia atras"));
		gp_checkbox.addRow(1, ch_expregular, new Label("Expresión regular"), ch_resaltar, new Label("Resaltar resultado"));
		/////////////////////////////////////////////////////
		
		izquierda.add(gp_checkbox,1,2);
		
		this.setRight(derecha);
		this.setCenter(izquierda);
		
	}
}
