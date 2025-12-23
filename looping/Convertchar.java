import java.util.Scanner;
public class Convertchar{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   char uppercase = 'N';
   char lowercase = (char)(uppercase+32);
   System.out.println("uppercase :"+uppercase);
   System.out.println("lowercase:"+lowercase);
}
}