package animals;

import mobility.Point;
import utilities.MessageUtility;

/**
 * @author dolev, ben aharon,id:203723036 // partner:Reut Shukrun 208162933
 * this class use to manage Bear animal 
 * @version 1
 *
 */
public class Bear 
{
	private static final int startY = 5;
	private static final int startX = 100;
	private final double start_weight = 308.2;
	
	private String name;
	private String type;
	private double weight; 
	private Point  position;
	private double distance;
	
	/**
	 * Constructor to build this object by name 
	 * the other values set as default 
	 * @param name of this animal
	 */
	public Bear(String name)
	{
		MessageUtility.logConstractor(this.getClass().getSimpleName(),name);
		position = new Point();
		this.setName(name);
		this.setType("predator");
		this.setPosition(startX,startY);
		this.setWeight(start_weight);
	}
	
	/**
	 * Constructor to build this object by name and Point
	 * the other values set as default 
	 * @param name of this animal
	 * @param p the start point
	 */
	public Bear(String name,Point p)
	{
		this(name);
		if (p != null)
		{
			this.setPosition(p.getX(),p.getY());
		}
	}
	
	/**
	 * return string that represent the instance
	 */
	public String toString()
	{
		return "name: " + this.name + " distance: " + this.getDistance();
		//return MessageUtility.logString(this.getName(),this.getDistance(),this.getWeight());
	}
	
	/**
	 * set position of this animal
	 * @param x position of x
	 * @param y position of y
	 * @return return true that represent that the setter success
	 */
	public boolean setPosition(int x,int y)
	{
		if(!(position.setX(x) && position.setY(y))){return false;}
		MessageUtility.logSetter(this.name,"setPosition",position,true);
		return true;
	}
	
	/**
	 * to get the current position of this animal
	 * @return return the position of this animal
	 */
	public Point getPosition()
	{
		MessageUtility.logGetter(this.name,"getPosition",this.position);
		return this.position;
	}
	
	/**
	 * this function return the weight of this animal
	 * @return return the weight of this animal
	 */
	public double getWeight() 
	{
		MessageUtility.logGetter(this.name,"getWeight",weight);
		return weight;
	}
	
	/**
	 * this function set new weight to this animal
	 * @param newWeight you want to set
	 * @return true or false if the set succeed
	 */
	public boolean setWeight(double newWeight) 
	{
		if(newWeight >= 0)
		{
			MessageUtility.logSetter(this.name,"setWeight", newWeight,true);
			this.weight = newWeight;
			return true;
		}
		MessageUtility.logSetter(this.name,"setWeight", newWeight,false);
		return false;
	}
	
	/**
	 * this function return the name of this animal
	 * @return return the name of this animal
	 */
	public String getName() 
	{
		MessageUtility.logGetter(this.name,"getName",name);
		return name;
	}

	/**
	 * this function set new name to this animal
	 * @param name you want to set
	 * @return true or false if the set succeed
	 */
	public boolean setName(String name) 
	{
		if(name != null)
		{
			MessageUtility.logSetter(name,"setName",name,true);
			this.name = name;
			return true;
		}
		MessageUtility.logSetter(name,"setName",name,false);
		return false;
	}

	/**
	 * this function return the distance the animal pass until now
	 * @return return the distance the animal pass until now
	 */
	public double getDistance() 
	{
		MessageUtility.logGetter(this.name,"getDistance",distance);
		return distance;
	}

	/**
	 * this function set new distance to this animal
	 * @param distance you want to set
	 * @return true or false if the set succeed
	 */
	public boolean setDistance(double distance) 
	{
		if(distance >= 0)
		{
			this.distance = distance;
			this.setWeight(this.weight - (this.distance * this.weight * 0.001));
			MessageUtility.logSetter(this.name,"setDistance",distance, true);
			return true;
		}
		MessageUtility.logSetter(this.name,"setDistance",distance, false);
		return false;
	}

	/**
	 * this function return the type of this animal
	 * @return return the type of this animal
	 */
	public String getType() 
	{	
		MessageUtility.logGetter(this.name,"getType",this.type);
		return type;
	}

	/**
	 * this function set new type to this animal
	 * @param newType you want to set
	 * @return true or false if the set succeed
	 */
	public boolean setType(String newType) 
	{	
		if(newType == "predator" || newType == "herbivorous")
		{
			MessageUtility.logSetter(this.name,"setType",newType,true);
			this.type = newType;
			return true;
		}
		MessageUtility.logSetter(this.name,"setType",newType,false);
		return false;
	}
}