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
	private EFoodType type;
	public abstract void makeSound();
	public abstract boolean setDiet(IDiet diet);
	/**
	 * Constructor-Initializing animal
	 * @param name
	 * 			-Name of animal
	 * 
	 * @param location
	 * 			-location of animal
	 */
	public Animal(String name,Point location)
	{
		super(location);
		MessageUtility.logConstractor("Animal", name);
		this.setName(name);
	}
	
	public String toString()
	{
		return "[" + this.getClass().getSimpleName() + "] " + this.Name;
	}
	
	public boolean eat(IEdible food)
	{
		boolean flag=diet.eat(this, food);
		MessageUtility.logBooleanFunction(this.getName(), "eat",food, flag);
	return flag;
	}
	

	@Override
	public EFoodType getFoodtype() {

		if(this instanceof Lion)
		{

			MessageUtility.logGetter(this.getName(), "getFoodType", EFoodType.NOTFOOD);
			return EFoodType.NOTFOOD;
		}
		
			MessageUtility.logGetter(this.getName(), "getFoodType", EFoodType.MEAT);
			return EFoodType.MEAT;
		
		
	}
	/**
	 * 
	 * @return
	 */
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
	public EFoodType getType() {
		return type;
	}
	public void setType(EFoodType type) {
		this.type = type;
	}
	

}
