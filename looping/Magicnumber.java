import java.util.Scanner;
public class Magicnumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0,temp=n;
        while(temp>0)
        {
            sum+=temp%10;
            temp/=10;
        }
        int rev =0,s=sum;
        while(s>0)
        {
            rev =rev*10+s%10;
            s/=10;
        }
        if(sum*rev==n)
        {
            System.out.println("Magic number");
        }
        else 
            System.out.println("not magic number");
    }
}