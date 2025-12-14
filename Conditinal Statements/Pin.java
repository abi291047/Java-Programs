import java.util.Scanner;
public class Pin{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   int s_pin = sc.nextInt();
   int e_pin = sc.nextInt();
   if(e_pin==s_pin)
   {
    System.out.println("withdrawl");
   }
   else 
    System.out.println("not allow");
}
}