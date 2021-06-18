package pkgData;

public class Player {
	private int numberPlayer;
	private String namePlayer;
	private String positionPlayer;
	
	public Player(int numberPlayer, String namePlayer, String positionPlayer) {
		super();
		this.numberPlayer = numberPlayer;
		this.namePlayer = namePlayer;
		this.positionPlayer = positionPlayer;
	}

	@Override
	public String toString() {
		return "Player [numberPlayer=" + numberPlayer + ", namePlayer=" + namePlayer + ", positionPlayer="
				+ positionPlayer + "]";
	}
	
	
}
