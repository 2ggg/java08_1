package label;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Ex02 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hBox = new HBox();
		hBox.setPadding(new Insets(10));
		Label lb = new Label("aaa",new ImageView("/img/search.png"));
		Label lb2 = new Label();
		lb2.setText("search");
		lb.setTextFill(Color.RED);
		lb2.setTextFill(Color.web("#0076a3"));//폰트 색상
		lb2.setGraphic(new ImageView("/img/search.png"));
		
		hBox.getChildren().addAll(lb,lb2);
		hBox.setPrefSize(300, 200);
		
		arg0.setScene(new Scene(hBox));
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
