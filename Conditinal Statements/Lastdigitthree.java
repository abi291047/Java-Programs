import java.util.Scanner;
public class Lastdigitthree{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   int num = sc.nextInt();
   int lastdigit = num%10;
   if(lastdigit%3==0){
   System.out.println("divisible by 3");
   }
   else
      System.out.println("not divisible by 3");
}
}
