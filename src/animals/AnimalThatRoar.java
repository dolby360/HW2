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
	@Override
	public boolean setDiet(IDiet diet) {
		MessageUtility.logSetter(this.getClass().getSimpleName(), "setDiet",diet.getClass().getSimpleName(), true);
		this.diet=diet;

		// TODO Auto-generated method stub
		return false;
	}
}
