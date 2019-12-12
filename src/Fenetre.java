
import java.util.LinkedList;
import java.util.List;

//import com.sun.prism.paint.Color;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;



public class Fenetre extends Application {
	//LinkedList<Ville> villelist;
	
	static Ecosys ecosysteme = new Ecosys(500,3,1000,1000);
	
			
	
	public static void main(String[] args) {
		ecosysteme.main();
		launch(args);
	}




	@Override
	public void start(Stage stage) throws Exception {
		try {
			//LinkedList<Ville> villelist = Ecosys.villes;
			
			Group mygroup = new Group();
			Scene myScene = new Scene (mygroup, 1000, 1000);
			
				
			
			for (Ville v : ecosysteme.villes) {
				
				Circle myCircle= new Circle(5);
				myCircle.setCenterX(v.position.x);
				myCircle.setCenterY(v.position.y);
				if (v.pays == 'F'){
					myCircle.setFill(Color.BLUE);
				}
				if (v.pays == 'A'){
					myCircle.setFill(Color.BLACK);
				}
				if (v.pays == 'E'){
					myCircle.setFill(Color.RED);
				}
				if (v.pays == 'O'){
					myCircle.setFill(Color.YELLOW);
				}
				
				mygroup.getChildren().addAll(myCircle);
			
			}
			stage.setScene(myScene);
			stage.setTitle("CECI EST NOTRE APPLICATION");
			stage.show();
			
				
				
				
			
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
		}
	
		
	
	}
