import java.util.Scanner;
public class Fever{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   int temperature = sc.nextInt();
   if(temperature > 100)
   {
    System.out.println("Fever");
   }
   else
    System.out.println("no fever");
}
}