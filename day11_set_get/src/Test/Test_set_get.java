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
	
	System.out.println("아이디 입력: ");
	userId = scanner.next();
	setId(userId);
	System.out.println("비밀번호 입력: ");
	userPw = scanner.next();
	setPw(userPw);
	System.out.println("저장 완료");
}
public void compare() {
	if(id.equals(userId)) {
		if(pw.equals(userPw)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
	}else {
		System.out.println("아이디가 일치하지 않습니다.");
	}
	
}
public void input() {
	System.out.println("아이디 입력: ");
	userId = scanner.next();
	System.out.println("비밀번호 입력: ");
	userPw = scanner.next();
}

}
