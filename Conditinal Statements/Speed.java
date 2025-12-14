import java.util.Scanner;
public class Speed{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   int speed = sc.nextInt();
   if(speed>100)
   {
      System.out.println("speed exceeds 100");
   }
   else 
      System.out.println("speed with limits");
}
}