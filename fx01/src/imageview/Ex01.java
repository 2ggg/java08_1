package imageview;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Ex01 extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		AnchorPane ap = new AnchorPane();
		ImageView imv = new ImageView("/img/smilerere.png");
		//imv.setImage(new Image("/img/calender.png"));
		imv.setFitWidth(50);//가로
		//imv.setFitHeight(50); //세로
		imv.setPreserveRatio(true);//세로 or가로 중 하나만 해도 알아서 맞춤
		imv.setRotate(45);//45도 돌리기
		
		ap.getChildren().add(imv);
		
		arg0.setScene(new Scene(ap,300,200));
		
		
		arg0.show();
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}

	
}
