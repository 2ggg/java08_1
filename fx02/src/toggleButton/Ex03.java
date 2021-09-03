package toggleButton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex03 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hBox = new HBox(10);
		ToggleButton tb = new ToggleButton("내용", new ImageView("/img/magi.png"));
		ToggleButton tb2 = new ToggleButton();
		tb2.setGraphic(new ImageView("/img/magi.png"));
		//버튼에 이미지 넣기
		
		hBox.getChildren().addAll(tb);
		hBox.setPrefSize(300, 200);
		
		
		arg0.setScene(new Scene(hBox));
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
