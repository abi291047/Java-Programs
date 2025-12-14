import java.util.Scanner;
public class Firslasyear{
    public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   int year = sc.nextInt();
   int firsttwo = year/100;
   int lasttwo= year%100;
   if(firsttwo==lasttwo)
   {
    System.out.println("Equal");
   }
   else 
    System.out.println("Not equal");
}
}