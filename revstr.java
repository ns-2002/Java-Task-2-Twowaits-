import java.util.Scanner;
 
class revstr{
    public static void main (String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a strIng to be reversed:");
        String str= sc.nextLine();
        String nstr="";
        char ch;
       
      System.out.print("Original String: ");
      System.out.println(str); //Example word
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed String: "+ nstr);

      sc.close();
    }
}
