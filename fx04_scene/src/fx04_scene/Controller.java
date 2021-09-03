package fx04_scene;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller extends Application{
	private Parent root;
	@FXML Button cancle; //fxml에서 연결한 파일에서만 사용 가능
	@FXML Button login;
	@FXML TextField fxId;
	@FXML PasswordField fxPwd;
	
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	@Override
	public void start(Stage arg0) throws Exception {
		arg0.show();
	}
	public void loginProc() {
		/*
		System.out.println("로그인 버튼 클릭");
		
		TextField txt = (TextField)root.lookup("#fxId");
		System.out.println(txt.getText());
		System.out.println("어노테이션 : "+fxId.getText());
		*/
		LoginClass lc = new LoginClass();
		lc.loginCheck(fxId.getText(), fxPwd.getText());
		lc.loginCheck(root);
		//다른 파일에선 @FXML를 사용 못하므로 parent를 넘겨주는 방식이 좋다
		
	}

}
