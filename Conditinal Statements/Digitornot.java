import java.util.Scanner;
public class Digitornot{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int ch = sc.next().charAt(0);
      if ((ch >='0'&&ch<='9')||(ch<'0'&&ch>=-'9'))
      {
          System.out.println("Digits");  
         }
      else
         System.out.println("not a Digits");
   }
}