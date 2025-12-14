import java.util.Scanner;
public class Ticketbasedon{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   String days = sc.nextLine().toLowerCase();
   if(days.equals("Monday")||days.equals("Tuesday")||days.equals("wednesday")||days.equals("thursday")||days.equals("friday"))
{
   System.out.println("150");
}
else 
System.out.println("100");

}}