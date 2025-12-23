package looping;
import java.util.Scanner;
public class Count{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   int num = sc. nextInt();
   int count =0;
   if(num==0)
   {
    System.out.println(1);return;
   }
   while(num!=0)
   {
    int digits = num%10;
    count++;
    num/=10;
   }
   System.out.println(count);
}
}
