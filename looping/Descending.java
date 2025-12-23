import java.util.Scanner;
public class Descending{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   int n= sc.nextInt();
   if(n<0)
   {
    n=-n;
    return;
   }
   int prev =-1;
   int descending=1;
   while(n>0)
   {
    int curr = n%10;
    if(curr<prev)
    {
        descending =0;
        break;
    }
    prev=curr;
    n=n/10;
   }
   if(descending ==1)
   {
    System.out.println("number is in descending order");
   }
   else 
    System.out.println("number is not in descending order");
}
}