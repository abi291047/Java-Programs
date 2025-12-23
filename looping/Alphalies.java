import java.util.Scanner;
public class Alphalies{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   char start = sc.next().charAt(0);
   char end = sc.next().charAt(0);
   if(start>end)
   {
    char temp =start;
    start=end;
    end = temp;
   }
   for(char c = start;c<=end;c++)
   {
    System.out.print( c+" ");
   }
}
}