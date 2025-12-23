import java.util.Scanner;
public class Ascending{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   int n= sc.nextInt();
   if(n<0)
   {
    n=-n;
    return;
   }
   int prev =10;
   int ascending =1;
   while(n>0)
   {
    int curr = n%10;
    if(curr>prev)
    {
        ascending =0;
        break;
    }
    prev=curr;
    n=n/10;
   }
   if(ascending ==1)
   {
    System.out.println("number is in Ascending order");
   }
   else 
    System.out.println("number is not in ascending order");
}
}