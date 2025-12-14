import java.util.Scanner;
public class Battery{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   int battery = sc.nextInt();
   if(battery<50)
   {
    System.out.println("Low battery");
   }
   else if(battery==50)
   {
    System.out.println("%50% consumed");
   }
   else if(battery>50)
   {
    System.out.println("Battery full");
   }
   else
    System.out.println("Switch off");
   }
}