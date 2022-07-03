import java.util.ArrayList;
import java.util.List;

public class removeal {
	public static void main(String[] args)
	{
		List<Integer> al = new ArrayList<>();

		// Adding elements to our ArrayList using add() method
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(1);
		al.add(2);

		// Printing the current ArrayList
		System.out.println(al);

		// This makes a call to remove(int) removes element 20
		al.remove(1);

		// Now element 30 is moved one position back So element 30 is removed this time
		al.remove(1);

		// Printing the updated ArrayList
		System.out.println(al);
	}
}

