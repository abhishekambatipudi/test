package Hackathon;

public class ShipAreaControl 
{
	public int[][] setShipInArea(BattleArea ba, Ship sh, BattleArea pos)
	{
		int[][] shipArea;
		int[][] area = ba.getBattleArea();
		int[][] ship = sh.getShipSize();
		int[][] position = pos.getBattleArea();

		int lenArea = area.length;
		int breArea = area[0].length;
		int lenShip = ship.length;
		int breShip = ship[0].length;
		int posLen = position.length;
		int posBre = position[0].length;
		
		for(int i = 0; i <=lenArea; i++)
		{
			for(int j=0; j<=breArea; j++)
			{
				if(posLen-1 == i && posBre-1 == j)
				{
					if(posLen +lenShip > lenArea || posBre + breShip > breArea )
					{
						System.out.println("ship dimensions and positions are not valid");
						return null;
					}
				}
				if(i >= posLen-1  && i <= posLen-1 +  lenShip && j >= posBre -1 && j<= posBre -1 + breShip)
				{
					if(area[i][j] == 1) 
					{
						System.out.println("Ship collides with another ship");
						return null;
					}
					area[i][j] = 1;
				}
			}
		}
		
		shipArea = area;
		
		return shipArea;
	}
}
