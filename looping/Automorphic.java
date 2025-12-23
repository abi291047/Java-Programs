package looping;
import java.util.Scanner;
public class Automorphic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int square = n*n;
        int temp =n;
        int digits=0;
        while(temp>0)
        {
            digits++;
            temp/=10;
        }
        int lastdigits = square%(int)Math.pow(10,digits);
        if(lastdigits ==n)
        {
            System.out.println("Automorphic number");
        }
        else
            System.out.println("Not automorphic number");
        }
    }
