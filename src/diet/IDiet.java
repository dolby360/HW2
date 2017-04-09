package diet;

import food.EFoodType;
import animals.Animal;
import food.IEdible;

public interface IDiet 
{
	public boolean canEat(EFoodType food);
	public boolean eat(Animal animal, IEdible food);
	public String toString();
}
