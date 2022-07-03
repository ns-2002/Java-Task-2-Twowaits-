import java.util.Scanner;
class pallindromestr {
	public static String isPalindrome(String str)
	{
		//empty string to store the reverse of the original string
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		//Check if both the strings are equal
		if (str.equals(rev)) 
			return "Pallindrome String";
		else return "Not a Pallindrome String";
	}
	public static void main(String[] args)
	{
        Scanner s=new Scanner(System.in);
		// Input string
        System.out.println("Enter a string:");
		String str =s.nextLine();

		// Convert the string to lowercase
		str = str.toLowerCase();
		System.out.print(isPalindrome(str));

        s.close();          //close scanner
	}
}
