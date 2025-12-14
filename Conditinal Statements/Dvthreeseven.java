import java.util.Scanner;
public class Dvthreeseven{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   int num = sc.nextInt();
   if((num%3==0)||(num%7==0))
   {
    System.out.println("Divisible by 3 and 7");
   }
   else
    System.out.println("Not Divisible by 3 and 7");
}
}