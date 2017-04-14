package animals;

import utilities.MessageUtility;
import diet.IDiet;
import mobility.Point;

public abstract class AnimalThatRoar extends Animal
{Object a;
	
	public AnimalThatRoar(String name,Point location)
	{
		super(name,location);
	
	}
	
	public void makeSound()
	{
		if(this instanceof Lion)
		{
		((Lion)this).roar();
		}
		else if(this instanceof Bear)
		{
			((Bear)this).roar();
			
			//change it
			//MessageUtility.logSound(this.getName(), "Stands on its hind legs, roars and scratches its belly");
		}
	}
	
	public boolean setDiet(IDiet diet) 
	{
		if(diet != null)
		{
			//###### i'm not sure about value; 
			MessageUtility.logSetter(this.getName(), "setDiet",diet, true);
			this.diet=diet;
			return true;
		}
		MessageUtility.logSetter(this.getName(), "setDiet",null, false);
		return false;
	}
}
