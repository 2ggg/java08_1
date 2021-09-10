package fx06_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBClass {
	public Connection conn;
	public int insert(MemberDTO dto) {
		int result = 0;
		String sql = "insert into fx_member(id,pwd,name) values(?,?,?)";
		//형식 지정
		try {
			//conn을 이용해 쿼리문 전송할 수 있는 전송 객체 얻어옴
			PreparedStatement ps = conn.prepareStatement(sql);
			//?에 들어갈 값 나열
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPwd());
			ps.setString(3, dto.getName());
			//전송객체 이용해 명령어 실행(db에 명령어 전송)
			//결과값 : 성공1, 실패0
			//보편적으로 select제외한 나머지 명령어 excuteupdate사용
			result = ps.executeUpdate();//성공하면 1, 아니면 0
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}
	public DBClass() {
		try {//자바에서 오라클 연결해 기타 기능 쓸 수 있게 라이브러리에 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//오라클과 연결된 객체 가져옴
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","ljh","1234");
		} catch (Exception e) {//더 범위가 넓은, 부모 exception으로 받아줌
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public MemberDTO loginChk(String inputId) {
		//select * from fx_member where id='111';
		String sql = "select * from fx_member where id=?";
		MemberDTO dto = null;
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, inputId);
			//resultset은 배열과 비슷한 방식
			//resultset은 select무네 무조건 사용
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				dto.setId(rs.getString("id"));
				dto.setPwd(rs.getString("pwd"));
				dto.setName(rs.getString("name"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return dto;
	}
}
