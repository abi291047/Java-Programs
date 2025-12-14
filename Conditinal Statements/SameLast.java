import java.util.Scanner;
public class SameLast{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   int a= sc.nextInt();
   int b = sc.nextInt();
   int alast=a%10;
   int  blast=b%10;
   if(alast==blast)
   {
      System.out.println("same");
   }
   else
      System.out.println(" Not same");
}
}