package animals;

import utilities.MessageUtility;
import diet.IDiet;
import mobility.Point;
import animals.Animal;

public class AnimalThatChews extends Animal
{
	/**
	 * Constructor- AnimalThatChews- Initialing an animal that chew (by the supper class) 
	 * @param name
	 * 		The name of the animal
	 * @param location
	 * 		The location of the animal
	 */
	public AnimalThatChews(String name, Point location) 
	{
		super(name, location);
	}
	
	/**
	 * makeSound - Calling the function that making sound-"chew" according the instance type of the animal
	 */
	public void makeSound()
	{
		if(this instanceof Elephant)
		{
			((Elephant)this).chew();
		}
		else if(this instanceof Giraffe)
		{
			((Giraffe)this).chew();
		}
		else if(this instanceof Turtle)
		{
			((Turtle)this).chew();
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
