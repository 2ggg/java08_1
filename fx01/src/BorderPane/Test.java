package BorderPane;

import java.awt.Button;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Test extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		BorderPane bp = new BorderPane();
		BorderPane btnbp = new BorderPane();
		Label menul = new Label();
		menul.setText("메뉴");
		Label homel = new Label("메뉴 홈 로그인");
		Label loginl = new Label("메뉴 홈 로그인");
		
		FlowPane topPane = new FlowPane();
		topPane.getChildren().addAll(menul,homel,loginl);
		topPane.setAlignment(Pos.CENTER_RIGHT);
		topPane.setHgap(20);
		topPane.setPadding(new Insets(10,30,10,0));
		topPane.setStyle("-fx-background-color:pink;");
		bp.setTop(topPane);
		
		Button leftBtn = new Button("메뉴 나열");
		
		
		
		
		arg0.setScene(new Scene(bp, 500,400));
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
