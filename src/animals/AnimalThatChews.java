package animals;

import utilities.MessageUtility;
import diet.IDiet;
import mobility.Point;
import animals.Animal;

public class AnimalThatChews extends Animal
{
	public AnimalThatChews(String name, Point location) 
	{
		super(name, location);
	}

	public void makeSound()
	{
		if(this instanceof Elephant)
		{
			MessageUtility.logSound(this.getName(), "Trumpets with joy while flapping its ears, then chews");
		}
		else if(this instanceof Giraffe)
		{
			MessageUtility.logSound(this.getName(), "Bleats and Stomps its legs, then chews");
		}
		else if(this instanceof Turtle)
		{
			MessageUtility.logSound(this.getName(), "Retracts its head in then eats quietly");
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
