package looping;
import java.util.Scanner;
public class Gcd{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   int a = sc. nextInt();
   int b = sc.nextInt();
   sc.close();
   int x = a,y=b;
   while(x!=0)
   {
    if(x>y)
        x=x-y;
    else
        y=y-x;
   }
   System.out.println(x);
   }
}
