import java.util.Scanner;
public class Firstthree{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   int num = sc.nextInt();
   int firstdigit = num/100;
   if(firstdigit%2==0){
   System.out.println("even");
   }
   else
      System.out.println("odd");
}
}
