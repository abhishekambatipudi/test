package Hackathon;

import java.util.List;

public class Player {
	
	//Ship playerShip;
	
	private BattleArea playerBattleArea;
	
	private BattleArea opponentBattleArea;
	

	List<Ship> ships;
	
	public Player(BattleArea inputBattleArea, List<Ship> ships)
	{
		this.playerBattleArea = inputBattleArea;
		this.ships = ships;
	}
	
	public Player(int[][] playerArea, List<Ship> ships)
	{
		this.playerBattleArea = new BattleArea(playerArea.length, playerArea[0].length);
		this.ships = ships;
	}

}
