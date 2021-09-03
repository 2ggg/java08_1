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
	public String pwd;//���
	private Connection con;//sql ���ῡ �ʿ�
	public DBclass() {
		
		try {
			//����Ŭ ����� �ڹٿ��� ����ϱ� ����. ������ ó�� ��������ش�
			Class.forName("oracle.jdbc.driver.OracleDriver");//����̹� �̸�
			url = "jdbc:oracle:thin:@localhost:1521:xe";//1521:��Ʈ��ȣ xe:����
			id = "ljh";
			pwd = "1234";
			con = DriverManager.getConnection(url,id,pwd);//������ ����
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public ArrayList<StudentDTO> getUsers(){
		ArrayList<StudentDTO> list = new ArrayList<StudentDTO>();
		String sql = "select * from newst;";//������ ������
		try {
			PreparedStatement ps = con.prepareStatement(sql);//���� ��ü
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				StudentDTO dto = new StudentDTO();//���� ����. �� �ȿ� �־�� ��
				dto.setStNum(rs.getString("id"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				list.add(dto);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}//���� ��ü
		return list;
	}
	
	public int saveData(String stNum, String name, int age) {
		//insert into newst values('111', 'ȫ�浿', 20);
		int result = 0;
		//String sql = "insert into newst values('"+stNum+"','"+name+"',"+age+")";
		String sql = "insert into newst values(?,?,?)";
		PreparedStatement pStatement;
		try {
			pStatement = con.prepareStatement(sql);
			//ResultSet rs = pStatement.executeQuery();
			
			result = pStatement.executeUpdate();
			//���� ������ 1 ��ȯ, ���н� catch�̵��̳� 0 ��ȯ
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	public int saveData2(String stNum, String name, int age) {
		//insert into newst values('111', 'ȫ�浿', 20);
		int result = 0;
		
		String sql = "insert into newst values(?,?,?)";
		PreparedStatement pStatement;
		try {
			pStatement = con.prepareStatement(sql);
			//ResultSet rs = pStatement.executeQuery();
			
			result = pStatement.executeUpdate();
			//���� ������ 1 ��ȯ, ���н� catch�̵��̳� 0 ��ȯ
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}
