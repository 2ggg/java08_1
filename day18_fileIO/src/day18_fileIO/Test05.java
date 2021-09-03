package day18_fileIO;

import java.io.Serializable;

public class Test05 implements Serializable{//알아서 직렬화 시켜줌
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
