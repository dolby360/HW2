package animals;

import utilities.MessageUtility;
import mobility.Mobile;
import mobility.Point;
import food.EFoodType;
import food.IEdible; 
import diet.IDiet;

public abstract class Animal extends Mobile implements IEdible 
{
	private String name;
	private double weight;
	protected IDiet diet;
	
	public Animal(String name,Point location)
	{
		super(location);
		this.setName(name);
	}
	public abstract boolean setDiet(IDiet diet);
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
	public boolean setWeight(double weight) {
		this.weight = weight;
		MessageUtility.logSetter(this.getClass().getSimpleName(), "setWeight", setWeight(weight), true);
	return true;
	}
	public boolean setName(String name) {
		if(name==null)
			return false;
		MessageUtility.logSetter(this.getClass().getSimpleName(), "setName", setName(name), true);
		this.name = name;
		return true;
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
