import java.util.Scanner;
public class Purchase{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   double amount  = sc.nextDouble();
   double discount =0;
   if(amount<=1000)
   {
    discount =0;
   }
   else if(amount>=3000)
   {
    discount =amount *0.25;
   }
   else if(amount>=5000)
   {
    discount = amount*0.50;
   }
   else {
    discount = amount*0.60;
}
double finalamount = amount-discount;
System.out.println(discount);
System.out.println(finalamount);
}
}
