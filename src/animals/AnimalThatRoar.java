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
	
	public void makeSound()
	{
		if(this instanceof Lion)
		{
		((Lion)this).roar();
		}
		else if(this instanceof Bear)
		{
			((Bear)this).roar();
			
			
		}
	}
	
	public boolean setDiet(IDiet diet) 
	{
		if(diet != null)
		{
			
			MessageUtility.logSetter(this.getName(), "setDiet",diet, true);
			this.diet=diet;
			return true;
		}
		MessageUtility.logSetter(this.getName(), "setDiet",null, false);
		return false;
	}
}
