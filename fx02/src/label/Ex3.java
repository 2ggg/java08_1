package label;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ex3 extends Application{
	static int i=0;
	@Override
	public void start(Stage arg0) throws Exception {
		HBox hBox = new HBox();
		hBox.setPadding(new Insets(10));
		
		Label lb = new Label("abcdefghijklmnopqrstuvwxyz \n Alabel that needs to be wrapped");
		
		
		lb.setWrapText(true); //긴 글 생략 ...
		lb.setFont(new Font(20)); //폰트크기
		lb.setRotate(48);//48도 회전
		lb.setTranslateY(50); //y축으로 50 내림
		lb.setTranslateX(10);
		/*
		lb.setOnMouseClicked(e->{//람다식
			//클릭하면 이벤트 발생
			lb.setRotate(0);
			lb.setTranslateY(0);
		});
		*/
		
		lb.setOnMouseClicked(e->{
			if(i==0) {
				lb.setRotate(i);
				lb.setTranslateY(i);
				i=1;
			}else {
				lb.setRotate(45);
				lb.setTranslateY(50);
				i=0;
			}
		});
		
		
		hBox.getChildren().add(lb);
		hBox.setPrefSize(100, 100);
		
		arg0.setScene(new Scene(hBox));
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
