package listview;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class wte extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		BorderPane bp = new BorderPane();
		//Button bTop = new Button("Top");
		Button bCenter = new Button("Center");
		Button bBottom = new Button("Bottom");
		Button bLeft = new Button("Left");
		Button bRight = new Button("RIght");
		
		//bp.setTop(bTop);
		bp.setCenter(bCenter);
		bp.setBottom(bBottom);
		bp.setLeft(bLeft);
		bp.setRight(bRight);
			
		//bTop.setPrefSize(500, 20);
		//arg0.setResizable(false);//창사이즈 고정
		arg0.setScene(new Scene(bp, 300, 100));
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
