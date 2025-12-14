import java.util.Scanner;
public class Mobile{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   int charge  = sc.nextInt();
   if(charge >=80)
   {
    System.out.println("Full");
   }
   else if(charge >=50)
   {
    System.out.println("moderate");
   }
   else 
    System.out.println("low");
}
}