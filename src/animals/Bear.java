package animals;

import utilities.MessageUtility;
import diet.IDiet;
import mobility.Point;


/**
 * @author dolev, ben aharon,id:203723036 // partner:Reut Shukrun 208162933
 * this class use to manage Bear animal 
 * @version 1
 *
 */
public class Bear extends AnimalThatRoar 
{	
	private String furColor = null;
		
	public Bear(String name)
	{
		super(name,new Point(100,5));
		this.furColor = "GRAY";
		this.setWeight(308.2);
	}
	
	public void roar()
	{
		
	}
	
	public String getFurColor() {
		return furColor;
	}

	public void setFurColor(String furColor) {
		switch (furColor.toLowerCase())
		{
		case "white":
			this.furColor = "WHITE"; 
			break;
		case "black":
			this.furColor = "BLACK"; 
			break;
		default:
			this.furColor = "GRAY";
			break;
		}
		
	}
}