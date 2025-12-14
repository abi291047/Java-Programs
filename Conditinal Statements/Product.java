import java.util.Scanner;
 public class Product{
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);
       int a= sc.nextInt();
       int b = sc.nextInt();
       int c= a*b;
       if(c>0&&c<9)
       {
        System.out.println("Postive");
       }
       else if(c<0&&c>-9)
       {
        System.out.println("negative");
       }
       else 
        System.out.println("Zero");
    }
}
