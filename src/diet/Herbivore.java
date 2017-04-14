package diet;

import animals.Animal;
import food.EFoodType;
import food.IEdible;

public class Herbivore implements IDiet {

	public boolean canEat(EFoodType food)
	{
		if (food.equals(EFoodType.VEGETABLE))
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
			animal.setWeight(animal.getWeight()*1.7);
			animal.makeSound();
			return true;
		}
		return false;
	}
}
