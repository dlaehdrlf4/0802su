
public class Team {
	
	private int playerno;
	private String playername;
	private int playersal;
	private String position;
	public int getPlayerno() {
		return playerno;
	}
	public void setPlayerno(int playerno) {
		this.playerno = playerno;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public int getPlayersal() {
		return playersal;
	}
	public void setPlayersal(int playersal) {
		this.playersal = playersal;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "Team [playerno=" + playerno + ", playername=" + playername + ", playersal=" + playersal + ", position="
				+ position + "]";
	}

	}

