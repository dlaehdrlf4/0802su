import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class TeamDaoImpl implements TeamDao {
	
	
	//가장 큰 num을 찾아오는 메소드
	private int getMaxNo() {
		int result = -1;
		Connection con = null;
		PreparedStatement pstmt = null;
		//select 구문의 결과를 저장하기 위한 변수
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			
			//가장 큰 글번호를 찾아오는 sql을 실행하는 객체 생성
			pstmt = con.prepareStatement("select max(playerno) from team");
			rs = pstmt.executeQuery();
			
			//결과 읽기
			while(rs.next()) {
				//select 절의 첫번째 컬럼의 값을 정수로 읽어서 result에 저장
				result = rs.getInt(1);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally{
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(con != null) {
					con.close();
				}
			}catch(Exception e) {}
		}
		return result;
	}

	@Override
	public boolean insertContect(Team team) {
		boolean result = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			//드라이버 클래스 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//데이터 베이스 연결
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			
			//sql 실행 객체 만들기
			pstmt = con.prepareStatement("insert into team(playerno,playername,playersal,position)" + 
					"values (?,?,?,?)");
			// 물음표에 값을 바인딩
			pstmt.setInt(1, getMaxNo() + 1);
			pstmt.setString(2, team.getPlayername());
			pstmt.setInt(3, team.getPlayersal());
			pstmt.setString(4, team.getPosition());
			
			int r = pstmt.executeUpdate();
			if(r == 1) {
				result = true;
			}
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {
			}
		}

		return result;
	}

	@Override
	public boolean updateContect(Team team) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteContect(int playerno) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Team> allContact() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Team> allContact(String playername) {
		// TODO Auto-generated method stub
		return null;
	}

}
