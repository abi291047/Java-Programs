import java.util.Scanner;
public class Firstoddeven{
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
   if(n%2==0){
   System.out.println("even");
}
else 
    System.out.println("odd");
}
}

