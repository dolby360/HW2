package animals;

import diet.Herbivore;
import diet.IDiet;
import utilities.MessageUtility;
import mobility.Point;

/**
 * @author dolev, ben aharon,id:203723036 // partner:Reut Shukrun 208162933
 * this class use to manage Giraffe animal 
 * @version 1
 *
 */

public class Giraffe extends AnimalThatChews
{
	private double neckLength = 0;
	/**
	 * Giraffe-Constructor- Initialing a Giraffe (by using the super class
	 * @param name
	 * 		The name of the Giraffe
	 * @param neck
	 * 		The length of the Giraffe's neck
	 */
	public Giraffe(String name,double neck) 
	{
		super(name,new Point(50,0));
		MessageUtility.logConstractor(this.getClass().getSimpleName(), name);
		this.setWeight(450);
		this.setNeckLength(neck);
		IDiet Herbi = new Herbivore();
		super.setDiet(Herbi);
	}
	/**
	 * chew-Prints the actions the animal does when it chews
	 */
	
	public void chew()
	{
		MessageUtility.logSound(this.getName(), "Bleats and Stomps its legs, then chews");
	}
	/**
	 * 
	 * @return and prints the Giraffe's length neck
	 */
	public double getNeckLength() 
	{
		MessageUtility.logGetter(this.getName(), "getNeckLength", neckLength);
		return neckLength;
	}
	/**
	 * If the new length of the Giraffe's neck received valid- changing the length exist to the new one
	 * @param neckLength
	 * 		The new length of the Giraffe's neck
	 */
	//Dolev-Boolean
	public void setNeckLength(double neckLength) 
	{
		if(neckLength >= 1 && neckLength <= 2.5)
		{
			MessageUtility.logSetter(this.getName(), "setNeckLength", neckLength, true);
			this.neckLength = neckLength;
		}
		else
		{
			MessageUtility.logSetter(this.getName(), "setNeckLength", neckLength, false);
		}
		
	}
	
}
