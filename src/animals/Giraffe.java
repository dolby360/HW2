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
	
	public Giraffe(String name,double neck) 
	{
		super(name,new Point(50,0));
		MessageUtility.logConstractor(this.getClass().getSimpleName(), name);
		this.setWeight(450);
		this.setNeckLength(neck);
		IDiet Herbi = new Herbivore();
		super.setDiet(Herbi);
	}
	public void chew()
	{
		MessageUtility.logSound(this.getName(), "Bleats and Stomps its legs, then chews");
	}
	
	public double getNeckLength() 
	{
		MessageUtility.logGetter(this.getName(), "getNeckLength", neckLength);
		return neckLength;
	}
	
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
