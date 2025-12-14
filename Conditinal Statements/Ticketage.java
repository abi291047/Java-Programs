import java.util.Scanner;
public class Ticketage{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   int age  = sc.nextInt();
   if(age <10)
   {
    System.out.println("chikd:"+"free");
   }
   else if(age>12 && age <=20)
   {
    System.out.println("adult:"+200);
   }
   else 
   {
    System.out.println("Senior:"+350);
   }
}
}