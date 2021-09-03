package stu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBclass {
	private String url; 
	private String id;//id
	public String pwd;//비번
	private Connection con;//sql 연결에 필요
	public DBclass() {
		
		try {
			//오라클 기능을 자바에서 사용하기 위함. 무조건 처음 실행시켜준다
			Class.forName("oracle.jdbc.driver.OracleDriver");//드라이버 이름
			url = "jdbc:oracle:thin:@localhost:1521:xe";//1521:포트번호 xe:버전
			id = "ljh";
			pwd = "1234";
			con = DriverManager.getConnection(url,id,pwd);//계정에 연결
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public ArrayList<StudentDTO> getUsers(){
		ArrayList<StudentDTO> list = new ArrayList<StudentDTO>();
		String sql = "select * from newst;";//전송할 쿼리문
		try {
			PreparedStatement ps = con.prepareStatement(sql);//전송 객체
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				StudentDTO dto = new StudentDTO();//깊은 복사. 꼭 안에 넣어야 함
				dto.setStNum(rs.getString("id"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				list.add(dto);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}//전송 객체
		return list;
	}
	
	public int saveData(String stNum, String name, int age) {
		//insert into newst values('111', '홍길동', 20);
		int result = 0;
		//String sql = "insert into newst values('"+stNum+"','"+name+"',"+age+")";
		String sql = "insert into newst values(?,?,?)";
		PreparedStatement pStatement;
		try {
			pStatement = con.prepareStatement(sql);
			//ResultSet rs = pStatement.executeQuery();
			
			result = pStatement.executeUpdate();
			//저장 성공시 1 반환, 실패시 catch이동이나 0 반환
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	public int saveData2(String stNum, String name, int age) {
		//insert into newst values('111', '홍길동', 20);
		int result = 0;
		
		String sql = "insert into newst values(?,?,?)";
		PreparedStatement pStatement;
		try {
			pStatement = con.prepareStatement(sql);
			//ResultSet rs = pStatement.executeQuery();
			
			result = pStatement.executeUpdate();
			//저장 성공시 1 반환, 실패시 catch이동이나 0 반환
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}
