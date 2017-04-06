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

	public Giraffe(String name, Point location) 
	{
		super(name, location);
		this.setWeight(450);
	}
	
}
