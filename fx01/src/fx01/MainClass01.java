package fx01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainClass01 extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage arg0) throws Exception {//stage : 무대
		Label lb = new Label("Hello");
		lb.setFont(new Font(20));
		
		Scene scene = new Scene(lb,200,100);//무대에 올림
		
		arg0.setScene(scene);//자리 잡아줌
		arg0.setTitle("연습중");//제목
		arg0.show();
	}
}
