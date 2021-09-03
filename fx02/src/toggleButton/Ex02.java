package toggleButton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex02 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hBox = new HBox();
		ToggleButton tb1 = new ToggleButton("버튼1");//클릭하면 눌러진채 유지되는 버튼
		ToggleButton tb2 = new ToggleButton("버튼2");
		ToggleButton tb3 = new ToggleButton("버튼3");
		ToggleGroup tg = new ToggleGroup();
		tb1.setToggleGroup(tg);
		tb2.setToggleGroup(tg);
		tb3.setToggleGroup(tg);
		
		tb2.setSelected(true);
		
		hBox.getChildren().addAll(tb1,tb2,tb3);
		hBox.setPrefSize(300, 200);
		
		arg0.setScene(new Scene(hBox));
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
	
}
