package animals;

import utilities.MessageUtility;
import diet.Carnivore;
import diet.IDiet;
import food.EFoodType;
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
	
	public Lion(String name)
	{
		super(name,new Point(10,0));
		MessageUtility.logConstractor(this.getClass().getSimpleName(), name);
		IDiet carni = new Carnivore();
		this.setWeight(408.2);
		super.setDiet(carni);
		this.setScarCount(0);
	}
	
	public boolean eat(IEdible food)
	//חיה או צמח
	{
		///change it

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
	//להוסיף צלקת
	}

	public boolean setScarCount(int scar){
		if(scar>=0){
			MessageUtility.logSetter(this.getName(), "setScar", scar, true);
			this.scarCount=scar;
			return true;
		}
		MessageUtility.logSetter(this.getName(), "setScar", scar, false);
		return false;
	}

	
public void roar()
{
	MessageUtility.logSound(this.getName(), "Roars, then stretches and shakes its mane");
	
}
	/*public EFoodType getFoodtype() 
	{ 

		return EFoodType.NOTFOOD;
	}*/
	
	public int getScarCount() 
	{
		return scarCount;
	}

	
}
