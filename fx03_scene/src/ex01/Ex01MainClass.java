package ex01;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ex01MainClass extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		System.out.println("로드됨");
		Parent root = FXMLLoader.load(getClass().getResource("eventTest.fxml"));
		System.out.println("객체화 됨");
		Scene scene = new Scene(root);
		System.out.println("333");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
