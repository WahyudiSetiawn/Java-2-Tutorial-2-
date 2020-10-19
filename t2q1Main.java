import java.util.*;
public class t2q1Main
{
	public static void main(String[] args)
	{
		Window w1 = new Window("West");
		Dimension d1 = new Dimension(5, 4);
		Room tri = new Room("TRI", 15, true, d1, w1);

		System.out.println(tri.toString()); //untuk menampilkan data pada onjek dari class Room

		Scanner key = new Scanner(System.in);

		System.out.print("Window facing direction: ");
		String windows = key.next();

		Window w2 = new Window(windows);
		System.out.println(w2.toString());

		System.out.print("Room width(in m): ");
		int width = key.nextInt();
		System.out.print("Room length(in m): ");
		int length = key.nextInt();

		Dimension d2 = new Dimension(width, length);
		System.out.println(d2.toString());

		System.out.print("Room name: ");
		String Rname = key.next();
		System.out.print("No of Chairs: ");
		int chair = key.nextInt();
		System.out.print("Already booked(true or false): ");
		boolean booked = key.nextBoolean();

		Room tri2 = new Room(Rname, chair, booked, d2, w2);
		System.out.println(tri2.toString());
	}
}