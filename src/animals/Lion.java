package animals;

import utilities.MessageUtility;
import diet.Carnivore;
import diet.IDiet;
import mobility.Point;

/**
 * @author dolev, ben aharon,id:203723036 // partner:Reut Shukrun 208162933
 * this class use to manage Lion animal 
 * @version 1
 */

public class Lion extends AnimalThatRoar
{
	private int scarCount = 0;
	
	public Lion(String name)
	{
		
		super(name,new Point(10,0));
		IDiet ko=new Carnivore();
		this.setWeight(408.2);
		super.setDiet(ko);
	}

	
	public int getScarCount() {
		return scarCount;
	}

	public void setScarCount(int scarCount) {
		this.scarCount = scarCount;
	}
}
