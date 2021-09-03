package gridpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex01 extends Application{
	

	@Override
	public void start(Stage arg0) throws Exception {
		GridPane gridPane = new GridPane();
		Button btn = new Button("버튼");
		GridPane.setConstraints(btn, 0, 0);//가로,세로
		
		Label label = new Label("라벨");
		Label label2 = new Label("라벨2");
		
		GridPane.setConstraints(label2, 1, 1);//가로세로. static메소드
		GridPane.setConstraints(label, 0, 2);
		
		gridPane.getChildren().addAll(btn,label,label2);
		
		arg0.setScene(new Scene(gridPane,300,100));
		
		arg0.show();
		
	}
	
	public static void main(String[] arg0) {
		launch(arg0);
	}
}
