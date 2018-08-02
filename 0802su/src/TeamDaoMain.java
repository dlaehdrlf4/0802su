
public class TeamDaoMain {

	public static void main(String[] args) {
		
		TeamDao dao = new TeamDaoImpl();
		Team team = new Team();
		team.setPlayerno(23);
		team.setPlayername("르브론");
		team.setPlayersal(5000);
		team.setPosition("파포");

		boolean result = dao.insertContect(team);
		if(result == true) {
			System.out.println("삽입성공");
		}
		else {
			System.out.println("삽입 실패");
		}
	}

}
