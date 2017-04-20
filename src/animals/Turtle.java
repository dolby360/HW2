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
	
	/**
	 * Turtule- Constructor- Initialing a Thrtule (by using the super class)
	 * @param name
	 * 		The name of the Turtule
	 * @param age
	 * 		The age of the Turtule
	 */
	public Turtle(String name,int age)
	{
		super(name,new Point(80,0));
		MessageUtility.logConstractor(this.getClass().getSimpleName(), name);
		this.setWeight(1);
		this.setAge(age);
		IDiet Herbi = new Herbivore();
		super.setDiet(Herbi);
	}
	
	/**
	 * chew-Prints the actions the animal does when it chews
	 */
	public void chew()
	{
		MessageUtility.logSound(this.getName(), "Retracts its head in then eats quietly");
	}
	
	/**
	 * 
	 * @return and prints the age of the Turtle
	 */
	public int getAge() 
	{
		MessageUtility.logGetter(this.getName(), "getAge", Age);
		return Age;
	}
	
	/**
	 * If the age received is valid- changing the exist age to the new one 
	 * @param age - The new age of the Turtle
	 * @return true or false (true if age is above 0)
	 */
	public boolean setAge(int age) 
	{
		if (age > 0)
		{
			MessageUtility.logSetter(this.getName(), "setAge", age, true);
			Age = age;
			return true;
		}
		else
		{
			MessageUtility.logSetter(this.getName(), "setAge", age, false);
			return false;
		}

	}
}
