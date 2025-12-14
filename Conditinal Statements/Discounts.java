import java.util.Scanner;
public class Discounts{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   double bill = sc.nextDouble();
   double discount =0;
   if(bill<500){
    discount = 0;
   }
   else if(bill<=1000 )
   {
    discount = bill*0.5;
   }
   else if(bill<=5000)
   {
    discount = bill*0.10;
   }
   else {
    discount = bill*0.15;
   }
   double finalAmount = bill- discount ;
   System.out.println(discount);
   System.out.println(finalAmount);
}
}
