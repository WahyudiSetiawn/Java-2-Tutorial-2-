import java.util.*;
public class Room
{
	private String name;
	private int noOfChairs;
	private boolean isBooked;

	ArrayList<Dimension> AL_Dimension = new ArrayList<Dimension>();
	ArrayList<Window> AL_Window = new ArrayList<Window>();

	public Room() //optional
	{
		name = "";
		noOfChairs = 0;
		isBooked = true;
	}

	public Room(String inName, int inNoOfChair, boolean inBooked, Dimension inDimension, Window inWindow) //constructor
	{
		name = inName;
		noOfChairs = inNoOfChair;
		isBooked = inBooked;
		AL_Dimension.add(inDimension);
		AL_Window.add(inWindow);
	}

	//setter
	public void setName(String inName)
	{
		this.name = inName;
	}
	public void setNoOfChairs(int inNoOfChair)
	{
		this.noOfChairs = inNoOfChair;
	}
	public void setIsBooked(boolean inBooked)
	{
		this.isBooked = inBooked;
	}
	public void setAL_Dimension(ArrayList<Dimension> inDimension)
	{
		this.AL_Dimension = inDimension;
	}
	public void setAL_Window(ArrayList<Window> inWindow)
	{
		this.AL_Window = inWindow;
	}

	//getter
	public String getName()
	{
		return this.name;
	}
	public int getNoOfChairs()
	{
		return this.noOfChairs;
	}
	public boolean getIsBooked()
	{
		return this.isBooked;
	}
	public ArrayList<Dimension> getAL_Dimension()
	{
		return this.AL_Dimension;
	}
	public ArrayList<Window> getAL_Window()
	{
		return this.AL_Window;
	}

	public String toString()
	{
		return "Room "+getName()+" with "+getAL_Dimension()+" (in m), with "+getAL_Window()+" and "+getNoOfChairs()+" chairs, and is already booked: "+getIsBooked();
	}
}
