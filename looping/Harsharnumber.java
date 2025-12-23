package looping;
import java.util.Scanner;
public class Harsharnumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp =num;
        int sum =0;
        while(temp>0)
        {
            sum= sum+temp%10;
            temp = temp/10;
        }
        if(num%sum==0)
        {
            System.out.println("Harshard number");
        }
        else 
            System.out.println("nit a harshard number");
    }
}
