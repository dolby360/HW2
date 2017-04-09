package animals;

import diet.Herbivore;
import diet.IDiet;
import utilities.MessageUtility;
import mobility.Point;

/**
 * @author dolev, ben aharon,id:203723036 // partner:Reut Shukrun 208162933
 * this class use to manage Turtle animal 
 * @version 1
 */
public class Turtle extends AnimalThatChews
{
	private int Age = 0;
	
	public Turtle(String name,int age)
	{
		super(name,new Point(80,0));
		MessageUtility.logConstractor(this.getClass().getSimpleName(), name);
		this.setWeight(1);
		this.setAge(age);
		IDiet Herbi = new Herbivore();
		super.setDiet(Herbi);
	}
	
	public void chew()
	{
		
	}
	
	public int getAge() 
	{
		MessageUtility.logGetter(this.getName(), "getAge", Age);
		return Age;
	}
	
	public void setAge(int age) 
	{
		if (age > 0)
		{
			MessageUtility.logSetter(this.getName(), "setAge", age, true);
			Age = age;
		}
		else
		{
			MessageUtility.logSetter(this.getName(), "setAge", age, false);
		}

	}
}
