package button;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Ex01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		Pane canvas = new Pane();
		Button btn = new Button();
		Button btn2 = new Button();
		ImageView img = new ImageView("/img/smilerere.png");
		
		//btn.setGraphic(new ImageView("/img/smilerere.png"));
		btn.setGraphic(img);
		btn.setLayoutX(90); btn.setLayoutY(80);
		
		
		
		canvas.getChildren().addAll(btn);
		canvas.setPrefSize(400, 400);
		
		canvas.getChildren().addAll(canvas);
		
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
