import java.util.List;

public interface TeamDao {
	public boolean insertContect (Team team);
	
	public boolean updateContect (Team team);
	
	public boolean deleteContect (int playerno);
	
	public List<Team> allContact(); 
	
	public List<Team> allContact(String playername); 
}
