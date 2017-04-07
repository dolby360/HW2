package mobility;

import mobility.Point;
import java.lang.Math;;
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
	/*public double move(Point newPoint)
	{
	
		//Dolev-equals in Point is Copy-Constructor
	if(this.location.equals(newPoint))
			return 0;
	return clacDistance(newPoint);
	}*/
	
	
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
