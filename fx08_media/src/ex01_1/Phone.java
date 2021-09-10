package ex01_1;

import javafx.beans.property.SimpleStringProperty;

public class Phone {
	private SimpleStringProperty smartPhone;
	//SimpleStringProperty : fx에서 쓰는 string
	private SimpleStringProperty image;
	//이름이 다르니까 둘을 엮어주기
	//ex 갤럭시 이미지에 맞는 파일(파일 이름이 갤럭시가 아님)을 가져오기.
	private Phone(String smartPhone, String image) {
		this.smartPhone = new SimpleStringProperty(smartPhone);
		this.image = new SimpleStringProperty(image);
	}
	public String getSmartPhone() {
		return smartPhone.get();//일반 스트링으로 받아오기
	}
	public void setSmartPhone(SimpleStringProperty smartPhone) {
		this.smartPhone = smartPhone;
	}
	public String getImage() {
		return image.get();
	}
	public void setImage(SimpleStringProperty image) {
		this.image = image;
	}
	
}
