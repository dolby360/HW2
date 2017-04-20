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
	/**
	 * 	Bear-COnstructor- Initialing a Bear (by using the super class)
	 * @param name
	 * 			The name of the Bear
	 * @param color
	 * 			The color of the animal
	 */
	public Bear(String name,String color)
	{
		super(name,new Point(100,5));
		MessageUtility.logConstractor(this.getClass().getSimpleName(), name);
		this.setWeight(308.2);
		this.setFurColor(color);
		IDiet Omni = new Omnivore();
		super.setDiet(Omni);
	}
	/**
	 * roar-Prints the actions the animal does when it roars
	 */
	public void roar()
	{
		MessageUtility.logSound(this.getName(), "Stands on its hind legs, roars and scratches its belly");
	}
	/**
	 * 
	 * @return and prints the color of the animal
	 */
	public String getFurColor() 
	{
		MessageUtility.logGetter(this.getName(), "getFurColor", getFurColor());
		return furColor;
	}
/**
 * 
 * @param furColor - Initials and prints the color of the animal according the color received
 */
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