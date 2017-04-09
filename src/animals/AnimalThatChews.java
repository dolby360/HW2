package animals;

import diet.IDiet;
import mobility.Point;
import animals.Animal;

public class AnimalThatChews extends Animal
{
	public AnimalThatChews(String name, Point location) 
	{
		super(name, location);
	}

	public boolean setDiet(IDiet diet) {

		return false;
	}
}
