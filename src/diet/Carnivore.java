package diet;

import animals.Animal;
import food.EFoodType;
import food.IEdible;

public class Carnivore implements IDiet {
	public boolean canEat(EFoodType food)
	{
		if ((food.equals(EFoodType.MEAT))||food.equals(EFoodType.NOTFOOD))
			return true;
		return false;
	}
	public boolean eat(Animal animal, IEdible food)
	{
		if(canEat(food.getFoodtype()))
		{
			animal.setWeight(animal.getWeight()+animal.getWeight()*0.1);
			return true;
		}
		return false;
	}
}
