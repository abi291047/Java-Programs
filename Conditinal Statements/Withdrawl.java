import java.util.Scanner;
public class Withdrawl{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   int amount  = sc.nextInt();
   int balance = sc.nextInt();
   if(amount<=balance )
   {
    if(amount%100==0)
    {
        balance-=amount;
        System.out.println("withdrawl successfull");
    }
    else
        System.out.println("amount must be multiples of 100");
   }
   else
    System.out.println("insufficient pin");
}
}
