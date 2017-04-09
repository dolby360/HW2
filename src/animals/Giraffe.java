package animals;

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
		this.setWeight(450);
		this.setNeckLength(neck);
	}
	 
	public double getNeckLength() {
		return neckLength;
	}
	
	public void setNeckLength(double neckLength) {
		this.neckLength = neckLength;
	}


	
}
