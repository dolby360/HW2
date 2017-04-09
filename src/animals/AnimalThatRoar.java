package animals;

import utilities.MessageUtility;
import diet.IDiet;
import mobility.Point;

public abstract class AnimalThatRoar extends Animal
{
	public AnimalThatRoar(String name,Point location)
	{
		super(name,location);
	
	}

	public boolean setDiet(IDiet diet) 
	{
		if(diet != null)
		{
			//###### i'm not sure about value; 
			MessageUtility.logSetter(this.getName(), "setDiet",diet.getClass().getSimpleName(), true);
			this.diet=diet;
			return true;
		}
		MessageUtility.logSetter(this.getName(), "setDiet",null, false);
		return false;
	}
}
