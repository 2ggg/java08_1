package test;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Test extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		FlowPane fp = new FlowPane();
		fp.setPrefSize(100, 30);
		BorderPane bp = new BorderPane();
		VBox vBox = new VBox();
		VBox vBox2 = new VBox();
		TextField tf = new TextField();
		PasswordField pwf = new PasswordField();
		ToggleGroup tGroup = new ToggleGroup();
		
		
		
		Label label1 = new Label("홈");
		Label label2 = new Label("사회");
		Label label3 = new Label("경제");
		Label label4 = new Label("국제");
		Label label5 = new Label("문화");
		Label cate1 = new Label("카테고리");
		Label cate2 = new Label("노트북/pc");
		Label cate3 = new Label("자동차용품");
		Label cate4 = new Label("휴대폰");
		Label cate5 = new Label("캠핑/낚시");
		
		
		
		
		arg0.setTitle("Quiz");
		
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
