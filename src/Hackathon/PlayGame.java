package Hackathon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) {

		PlayGame = new 
		
		System.out.println("Welcome to the Battle Ship Game");

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the size of the Arena");
		System.out.println("please enter the length of the arena");
		int length = sc.nextInt();
		System.out.println("Breadth");
		int breadth = sc.nextInt();

		BattleArea genericBattleArea = new BattleArea(length, breadth);

		System.out.println("Enter number of ships");
		int numberOfShips = sc.nextInt();

		List<Ship> shipList1 = new ArrayList<Ship>();

		int[][] player1finalArea = null;

		for (int j = 1; j <= numberOfShips; j++) {
			Ship tempShip;
			System.out.println("Enter player :1ship:" + j + " dimensions");
			System.out.println("length");
			int shipLength = sc.nextInt();
			System.out.println("breadth");
			int shipBreadth = sc.nextInt();
			System.out.println("destruction");
			int shipDestruct = sc.nextInt();
			tempShip = new Ship(shipLength, shipBreadth, shipDestruct);

			System.out.println("position x");
			int posLen = sc.nextInt();
			System.out.println("position y");
			int posBre = sc.nextInt();

			BattleArea pos = new BattleArea(posLen, posBre);

			//player1finalArea = ShipAreaControl.setShipInArea(genericBattleArea,
			//		tempShip, pos);

			if (player1finalArea == null) {
				System.out
						.println("this is not a valid input for the ship and the position, please enter valid values");
				j--;
			}

			shipList1.add(tempShip);
		}

		Player firstPlayer = new Player(player1finalArea, shipList1);


		List<Ship> shipList2 = new ArrayList<Ship>();

		int[][] player2finalArea = null;

		for (int j = 1; j <= numberOfShips; j++) {
			Ship tempShip;
			System.out.println("Enter player :2 ship:" + j + " dimensions");
			System.out.println("length");
			int shipLength = sc.nextInt();
			System.out.println("breadth");
			int shipBreadth = sc.nextInt();
			System.out.println("destruction");
			int shipDestruct = sc.nextInt();
			tempShip = new Ship(shipLength, shipBreadth, shipDestruct);

			System.out.println("position x");
			int posLen = sc.nextInt();
			System.out.println("position y");
			int posBre = sc.nextInt();

			BattleArea pos = new BattleArea(posLen, posBre);

			//player2finalArea = ShipAreaControl.setShipInArea(genericBattleArea,
			//		tempShip, pos);

			if (player2finalArea == null) {
				System.out
						.println("this is not a valid input for the ship and the position, please enter valid values");
				j--;
			}

			shipList2.add(tempShip);
		}

		Player secondPlayer = new Player(player2finalArea, shipList1);
		
		System.out.println("Player 1 please fire missile");
		int firstMissilePosX = sc.nextInt();
		int firstMi
		
		
		while(true)
		{
			
			fire()
			
			
		}

	}
	
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
