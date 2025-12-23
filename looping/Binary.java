import java.util.Scanner;
public class Binary{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   long binary = sc.nextLong();
   int decimal = 0;
   int multiplier = 1;
   while(binary>0)
   {
    long lastdigit = binary%10;
    decimal +=lastdigit*multiplier;
    multiplier *=2;
    binary =binary/10;

   }
   System.out.println(decimal);
}
}
