package animals;

import utilities.MessageUtility;
import diet.Carnivore;
import diet.IDiet;
import food.IEdible;
import mobility.Point;
import java.util.Random;
/**
 * @author dolev, ben aharon,id:203723036 // partner:Reut Shukrun 208162933
 * this class use to manage Lion animal 
 * @version 1
 */

public class Lion extends AnimalThatRoar
{
	private int scarCount = 0;
	/**
	 * Lion- Constructor- Initialing a Lion (by using the super class)
	 * @param name
	 * 		The name of the Lion
	 */
	public Lion(String name)
	{
		super(name,new Point(10,0));
		MessageUtility.logConstractor(this.getClass().getSimpleName(), name);
		IDiet carni = new Carnivore();
		this.setWeight(408.2);
		super.setDiet(carni);
		this.setScarCount(0);
	}
	//Dolev
	public boolean eat(IEdible food)
	{
		boolean flag=diet.eat(this, food);

		MessageUtility.logBooleanFunction(this.getName(), "eat",food, flag);
	if(flag)
	{
		Random rand=new Random();
		if(rand.nextInt(2)==1){
			this.setScarCount(this.scarCount+1);
		}
	}
		return flag;
	}
/**
 * IF the scar receives is valid- changing the count of the Lion's scars to the value received
 * @param scar
 * @return True-
 * 		If there was a changing
 * 		False-
 * 		If there wasn't a changing
 */
	public boolean setScarCount(int scar){
		if(scar>=0){
			MessageUtility.logSetter(this.getName(), "setScar", scar, true);
			this.scarCount=scar;
			return true;
		}
		MessageUtility.logSetter(this.getName(), "setScar", scar, false);
		return false;
	}

	/**
	 * roar-Prints the actions the animal does when it roars
	 */	
public void roar()
{
	MessageUtility.logSound(this.getName(), "Roars, then stretches and shakes its mane");
	
}
	/**
	 * 
	 * @return the count of the Lion's scars 
	 */
	public int getScarCount() 
	{
		return scarCount;
	}

	
}
