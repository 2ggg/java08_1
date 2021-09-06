package test;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;


public class Controller implements Initializable{
	Parent root;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}
	public void setRoot(Parent root) {
		this.root = root;
		addComboBox();
	} 
	public void addComboBox() {
		ComboBox<String> cmbAge = (ComboBox<String>)root.lookup("#cmbAge");
		if(cmbAge != null) {
			cmbAge.getItems().addAll("10대", "20대", "30대", "40대");
		}
	}
	public void click() {//다른 경로에 있는 fxml띄우기
		try {
			FXMLLoader loader2 = new FXMLLoader(getClass().getResource("../ex02/test1.fxml"));
			//다른 파일로 경로 설정
			Stage primaryStage = new Stage();
			Parent root = loader2.load();
			Scene scene = new Scene(root);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void viewProc() {
		System.out.println("확인 버튼 클릭");
		boolean gender = getGender();//true:남 / false:여
		int hobby = getHobby();
        String age = getComboBox();
        System.out.println(gender);
        System.out.println(hobby);
        System.out.println(age);
	}
	public int getHobby() {
		int hobby = 0;
		CheckBox music = (CheckBox)root.lookup("#chkMusic");
		CheckBox sport = (CheckBox)root.lookup("#chkSport");
		CheckBox movie = (CheckBox)root.lookup("#chkMovie");
		if(music.isSelected()) {hobby+=1;}
		if(sport.isSelected()) {hobby+=10;}
		if(movie.isSelected()) {hobby+=100;}
		/*
		 hobby가 1이면 음악
		 10이면 스포츠
		 100이면 영화
		 111이면 모두 선택
		 */
		return hobby;
	}
	public boolean getGender() {
		RadioButton rdoMan = (RadioButton)root.lookup("#rdoMan");
		if(rdoMan.isSelected()) return true;
		else return false;
	}
	public String getComboBox() {
        
        ComboBox<String> cmbAge = (ComboBox<String>)root.lookup("#cmbAge");
        //System.out.println("cmbAge : "+cmbAge);
        //System.out.println("cmbAge.value : "+cmbAge.getValue());
        String age = null;
        if(cmbAge.getValue() == null) {
                System.out.println("콤보박스를 선택해 주세요");
        }else {
                age = cmbAge.getValue().toString();
        }
        return age;
	}
}