package com.homepage.web.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	/*
	 * 아래는 싱글톤+DBJP의 정석이다 하지만 이것만으로는 단위별 서버 실행에서 DB접속이 안된다.
	 * 그래서 DB매니저를 제작했고 당분간 DB매니저를 사용하다가 프로젝트가 완성되면 철거하는 방식으로 한다.
	 */
	Connection conn = null;
    PreparedStatement pstmt= null;
	Statement stmt = null;
    ResultSet rs = null;
    String sql = "";
    
	private static MemberDAO memberDAO = new MemberDAO();
	private MemberDAO() {//단위 테스트가 끝나고 프로젝트가 완성되면 없에야 할 부분..
		conn= DbManager.getConnection();
	}
	public static MemberDAO getInstance() {
		return memberDAO;
	}
	//현재 작동하지 않지만 위 DBManager를 걷어내면 작동함. 미리 설정함.
	public Connection getConnection() throws Exception {
		Connection conn= null;
		//http://kenu.github.io/tomcat70/docs/jndi-datasource-examples-howto.html#%EC%98%A4%EB%9D%BC%ED%81%B4_8i,_9i_&_10g
		//에서 copy한 부분//▽▽▽▽▽▽▽▽
		Context initContext = new InitialContext();
		Context envContext  = (Context)initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
		conn = ds.getConnection();
		//△△△△△△△△
		return conn;
	}
	public List<MemberBean> getList() {
		List<MemberBean> list = new ArrayList<MemberBean>();
		
		try {
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle" );
			stmt = conn.createStatement();
			//rs = stmt.executeQuery("select * from member");
            rs=stmt.executeQuery("select memberid, password,name,email,age from member");
            while (rs.next()) {
            	MemberBean bean = new MemberBean();
                bean.setId(rs.getString("MEMBERID")); 
                bean.setAge(rs.getString("AGE")); 
                bean.setPassword(rs.getString("PASSWORD")); 
                bean.setName(rs.getString("NAME")); 
                bean.setAddr(rs.getString("EMAIL")); //[귀차니즘]bean에서는 addr 디비에서는 email 
                
                list.add(bean);
            }
            
        }catch (SQLException e) {
            e.printStackTrace();
            
        }finally {
            
        	 try {
                 if(rs != null)
                      rs. close();
                 if(stmt != null)
                      stmt.close();
                 if(conn != null)
                      conn.close();
           } catch (SQLException e ) {
                 e.printStackTrace();
           }
        
        }
		
		return list;
	}
	public int join(MemberBean bean) {
		// TODO Auto-generated method stub		
		int result=0;
		sql="insert into member (MEMBERID,PASSWORD,NAME,EMAIL,AGE)"
				+" values(?,?,?,?,?)";
		try {
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, bean.getId());
			pstmt.setString(2, bean.getPassword());
			pstmt.setString(3, bean.getName());
			pstmt.setString(4, bean.getAddr());
			pstmt.setString(5, bean.getAge());
			result=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("MemberDAO/join/error 에러");
		}
		return result;
	}
}
