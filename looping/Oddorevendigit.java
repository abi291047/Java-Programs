import java.util.Scanner;
public class Oddorevendigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num>0){
        int digit = num%10;
        if(digit%2==0)
        {
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        num =num/10;
    }
}
}
        