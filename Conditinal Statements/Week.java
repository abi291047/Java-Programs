import java.util.Scanner;
public class Week{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   int days = sc.nextInt();
   switch(days)
   {
    case 1 :
     case 2:
     case 3:
     case 4:
     case 5 :
        System.out.println("Weekdays");
        break;
   case 6:
   case 7:
       System.out.println("Weekend");
}
}
}