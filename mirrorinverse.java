import java.util.Scanner;
public class mirrorinverse {

	static boolean isMirrorInverse(int arr[])   //function to check whether an array is mirrorinverse or not
	{
		for (int i = 0; i < arr.length; i++) {

			// If condition fails for any element
			if (arr[arr[i]] != i)
				return false;
		}

		// Given array is mirror-inverse
		return true;
	}

	// Driver code
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements in array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
		if (isMirrorInverse(arr))
			System.out.println("Yes,it is a mirrorinverse array");
		else
			System.out.println("No,it is not a mirror inverse array");
        sc.close();
	}
}
