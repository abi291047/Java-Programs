import java.util.Scanner;
public class Occur{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   int num = sc.nextInt();
   int digit= sc.nextInt();
   if(num<0)
   {
    num =-num;
    return;
   }
   int found =0;
   while(num>0)
   {
      int last =num%10;
      if(last==digit)
      {
        found =1;
        break;
      }
      num = num/10;
   }
   if(found ==1)
   {
    System.out.println("digit is occured");
   }
   else 
    System.out.println("digit is not occured");
}
}
   