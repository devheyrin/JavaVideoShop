package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CustomerDAO {

//  constructor
	public CustomerDAO() throws Exception{
		connectDB();
	}

	// ###########################################################
	// DB control method
	Connection conn;
	String jdbc_url = "jdbc:oracle:thin:@192.168.0.67:1521:kibwa";
	String db_id = "videoshop";
	String db_pwd = "pass";
	Statement stmt = null;
	String driver = "oracle.jdbc.driver.OracleDriver";

	void connectDB()throws Exception{
		/*
		 * 1. 드라이버를 드라이버메니저에 등록 
		 * 2. 연결 객체 얻어오기
		 */
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(jdbc_url, db_id, db_pwd);
		System.out.println("성공적으로 로딩되었음");			
		
	}

	// 고객정보 입력 메소드
	public void regist() throws Exception {
		/*
		 * 1. sql 작성하기 ( insert 문 작성 : 멤버필드를 변수로 지정하여 ) 2. sql 전송객체 얻어오기
		 * (PreparedStatement가 더 적합할 듯 ) 3. sql 전송 ( 전송전에 ?로 지정 ) 4. 닫기 ( Connection은
		 * 닫으면 안됨 )
		 */
	}

	public void modify() throws Exception {
		/*
		 * 1. sql 작성하기 ( update 문 작성 : 멤버필드를 변수로 지정하여 ) 2. sql 전송객체 얻어오기 (
		 * PreparedStatement가 더 적합할 듯 ) 3. sql 전송 ( 전송전에 ?로 지정 ) 4. 닫기 ( Connection은 닫으면
		 * 안됨 )
		 */

	}

	public void searchName(String name) throws Exception {
		/*
		 * 1. sql 작성하기 ( select 문 : 함수의 인자로 넘어온 이름과 같은 조건의 레코드 검색 ) 2. sql 전송객체 얻어오기 (
		 * Statement / PreparedStatement 모두 적합 ) 3. sql 전송 ( ResultSet 의 데이타를 얻어서 멤버 필드에
		 * 지정 ) 4. 닫기 ( Connection은 닫으면 안됨 )
		 * 
		 * # 생각해 보기 - 동명 이인이 여러명 인 경우는 어떻게 처리할까?
		 */

	}

	public void searchTel(String tel) throws Exception {
		/*
		 * 1. sql 작성하기 ( select 문 : 함수의 인자로 넘어온 전화번호과 같은 조건의 레코드 검색 ) 2. sql 전송객체 얻어오기 (
		 * Statement / PreparedStatement 모두 적합 ) 3. sql 전송 ( ResultSet 의 데이타를 얻어서 멤버 필드에
		 * 지정 ) 4. 닫기 ( Connection은 닫으면 안됨 )
		 */

	}
}
