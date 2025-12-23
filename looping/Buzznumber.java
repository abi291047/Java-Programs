package looping;
import java.util.Scanner;
public class Buzznumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num %7==0 || num%10==7)
        {
            System.out.println("Buzz number");
        }
        else 
            System.out.println("Not buzz number");
    }
}