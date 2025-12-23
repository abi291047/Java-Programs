import java.util.Scanner;
public class Butterfly
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int s=1;s<=2*(n-i);s++)  
            {
                System.out.print(" ");
            }
            for(int p=1;p<=i;p++)
                {
                    System.out.print("*");
                }  
                System.out.println();  
          }
for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int s=1;s<=2*(n-i);s++)  
            {
                System.out.print(" ");
            }
            for(int p=1;p<=i;p++)
                {
                    System.out.print("*");
                }    
          System.out.println();
    }
}
}
            