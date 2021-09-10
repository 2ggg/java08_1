package ex01_1;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;

public class Controller implements Initializable {
	Parent root;
	ListView<String> fxListView;
	ImageView fxImageView;
	ObservableList<String> phoneString; //fx에서 쓰는 list
	ObservableList<String> phoneURL; //fx에서 쓰는 list
	public void setRoot(Parent root) {
		this.root = root;
		fxListView = (ListView)root.lookup("#fxListView");
		fxListView = (ListView<String>)root.lookup("#fxImageView");
		setListView();
	}
	public void setListView() {
        setList();
        fxListView.getSelectionModel().selectedIndexProperty().addListener((observable, oldValue, newValue)->{
                //람다식
        		System.out.println("observable(형식) : "+observable);
                System.out.println("oldValue(이전값) : "+oldValue);
                System.out.println("newValue(현재값) : "+newValue);
                System.out.println(phoneString.get((int)newValue));
                System.out.println(phoneURL.get((int)newValue).getSmartPhone);
                System.out.println(phoneString.get((int)newValue));
        });
	}
	public void setList() {
		phoneString = FXCollections.observableArrayList();
		phoneURL = FXCollections.observableArrayList();
		for(int i=1; i<8; i++) {
			phoneString.add("갤럭시S"+i);
			Phone phone = new Phone("갤럭시s"+i, "phone0"+i+".png");
			phoneURL.add(phone);
		}
		fxListView.setItems(phoneString);
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}