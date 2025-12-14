import java.util.Scanner;
public class Number{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   long mobile = sc.nextLong();
   long temp =mobile;
   int count =0;
   while(temp!=0)
   {
    temp = temp/10;
    count++;
   }
   if(count==10)
   {
    System.out.println("valid number");
   }
   else 
    System.out.println("invalid number");
}
}