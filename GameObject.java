/*
 * This class creates game objects
 * 
 * @author Group 3: Chris M, Josh H, Samuel K
 * @version 0.4
 * Practice lab with classes
 * Spring 2023
 */
public class GameObject {
	
public int locationX;
public int locationY;
public char boardPiece;
private int value;

	public void setLocation(int x, int y){
	locationX=x;
	locationY=y;
	}
	
	public void setValue(int price) {
		value = price;
	}
	
	public int getValue() {
		return value;
	}
	
	public void addValue(int price) {
		value = value + price;
	}
}
