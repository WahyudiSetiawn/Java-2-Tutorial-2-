public class Dimension
{
	private int width;
	private int length;

	public Dimension(int inWidth, int inLength)
	{
		width = inWidth;
		length = inLength;
	}

	public Dimension()
	{
		this.width = 0;
		this.length = 0;
	}

	//setter
	public void setWidth(int inWidth)
	{
		width = inWidth;
	}

	public void setLength(int inLength)
	{
		length = inLength;
	}

	public int getLength()
	{
		return length;
	}

	public int getWidth()
	{
		return width;
	}

	public String toString()
	{
		return getWidth()+"m x "+getLength()+"m";
	}
}
