import java.util.Scanner;
public class Daysinmonth{
    public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   int year = sc.nextInt();
   int month = sc.nextInt();
   if(month<1||month>12)
   {
    System.out.println("Invalid");
   }
   else if(month==2)
   {
    if(year%4==0)
    {
        System.out.println("29 days");
    }
    else 
        System.out.println("28 days");
   }
   else if(month ==4||month==6||month==9||month==11)
   {
    System.out.println("30 days");
   }
   else 
    System.out.println("31 days");
}
}