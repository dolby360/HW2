package animals;

import utilities.MessageUtility;
import diet.IDiet;
import diet.Omnivore;
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
		
	public Bear(String name,String color)
	{
		super(name,new Point(100,5));
		MessageUtility.logConstractor(this.getClass().getSimpleName(), name);
		this.setWeight(308.2);
		this.setFurColor(color);
		IDiet Omni = new Omnivore();
		super.setDiet(Omni);
	}
	
	public void roar()
	{
		MessageUtility.logSound(this.getName(), "Stands on its hind legs, roars and scratches its belly");
	}
	
	public String getFurColor() 
	{
		MessageUtility.logGetter(this.getName(), "getFurColor", getFurColor());
		return furColor;
	}

	public void setFurColor(String furColor) {
		switch (furColor.toLowerCase())
		{
		case "white":
			MessageUtility.logSetter(this.getName(), "setFurColor", furColor, true);
			this.furColor = "WHITE"; 
			break;
		case "black":
			MessageUtility.logSetter(this.getName(), "setFurColor", furColor, true);
			this.furColor = "BLACK"; 
			break;
		case "gray":
			MessageUtility.logSetter(this.getName(), "setFurColor", furColor, true);
			this.furColor = "GRAY"; 
			break;
		default:
			MessageUtility.logSetter(this.getName(), "setFurColor", furColor, false);
			MessageUtility.logSetter(this.getName(), "setFurColor", "GRAY", true);
			this.furColor = "GRAY";
			break;
		}
		
	}
	
	
	
	
	
}