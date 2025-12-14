import java.util.Scanner;
public class Dvtwofive{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   int num = sc.nextInt();
   if((num%2==0)&&(num%5==0))
   {
    if(num%8!=0)
    {
        System.out.println("Divisible by 2and 5 but not 8");
    }
   }
   else
    System.out.println(" not Divisible by 2and 5 but not 8");
}
}