package Hackathon;

public class Ship {

	private int[][] shipSize;
	
	private int shipType;
	
	public Ship(int length, int breadth, int shipType)
	{
		this.shipSize = new int[length][breadth];	
		
		this.shipType = shipType;
	}

	public int[][] getShipSize() {
		return shipSize;
	}

	public void setShipSize(int[][] shipSize) {
		this.shipSize = shipSize;
	}

	public int getShipType() {
		return shipType;
	}

	public void setShipType(int shipType) {
		this.shipType = shipType;
	}
	
	
}
