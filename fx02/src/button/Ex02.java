package button;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Ex02 extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		Pane canvas = new Pane();
		Button btn = new Button();
		Button btn02 = new Button();
		String imgpath = "/img/smilerere.png";
		ImageView img = new ImageView(imgpath);
		
		btn.setGraphic(new ImageView(imgpath));
		btn.setLayoutX(90); btn.setLayoutY(80);//x,y축 위치
		
		
		img.setFitHeight(40);  img.setFitWidth(40);
		btn02.setGraphic( img );
		
		btn02.setStyle("-fx-background-color:transparent;-fx-padding: 10 10 10 10;");
		
		btn02.setOnMousePressed(e->{//눌렸을때
			btn02.setStyle("-fx-background-color:transparent;-fx-padding: 15 10 10 10;");
		});
		btn02.setOnMouseReleased(e->{//뗐을때
			btn02.setStyle("-fx-background-color:transparent;-fx-padding: 10 10 10 10;");
		});
		
		btn.setOnAction(e->{//누르면 
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("!!경고!!");//창 제목
			alert.setHeaderText("버튼 이벤트");
			alert.setContentText("버튼을 클릭했습니다");
			alert.show();
		});
		
		canvas.getChildren().addAll(btn, btn02);
		canvas.setPrefSize(400, 400);
		
		arg0.setScene(new Scene(canvas));
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}


