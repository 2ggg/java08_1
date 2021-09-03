package textfield;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		HBox hBox = new HBox();
		TextField tf = new TextField();
		tf.setText("test 작성");
		
		hBox.setPadding(new Insets(20));
		
		PasswordField pwf = new PasswordField(); //가려짐
		pwf.setText("비밀번호");
		
		ComboBox<String> comboBox = new ComboBox<String>();
		comboBox.getItems().addAll("공부","놀기","멍때리기");
		comboBox.setValue("놀기");//처음 선택되는 거
		
		DatePicker date = new DatePicker();//날짜 선택
		
		TextArea ta = new TextArea();
		ta.setPrefSize(100, 50);
		
		hBox.getChildren().addAll(tf,pwf,comboBox,ta,date);
		hBox.setPrefSize(300, 200);
		
		arg0.setScene(new Scene(hBox));
		
		
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
