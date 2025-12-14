import java.util.Scanner;
public class Mobiledata{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   double gb = sc.nextDouble();
   if(gb<=1)
   {
    System.out.println("Low data");
   }
   else if(gb<=2)
   {
    System.out.println("Half consumed");
   }
   else 
    System.out.println("data over");
}
}