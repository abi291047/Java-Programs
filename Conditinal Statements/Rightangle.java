import java.util.Scanner;
public class Rightangle {
    public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   int b = sc.nextInt();
   int c= sc.nextInt();
   if(a+b>c && b+c>a && c+a>b)
   {
    if((a*a== b*b +c*c)||(b*b== a*a + c*c)||(c*c== a*a+b*b))
    {
        System.out.println("Right angled triangle");
    }
        else
            System.out.println("not Right angled triangle");
    }
    else
        System.out.println("Not valid");
}
}

    