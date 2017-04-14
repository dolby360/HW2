package diet;

import animals.Animal;
import food.EFoodType;
import food.IEdible;

public class Carnivore implements IDiet 
{
	public boolean canEat(EFoodType food)
	{
		if ((food==(EFoodType.MEAT)))
			return true;
		return false;
	}
	
	public String toString()
	{
		return "[" + this.getClass().getSimpleName() + "]";
	}
	
	public boolean eat(Animal animal, IEdible food)
	{
		if(canEat(food.getFoodtype()))
		{
			animal.setWeight(animal.getWeight()*1.1);
			animal.makeSound();
			return true;
		}
		return false;
	}
	
}
