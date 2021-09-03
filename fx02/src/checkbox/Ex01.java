package checkbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ex01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		VBox vBox = new VBox(10); //안쪽 사이 거리
		CheckBox checkBox1 = new CheckBox("ck1");
		CheckBox checkBox2 = new CheckBox("ck2");
		
		checkBox1.setSelected(true); //미리 체크된 설정
		
		vBox.getChildren().addAll(checkBox1, checkBox2);
		
		arg0.setScene(new Scene(vBox, 300, 200));
		arg0.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
