package gridpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex02 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		GridPane gridPane = new GridPane();
		Button button = new Button("버튼");
		GridPane.setConstraints(button, 0, 0);
		
		Label label = new Label("라벨");
		GridPane.setConstraints(label, 1, 1);
		
		gridPane.getChildren().addAll(button,label);
		Button button2 = new Button("1, 0");
		gridPane.add(button2, 1, 0);
		gridPane.add(new Label("0, 1"), 0, 1);
		
		gridPane.setPadding(new Insets(20));//위,오른쪽,아래,왼쪽 모두 20
		gridPane.setHgap(50);//가로
		gridPane.setVgap(10);//세로
		arg0.setScene(new Scene(gridPane, 300, 300));
		
		FlowPane flowPane = new FlowPane();
		flowPane.getChildren().add(new Button("merge col(0), row(2)"));
		flowPane.setStyle("-fx-background-color:blue;");//팬 배경 파랑
		flowPane.setAlignment(Pos.CENTER);//팬 안쪽에 있는 (버튼) 위치
		gridPane.add(flowPane, 0, 2, 2, 1);//가로, 세로, 가로병합, 세로병합(칸 수)
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
