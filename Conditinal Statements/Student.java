import java.util.Scanner;
public class Student{
public static void main(String[]args)
{
   Scanner sc = new Scanner(System.in);
   int marks = sc.nextInt();
   int grade;
   if(marks>80)
     grade=1;
  else if(marks>60)
    grade =2;
  else if(marks>=40)
    grade =3;
else 
    grade = 4;
switch(grade)
{
   case 1:
    System.out.println("A");
    break;
    case 2:
        System.out.println("B");
        break;
        case 3:
            System.out.println("C");
            break;
            default:
                System.out.println("Fail");
}
}
}
        