import java.util.Scanner;
public class AtmSimulation{
    public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   double balance = 10000;
   int choice;
   double amount;
   System.out.println("1.Check balance");
   System.out.println("2.Deposit");
   System.out.println("3.withdrawl");
   System.out.println("4.Exit");
   System.out.println("enter ur choice");
   choice = sc.nextInt();
   switch(choice)
   {
    case 1:
        System.out.println("+balance");
        break;
        case 2:  
        amount = sc.nextDouble();
    balance+= amount;
    System.out.println("deposit succesfull");
    System.out.println("updated balance:"+balance);
    break;
    case 3:
        System.out.println("Withdrawl amount:");
        amount = sc.nextDouble();
        switch (amount<=balance?1:0)
        {
            case 1:
                balance -=amount;
                System.out.println("please collect ur cash");
                System.out.println("Remaining balance:"+balance);
                break;
                case 0:
                    System.out.println("Insufficient balance");
                    break;
        }
        break;
        case 4:System.out.println("Thank you for using ATM");
        break;
        default:
            System.out.println("Inavalid choice");
    }
}
   }