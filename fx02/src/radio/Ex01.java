package radio;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hBox = new HBox(10);
		RadioButton rd1 = new RadioButton("라디오1");
		RadioButton rd2 = new RadioButton("라디오2");
		
		hBox.getChildren().addAll(rd1, rd2);
		hBox.setPrefSize(300, 200);
		
		ToggleGroup tGroup = new ToggleGroup();
		rd1.setToggleGroup(tGroup);
		rd2.setToggleGroup(tGroup); //한 그룹으로 묶기
		
		rd1.setText("10대");
		rd1.setSelected(true);
		rd2.setText("20대");
		
		hBox.setPadding(new Insets(20)); //hbox기준, 안쪽으로 가로세로 20씩 간격 두기
		hBox.setStyle("-fx-background-color:skyblue");
		//칼라 입히기 가능
		
		hBox.setMargin(rd2, new Insets(50,20,20,50));//rd2기준으로 간격주기 
		
		arg0.setScene(new Scene(hBox));
		
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
