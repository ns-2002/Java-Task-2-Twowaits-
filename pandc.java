import java.util.*;   
public class pandc{  
   static int fact(int number) {  
      int f = 1;  
      int j = 1;  
      while(j <= number) {  
         f = f * j;  
         j++;  
      }  
      return f;  
   }  
   public static void main(String args[]) {  
         
    List<Integer> numbers = new ArrayList<Integer>();  
    Scanner sc=new Scanner(System.in);
      numbers.add(sc.nextInt());    
      numbers.add(sc.nextInt());
      int n = numbers.size();  
      int r = 3;  
      int res1,res2;  
        
      res1= fact(n) / fact(n-r);  
      System.out.println("The permutation value for the numbers list is: " + res1);  

      res2 = fact(n) / (fact(r) * fact(n-r));  
      System.out.println("The combination value for the numbers list is: " + res2);  
      sc.close();
   }  
}  