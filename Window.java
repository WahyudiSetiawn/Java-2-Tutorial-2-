public class Window
{
	private String direction;

	public Window(String inDirection)
	{
		direction = inDirection;
	}

	public Window()
	{
		this.direction = "";
	}

	public void setDirection(String inDirection)
	{
		direction = inDirection;
	}

	public String getDirection()
	{
		return direction;
	}

	public String toString()
	{
		return "window facing "+ getDirection();
	}
}