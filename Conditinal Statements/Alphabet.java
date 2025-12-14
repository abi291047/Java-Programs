import java.util.Scanner;
public class Alphabet{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      char ch = sc.next().charAt(0);
      if((ch >='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
      {
          System.out.println("Alphabets");  
         }
      else
         System.out.println("not a alphabet");
   }
}