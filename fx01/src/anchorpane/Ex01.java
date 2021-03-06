package anchorpane;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Ex01 extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		AnchorPane ap = new AnchorPane();
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		
		AnchorPane.setTopAnchor(btn1, 10.0);//위 간격
		AnchorPane.setRightAnchor(btn1, 10.0);//오른쪽 간격
		
		AnchorPane.setBottomAnchor(btn2, 10.0);//아래 간격
		AnchorPane.setLeftAnchor(btn2, 10.0);//왼쪽 간격
		
		ap.getChildren().addAll(btn1, btn2);
		arg0.setScene(new Scene(ap,300,300));
		arg0.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	
}
