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
	public boolean eat(Animal animal, IEdible food)
	{
		if(canEat(food.getFoodtype()))
		{
			animal.setWeight(animal.getWeight()+animal.getWeight()*0.7);
			return true;
		}
		return false;
	}
}
