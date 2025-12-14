import java.util.Scanner;
public class Weather{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   int temp = sc.nextInt();
   if(temp <=15)
   {
      System.out.println("cold");
   }
   else if(temp <=25)
   {
      System.out.println("pleasant");
   }
   else if(temp <=35)
   {
      System.out.println("hot");
   }
   else 
      System.out.println("heat waves");
}
}