package animals;

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
		this.setAge(1);
	}
	public void chew()
	{
		
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
}
