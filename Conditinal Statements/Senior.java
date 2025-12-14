import java.util.Scanner;
public class Senior{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   int age = sc.nextInt();
   if(age>=60)
   {
    System.out.println("Senior citizen");
   }
   else 
    System.out.println("Not a Senior citizen");
}
}