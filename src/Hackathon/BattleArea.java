package Hackathon;

public class BattleArea {
	
	private int[][] battleArea;
	
	public BattleArea(int length, int breadth)
	{
		battleArea = new int[length][breadth];
	}

	public int[][] getBattleArea() {
		return battleArea;
	}

	public void setBattleArea(int[][] battleArea) {
		this.battleArea = battleArea;
	}
	
	
}
