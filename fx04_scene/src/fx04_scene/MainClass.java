package fx04_scene;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("eventTest.fxml"));
		//fxml파일 내용들을 모두 읽어옴, 즉 fxml 그 자체를 객체화 함.
		//클래스 객체화한 거랑 같다고 생각하면 됨
		
		Parent root = loader.load();//fxml 객체를 이용해 로드
		//여기서 root : 버튼, 라벨, 체크박스 등 fxml로 만들어놨던 모든 요소들
		
		Scene scene = new Scene(root); //컨트롤러 생성됨
		
		Controller ctl = loader.getController();
		//fxml에 연결되어있는 class = controller라 부름
		
		ctl.setRoot(root);
		//fxml의 모든 내용을 세팅함
		
		arg0.setScene(scene);
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
