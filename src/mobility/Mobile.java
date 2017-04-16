package mobility;

import mobility.Point;
import utilities.MessageUtility;
import java.lang.Math;
import animals.Animal;
import utilities.MessageUtility;
public class Mobile implements ILocatable
{
	private Point location;
	private double totalDistance;
	
	public Mobile(Point location)
	{
		this.location = new Point(location);
	}
	public void addTotalDistance(double dist)
	{
		this.totalDistance+=dist;
	}
	
	public double calcDistance(Point newPoint)
	{
		return Math.sqrt( Math.pow(newPoint.getX()-this.location.getX(),2)+Math.pow(newPoint.getY()-this.location.getY(),2));
		
	}
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
	
	
	public Point getLocation()
	{
		return this.location;
	}
	
	
	public boolean setLocation(Point newLocation)
	{
		if(newLocation==null)
			return false;
		this.location.setX(newLocation.getX());
		this.location.setY(newLocation.getY());
		return true;	
	}

}
