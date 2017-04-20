package animals;

import utilities.MessageUtility;
import diet.IDiet;
import mobility.Point;

public abstract class AnimalThatRoar extends Animal
{
	/**
	 * Constructor- AnimalThatRoar- Initialing an animal that roar (by the supper class) 
	 * @param name
	 * 		The name of the animal
	 * @param location
	 * 		The location of the animal
	 */
	
	public AnimalThatRoar(String name,Point location)
	{
		super(name,location);
	
	}
	/**
	 * makeSound- Calling the function that making sound-"roar" according the instance type of the animal
	 */
	
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
	/**
	 * If the diet received is valid(not null)- changing the animal's diet exist
	 * @return True- If there was a changing
	 * 			False- If there wan't a changing
	 */
	
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
