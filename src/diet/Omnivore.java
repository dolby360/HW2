package diet;

import animals.Animal;
import food.EFoodType;
import food.IEdible;

public class Omnivore implements IDiet{
	public boolean canEat(EFoodType food)
	{
		
//		Carnivore.canEat(food);
		return true;
		
	}
	public boolean eat(Animal animal, IEdible food)
	{
		//Carnivore(animal);
		return false;
	}
}
