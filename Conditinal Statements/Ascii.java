import java.util.Scanner;
public class Ascii{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      char ch=sc.next().charAt(0);
      int Ascii = ch;
      if(Ascii%2==0)
      {
        System.out.println("even");
      }
      else
        System.out.println("odd");
   }
}
