import java.util.Scanner;
public class Firstdigit{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   if(n<0)
   {
      n=-n;
   }
   while(n>=10)
   {
      n=n/=10;
   }
   System.out.println("firstdigit:"+n);
}
}

