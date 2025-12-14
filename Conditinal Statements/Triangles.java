import java.util.Scanner;
public class Triangles {
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   int b = sc.nextInt();
   int c = sc.nextInt();
   if(a==b&&b==c)
   {
    System.out.println("Equialateral");
   }
   else if(a==b||b==c||a==c)
   {
    System.out.println("Isosceles");
   }
   else 
    System.out.println("Scalene");
}
}