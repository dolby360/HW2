package animals;

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
		this.setWeight(500);
		this.settrunkLength(trunk);
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
			this.trunkLength = trunkLength;	
		}
		else
		{
			this.trunkLength = 1;
		}
	}
}
