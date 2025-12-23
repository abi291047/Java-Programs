import java.util.Scanner;
public class Oddevensum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int evensum=0;
        int oddsum=0;
        while(num>0){
           int digit =num%10;
           if(digit%2==0){
           evensum+=digit;
           }
           else{
            oddsum +=digit;
           }
            num = num/10;
        }
        int difference = evensum -oddsum;
        System.out.println(difference);
    }
}
