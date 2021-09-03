package toggleButton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hBox = new HBox(10); //안쪽 10간격
		ToggleButton toggleButton = new ToggleButton("Toggle 버튼");
		
		hBox.getChildren().addAll(toggleButton);
		hBox.setPrefSize(300, 200);
		
		arg0.setScene(new Scene(hBox));
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
