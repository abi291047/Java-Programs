import java.util.Scanner;
public class Lastthree{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   int num = sc.nextInt();
   int Lastdigit = num%10;
   if(Lastdigit%2==0){
   System.out.println("even");
   }
   else
      System.out.println("odd");
}
}