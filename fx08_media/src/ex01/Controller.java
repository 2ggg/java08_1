package ex01;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller implements Initializable{
	Parent root;
	ListView<String> fxListView;
	ImageView fxImageView;
	ObservableList<String> phoneString;
	ArrayList<String> url;
	//ObservableList<Phone> phoneURL;
	public void setRoot(Parent root) {
		this.root = root;
		fxListView = (ListView)root.lookup("#fxListView");
		fxImageView = (ImageView)root.lookup("#fxImageView");
		setListView();
	}
	public void setListView() {
		setList();
		fxListView.getSelectionModel().selectedIndexProperty().addListener((observable, oldValue, newValue)->{
			System.out.println("observable(형식) : "+observable);
			System.out.println("oldValue(이전값) : "+oldValue);
			System.out.println("newValue(현재값) : "+newValue);
			System.out.println(phoneString.get( (int)newValue ));
			//System.out.println(phoneURL.get( (int)newValue ).getSmartPhone() );
			//System.out.println(phoneURL.get( (int)newValue ).getImage() );
			//fxImageView.setImage(new Image("/img/phone/"+ phoneURL.get( (int)newValue ).getImage() ) );
			fxImageView.setImage(new Image("/img/phone/"+ url.get( (int)newValue )) );
		});
	}
	public void setList() {
		phoneString = FXCollections.observableArrayList();
		//phoneURL = FXCollections.observableArrayList();
		url = new ArrayList<String>();
		for(int i=1 ; i<8 ; i++) {
			phoneString.add("갤럭시S"+i);
			//Phone phone = new Phone("갤럭시S"+i , "phone0"+i+".png");
			//phoneURL.add(phone);
			url.add("phone0"+i+".png");
		}
		fxListView.setItems(phoneString);
	}
	public void btn() {System.out.println("버튼 클릭");}
	public void btn1() {
		TextField id = (TextField)root.lookup("#id");
		phoneString.add( id.getText() );
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {	}
}





