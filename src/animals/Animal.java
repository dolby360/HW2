package animals;

import mobility.Mobile;
import mobility.Point;
import food.EFoodType;
import food.IEdible; 
import diet.IDiet;

public abstract class Animal extends Mobile implements IEdible 
{
	private String name;
	private double weight;
	private IDiet diet;
	
	public Animal(String name,Point location)
	{
		super(location);
		this.name = name;
	}
	public void makeSound()
	{
		
	}
	public boolean eat(IEdible eat)
	{
		if(eat == null)
		{
			return false;
		}
		return true;
	}
	
	@Override
	public EFoodType getFoodtype() {
		// TODO Auto-generated method stub
		return null;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
