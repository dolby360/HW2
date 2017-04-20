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
	 * @param name - Name of animal
	 * @param location - location of animal
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
	
	/**
	 * 
	 * @param food - enum type //MEAT,NOTFOOD,VEGETABLE//
	 * @return true or false (in case that the animal can eat return true)
	 */
	public boolean eat(IEdible food)
	{
		boolean flag = diet.eat(this, food);
		MessageUtility.logBooleanFunction(this.getName(), "eat",food, flag);
		return flag;
	}
	
	/**
	 * this method identifies the anumal type and return the food type
	 * @return animal food type
	 */
	@Override
	public EFoodType getFoodtype() 
	{
		if(this instanceof Lion)
		{
			MessageUtility.logGetter(this.getName(), "getFoodType", EFoodType.NOTFOOD);
			return EFoodType.NOTFOOD;
		}
			MessageUtility.logGetter(this.getName(), "getFoodType", EFoodType.MEAT);
			return EFoodType.MEAT;
	}
	
	/**
	 * to get animal weight
	 * @return animal weight
	 */
	public double getWeight() 
	{
		MessageUtility.logGetter(this.getName(), "getWeight", weight);
		return weight;
	}
	
	/**
	 * this method set the animal type
	 * @param weight - weight of animal
	 * @return true or false (false in case of negative weight) 
	 */
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
	
	/**
	 * set the name of animal
	 * @param name - name of animal
	 * @return true or false (false in case of null)
	 */
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
	
	/**
	 * return name of animal
	 * @return name of animal
	 */
	public String getName()
	{
		return this.Name;
	}
	
	/**
	 * 
	 * @return enum food type 
	 */
	public EFoodType getType() 
	{
		return type;
	}
	
	/**
	 * set the type of food the animal eat
	 * @param type of food
	 * @return true of false (success or not)
	 */
	public boolean setType(EFoodType type) 
	{
		if(type.equals(EFoodType.MEAT) || type.equals(EFoodType.NOTFOOD) || type.equals(EFoodType.VEGETABLE))
		{
			this.type = type;
			return true;
		}
		return false;
	}
	

}
