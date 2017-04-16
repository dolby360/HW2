package diet;

import animals.Animal;
import food.EFoodType;
import food.IEdible;

public class Omnivore implements IDiet
{
	
	public boolean canEat(EFoodType food)
	{
		if ((food.equals(EFoodType.MEAT))||food.equals(EFoodType.NOTFOOD))
		{
			return true;
		}
		return false;
	}
		
	public String toString()
	{
		return "[" + this.getClass().getSimpleName() + "]";
	}
	//CHANGE

	public boolean eat(Animal animal, IEdible food)
	{
		EFoodType type=food.getFoodtype();
		IDiet ca= new Carnivore();
		IDiet he= new Herbivore();
		if(he.canEat(type))
		{	he.eat(animal, food);
		return true;
		}
		else if(ca.canEat(type))
			{ca.eat(animal, food);
			return true;
			}
	return false;
	}
}
