package mobility;

/**
 * point class contain the location in two axis (x,y)
 * @author dolev, ben aharon,id:203723036 // partner:Reut Shukrun 208162933
 *
 */
public class Point 
{
	private final static int StartRange = 0;
	private final static int RangeX = 800;
	private final static int RangeY = 600;
	
	private int X = 0;
	private int Y = 0;
	
	/**
	 * this constructor get two int's and build point Object
	 * @param x 0-800
	 * @param y 0-600
	 */
	public Point(int x, int y) 
	{
		this.X = x;
		this.Y = y;
	}
	
	/**
	 * copy constructor for Point class
	 * @param newPoint copy constructor for point
	 */
	public Point(Point newPoint) 
	{
		this.X = newPoint.getX();
		this.Y = newPoint.getY();
	}
	
	/**
	 * Default constructor set point in (800,600)
	 * 
	 */
	public Point() 
	{
		setX(StartRange);
		setY(StartRange);
	}
	
	/**
	 * return string that represent the point 
	 * as (x,y)
	 * @return string that represent point
	 */
	public String toString() 
	{
		String string_to_return = this.X + ", " + this.Y;
		return string_to_return;
	}
	
	/**
	 * set the parameter x
	 * @param x 0-800
	 * @return true of false if the point we set is in the range of x
	 */
	public boolean setX(int x) 
	{
		if(x <= RangeX && x >= StartRange)
		{
		this.X = x;
		return true;
		}
		else
		{
			System.out.println("you enterd illegal value");
			return false;
		}
	}
	
	/**
	 * set the parameter y
	 * @param y 0-600
	 * @return true of false if the point we set is in the range of y
	 * 
	 */
	public boolean setY(int y) 
	{
		if(Y <= RangeY && Y >= StartRange)
		{
		this.Y = y;
		return true;
		}
		else
		{
			System.out.println("you enterd illegal value");
			return false;
		}
	}
	
	/**
	 * to get the parameter x
	 * @return the value of x in point
	 */
	public int getX() 
	{
		return X;
	}
	
	/**
	 * to get the parameter y
	 * @return the value of y in point
	 */
	public int getY() 
	{
		return Y;
	}
	
	//this function is static because the tutor used Point.checkBounderies(somePoint) in Plant class
	public static boolean cheackBounderies(Point newLocation)
	{
		return ((newLocation.getX() >= 0) && (newLocation.getX() <= 800) && (newLocation.getY() >= 0) && (newLocation.getY() <= 600)); 
	}
	
	/**
	* copy constructor 
	* @param other other object to copy
	*/

	public boolean equals(Point other)
	{
		if(other==null)
		{
			return false;
		}
		
		this.X = other.getX();
		this.Y = other.getY();
		
		return true;
	}



}
