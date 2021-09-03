package test1;

import java.util.HashMap;

public class LoginDB {
	private HashMap<String, String> table;
	public LoginDB() {
		table = new HashMap<String, String>();
		table.put("if", "f1234"); //아이디, 비번
		table.put("123", "456");
	}
	public String getPassword(String key) {
		return table.get(key);
	}
}