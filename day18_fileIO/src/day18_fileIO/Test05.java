package day18_fileIO;

import java.io.Serializable;

public class Test05 implements Serializable{//�˾Ƽ� ����ȭ ������
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println("name: "+name);
	}
}
