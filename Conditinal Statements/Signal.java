import java.util.Scanner;
public class Signal{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   String light  = sc.nextLine().toLowerCase();
   if(light.equals("red"))
   {
    System.out.println("Stop");
   }
   else if(light.equals("yellow"))
   {
    System.out.println("Ready");
   }
   else if(light.equals("green"))
   {
    System.out.println("Go");
   }
   else 
    System.out.println("Rush");
}
}