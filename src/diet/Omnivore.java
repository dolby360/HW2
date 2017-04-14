package diet;

import animals.Animal;
import food.EFoodType;
import food.IEdible;

public class Omnivore implements IDiet
{
	
	public boolean canEat(EFoodType food)
	{
		if ((food.equals(EFoodType.MEAT))||food.equals(EFoodType.NOTFOOD)||(food.equals(EFoodType.VEGETABLE)))
			return true;
		return false;
	}
		
	public String toString()
	{
		return "[" + this.getClass().getSimpleName() + "]";
	}
	

	public boolean eat(Animal animal, IEdible food)
	{
		EFoodType type=food.getFoodtype();
		IDiet ca= new Carnivore();
		IDiet he= new Herbivore();
		animal.makeSound();
		return !(!canEat(type)&& !he.canEat(type)&& !ca.canEat(type));
	}
}
