import java.util.Scanner;
public class Bin0s1s{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   long binary = sc. nextLong();
   int count0=0 , count1=0;
   while(binary >0)
   {
      long digit = binary%10;
      if(digit ==1)
      {
         count1++;
      }
      else if(digit ==0){
         count0++;
      }
         binary = binary/10;
      }
      System.out.println("1s:"+count1);
      System.out.println("0s"+count0);
   }
}
   