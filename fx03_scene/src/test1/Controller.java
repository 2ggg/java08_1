package test1;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller implements Initializable {
	@FXML Button btn;
	@FXML TextField id;
	@FXML PasswordField pw;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		btn.setOnAction(e->{
			userCheck();
		});
	}

	public void userCheck() {
		if(check()) {
			LoginDB db = new LoginDB();
			String password = db.getPassword(id.getText());
			if(pw.getText().equals(password)) {
				msgBox("로그인 성공");
			}else {
				msgBox("로그인 실패");
			}
		}
	}
	public void msgBox(String msg) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText(msg);
		alert.show();
	}
	public boolean check() {
		if(id.getText().isEmpty()) {
			msgBox("아이디를 입력하세요.");
			id.requestFocus(); //클릭이 되어있는 상태
			pw.clear();//값 비우기
			return false;
		}else if(pw.getText().isEmpty()) {
			msgBox("비번을 입력하세요.");
			pw.requestFocus();
			return false;
		}
		return true;
	}

	
}
