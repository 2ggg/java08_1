package fx04_scene;

import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginClass {
	public void loginCheck(Parent root) {
		TextField txt = (TextField)root.lookup("#fxId");
		PasswordField pwtxt = (PasswordField)root.lookup("fxPwd");
		System.out.println("root 아이디: "+txt.getText()+pwtxt.getText());
	}
	public void loginCheck(String id, String pw) {
		System.out.println("ID: "+id+"/ PW: "+pw+"\n로그인 체크");
	}
}
