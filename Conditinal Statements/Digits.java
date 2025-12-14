import java.util.Scanner;
public class Digits{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   int num = sc.nextInt();
   if(num>0&&num<9||num<0&&num>=-9)
   {
    System.out.println("Single digit");
   }
   else if(num>=10&&num<=99||num<-10&&num>=-99)
   {
    System.out.println("two digit");
   }
   else if(num>=100&&num<=999||num<-100&&num>=-999)
   {
    System.out.println("three digit");
   }
   else
    System.out.println("more than threedigit");
}
}