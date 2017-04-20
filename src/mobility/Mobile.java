package mobility;

import mobility.Point;
import utilities.MessageUtility;
import java.lang.Math;
import animals.Animal;
public class Mobile implements ILocatable
{
	private Point location;
	private double totalDistance;
	
	/**
	 * Constructor-Mobile:Intializing the location of the animal according the location received
	 * @param location
	 * 		new location to the animal
	 */
	public Mobile(Point location)
	{
		this.location = new Point(location);
	}
	/**
	 * addTotalDistancde- updating the total distance the animal passed by adding the last distance(dist)to the total distance exist.
	 * @param dist-
	 * 		the distance the animal passed between the old Point and the new one.
	 */
	public void addTotalDistance(double dist)
	{
		this.setTotalDistance(this.getTotalDistance() + dist);
	}
	/**
	 * calcDistance- calculating the distance between the old location of the animal and the new one(received-newPoint)
	 * @param newPoint
	 * 		-The new locaion of the animal
	 * @return the distance which had calculate
	 */
	public double calcDistance(Point newPoint)
	{
		return Math.sqrt( Math.pow(newPoint.getX()-this.location.getX(),2)+Math.pow(newPoint.getY()-this.location.getY(),2));
		
	}
	/**
	 * move- If the Point valid- the function move the location of the animal t the new location, and do actions after moving(cange weight,calculate and update distance)
	 * @param newPoint represent location
	 * @return distance the animal moved
	 */
	public double move(Point newPoint)
	{
		
		if(!(Point.cheackBounderies(newPoint)))
		{
			MessageUtility.logBooleanFunction(((Animal)this).getName(), "move", newPoint, false);
			return 0;
		}

		double weight=((Animal)this).getWeight();
		((Animal)this).setWeight(weight-(this.calcDistance(newPoint)*weight*0.00025));
		MessageUtility.logBooleanFunction(((Animal)this).getName(), "move", newPoint, true);
		this.setLocation(newPoint);			
		this.addTotalDistance(this.calcDistance(newPoint));
		return this.calcDistance(newPoint);
	}
	
	/**
	 *@return -The location of the animal
	 */
	public Point getLocation()
	{
		return this.location;
	}
	
	/**
	 * If the new location received valid- the function changing the location exist
	 * @return True- If there was a changing
	 * 			FAlse- If there wasn't a changing 
	 */
	public boolean setLocation(Point newLocation)
	{
		if(newLocation==null)
			return false;
		this.location.setX(newLocation.getX());
		this.location.setY(newLocation.getY());
		return true;	
	}

	public double getTotalDistance() {
		return totalDistance;
	}
	
	/**
	 * set the total distance the animal walked
	 * @param totalDistance - set the total distance for animal
	 * @return true or false (true if totalDistance grater then 0)
	 */
	public boolean setTotalDistance(double totalDistance) 
	{
		if(totalDistance >= 0)
		{
			this.totalDistance = totalDistance;
			return true;
		}
		return false;
	}

}