package Hackathon;

public class Missile {

	private int missilePosition[][];
	
	private int destruction;
	
	public Missile(int[][] position, int destruction)
	{
		this.missilePosition = position;
		this.destruction = destruction;
		
	}

	public int[][] getMissilePosition() {
		return missilePosition;
	}

	public void setMissilePosition(int[][] missilePosition) {
		this.missilePosition = missilePosition;
	}

	public int getDestruction() {
		return destruction;
	}

	public void setDestruction(int destruction) {
		this.destruction = destruction;
	}
	
	
}
