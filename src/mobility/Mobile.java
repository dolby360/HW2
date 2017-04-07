package mobility;

import mobility.Point;

public class Mobile implements ILocatable
{
	private Point location;
	private double totalDistance;
	
	public Mobile(Point location)
	{
		//לשאול את דולב!
		//this.location = location;
		this.location = new Point(location);
	}
	public void addTotalDistance(double dist)
	{
		this.totalDistance+=dist;
	}
	
	/*public double calcDistance(Point newPoint)
	{
		
		
	}
	public double move(Point newPoint)
	{
	
		//Dolev
	if(this.location.equals(newPoint))
			return 0;
	return clacDistance(newPoint);
	}
	
	
	public Point getLocation()
	{
		return this.location;
	}
	
	
	public boolean setLocation(Point newLocation)
	{
		
	}
*/
}
