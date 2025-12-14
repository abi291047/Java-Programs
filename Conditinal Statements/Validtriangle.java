import java.util.Scanner;
public class Validtriangle{
    public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   int x = sc.nextInt();
   int y = sc.nextInt();
   int z= sc.nextInt();
   if((x+y>z)&&(y+z>x)&&(x+z>y))
   {
    System.out.println("valid");
   }
   else
    System.out.println("invalid");
}
}