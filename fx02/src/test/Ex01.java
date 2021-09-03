package test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ex01 extends Application{
static int i =0;
	@Override
	public void start(Stage arg0) throws Exception {
		FlowPane fPane = new FlowPane();
		Label lbSearch = new Label("search", new ImageView("/img/search.png"));
		Label lbValue = new Label("values");
		Label lbLong = new Label("abcdefghijklmnopqrstuvwxyz \n Alabel that needs to be wrapped");
		lbValue.setFont(new Font(30));
		lbValue.setWrapText(true); //긴 글 생략
		
		lbSearch.setOnMouseClicked(e->{
			if(i==0) {
				lbSearch.setScaleX(1.5);
				lbSearch.setScaleY(1.5);
				i=1;
			}else {
				lbSearch.setScaleX(1);
				lbSearch.setScaleY(1);
				i=0;
			}
		});
		
		lbValue.setOnMouseEntered(e->{
			if(i==0) {
				lbValue.setRotate(90);
				i++;
			}else {
				lbValue.setRotate(180);
				i--;
			}
			lbValue.setScaleX(1.5);
			lbValue.setScaleY(1.5);
		});
		
		lbValue.setOnMouseExited(e->{
			lbValue.setRotate(0);
			lbValue.setScaleX(1);
			lbValue.setScaleY(1);
		});
		
		fPane.getChildren().addAll(lbSearch,lbValue,lbLong);
		arg0.setTitle("타이틀");
		arg0.setScene(new Scene(fPane));
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
