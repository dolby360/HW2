package animals;

import diet.Herbivore;
import diet.IDiet;
import utilities.MessageUtility;
import mobility.Point;

/**
 * @author dolev, ben aharon,id:203723036 // partner:Reut Shukrun 208162933
 * this class use to manage Elephant animal 
 * @version 1
 *
 */

public class Elephant extends AnimalThatChews
{
	private double trunkLength = 1;
	
	/**
	 * Elephant - Constructor - Initialing an Elephant (by using the super class)
	 * @param name - The name of the Elephant
	 * @param trunk - The length of the Elephant's trunk
	 */
	public Elephant(String name,double trunk)
	{
		super(name,new Point(50,90));
		MessageUtility.logConstractor(this.getClass().getSimpleName(), name);
		this.setWeight(500);
		this.settrunkLength(trunk);
		IDiet Herbi = new Herbivore();
		super.setDiet(Herbi);
	}
	
	/**
	 * return the length of the Elephant's trunk
	 * @return the length of the Elephant's trunk
	 */
	public double gettrunkLength() 
	{
		return trunkLength;
	}
	
	/**
	 * chew-Prints the actions the animal does when it chews
	 */
	public void chew()
	{
		MessageUtility.logSound(this.getName(), "Trumpets with joy while flapping its ears, then chews");
	}
	
	/**
	 * This function change the Elephant's length exist to the new one if it valid
	 * @param trunkLength - of the elephant
	 * @return true or false (true if trunk in range)
	 */
	public boolean settrunkLength(double trunkLength) 
	{
		if(trunkLength > 0.5 && trunkLength < 3)
		{
			MessageUtility.logSetter(this.getName(), "settrunkLength", trunkLength, true);
			this.trunkLength = trunkLength;	
			return true;
		}
		else
		{
			MessageUtility.logSetter(this.getName(), "settrunkLength", trunkLength, false);
			return true;
		}
	}
}
