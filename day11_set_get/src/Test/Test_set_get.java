package Test;

import java.util.Scanner;

public class Test_set_get {
private String id, userId, pw, userPw;
Scanner scanner = new Scanner(System.in);

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getUserId() {
	return userId;
}

public void setUserId(String userId) {
	this.userId = userId;
}

public String getPw() {
	return pw;
}

public void setPw(String pw) {
	this.pw = pw;
}

public String getUserPw() {
	return userPw;
}

public void setUserPw(String userPw) {
	this.userPw = userPw;
}
public void change() {
	
	System.out.println("���̵� �Է�: ");
	userId = scanner.next();
	setId(userId);
	System.out.println("��й�ȣ �Է�: ");
	userPw = scanner.next();
	setPw(userPw);
	System.out.println("���� �Ϸ�");
}
public void compare() {
	if(id.equals(userId)) {
		if(pw.equals(userPw)) {
			System.out.println("�α��� ����");
		}else {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
	}else {
		System.out.println("���̵� ��ġ���� �ʽ��ϴ�.");
	}
	
}
public void input() {
	System.out.println("���̵� �Է�: ");
	userId = scanner.next();
	System.out.println("��й�ȣ �Է�: ");
	userPw = scanner.next();
}

}
