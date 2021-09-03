package fx01;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Ex01 extends Application{
	@Override
	public void start(Stage arg0) throws Exception{
		//FlowPane flowPane = new FlowPane(); //컨테이너 기본 가로배치
		FlowPane flowPane = new FlowPane(Orientation.VERTICAL);//세로배치
		String btn;
		//Button btn01, btn02, btn03;
		
		for(int i=0; i<8; i++) {
			btn="버튼"+i;
			flowPane.getChildren().add(new Button(btn));
		}
		flowPane.setPadding(new Insets(10,10,10,10));
		//안쪽으로 여백 주기 (위, 오른쪽, 아래, 왼쪽)
		flowPane.setVgap(80); //가로 띄어주기
		flowPane.setHgap(10); //세로 띄어주기
		
		/*
		Button btn01 = new Button("버튼1");
		Button btn02 = new Button("버튼2");
		Button btn03 = new Button("버튼3");
		
		flowPane.getChildren().add(btn01);//넣는 순서대로 배열
		flowPane.getChildren().add(btn03);
		flowPane.getChildren().add(btn02);
		*/
		Scene scene = new Scene(flowPane, 500, 100);//씬에 pane 세팅, 창크기
		arg0.setTitle("FlowPane");
		arg0.setScene(scene);
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
