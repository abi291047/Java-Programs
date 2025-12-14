import java.util.Scanner;
public class Squarerectangle{
    public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   int a= sc.nextInt();
   int b= sc.nextInt();
   int c= sc.nextInt();
   int d = sc.nextInt();
   if(a==b&& b==c&& c==d&& d==a)
   {
    System.out.println("square ");
   }
   else if((a==b&&c==d)&&(a==c&&b==d)){
    System.out.println("rectangle");
}
else 
    System.out.println("not forms");
}
}