package animals;

import diet.Herbivore;
import diet.IDiet;
import diet.Omnivore;
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
	
	public Elephant(String name,double trunk)
	{
		super(name,new Point(50,90));
		MessageUtility.logConstractor(this.getClass().getSimpleName(), name);
		this.setWeight(500);
		this.settrunkLength(trunk);
		IDiet Herbi = new Herbivore();
		super.setDiet(Herbi);
	}

	public void chew()
	{
		
	}
	
	public double gettrunkLength() {
		return trunkLength;
	}

	public void settrunkLength(double trunkLength) 
	{
		if(trunkLength > 0.5 && trunkLength < 3)
		{
			MessageUtility.logSetter(this.getName(), "settrunkLength", trunkLength, true);
			this.trunkLength = trunkLength;	
		}
		else
		{
			MessageUtility.logSetter(this.getName(), "settrunkLength", trunkLength, false);
		}
	}
}
