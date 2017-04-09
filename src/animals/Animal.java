package animals;

import utilities.MessageUtility;
import mobility.Mobile;
import mobility.Point;
import food.EFoodType;
import food.IEdible; 
import diet.IDiet;

public abstract class Animal extends Mobile implements IEdible 
{
	private String Name;
	private double weight;
	protected IDiet diet;
	public abstract void makeSound();
	public abstract boolean setDiet(IDiet diet);
	
	public Animal(String name,Point location)
	{
		super(location);
		//###### i'm not sure about the name;
		MessageUtility.logConstractor("Animal", name);
		this.setName(name);
	}
	
	public String toString()
	{
		return "[" + this.getClass().getSimpleName() + "] " + this.Name;
	}
	
	public boolean eat(IEdible eat)
	{
		if(eat == null)
		{
			return false;
		}
		return true;
	}
	

	public EFoodType getFoodtype() 
	{ 
		/*
		if(this.diet.)
		{
			
		}
		else if()
		{
			
		}
		else if()
		{
			
		}
		*/
		return null;
	}
	
	public double getWeight() 
	{
		MessageUtility.logGetter(this.getName(), "getWeight", weight);
		return weight;
	}
	
	public boolean setWeight(double weight) 
	{
		if(weight > 0)
		{
			this.weight = weight;
			MessageUtility.logSetter(this.getName(), "setWeight", weight, true);
			return true;
		}
		MessageUtility.logSetter(this.getName(), "setWeight", weight, false);
		return false;
	}
	
	public boolean setName(String name) 
	{
		if(name==null)
		{
			MessageUtility.logSetter(null, "setName", this.getName() , false);
			return false;
		}
		MessageUtility.logSetter(name, "setName", name , true);
		this.Name = name;
		return true;
	}
	
	public String getName()
	{
		return this.Name;
	}
	
	/*public boolean setDiet(String name) {
		if(name==null)
			return false;
		MessageUtility.logSetter(this.getClass().getSimpleName(), "setName", setName(name), true);
		this.name = name;
		return true;
	}
*/

}
