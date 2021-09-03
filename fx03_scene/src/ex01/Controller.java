package ex01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller implements Initializable{//초기화 시켜주는 메소드
	
	@FXML private Button btn;
	@FXML private Button btn2;
	@FXML private TextField inputID;
	@FXML private TextField inputPW;
	@FXML private TextField start1;
	@FXML private TextField finish1;
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("초기화 목적으로 사용됩니다.");
		btn2.setOnAction(e->{
			txtprint();
		});
	}
	public void txtprint() {
		System.out.println(start1.getText());
		finish1.setText(start1.getText());
		start1.clear();
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setContentText("주의하세요");
		alert.show();
	}
	
}
