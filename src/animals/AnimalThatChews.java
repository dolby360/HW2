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
