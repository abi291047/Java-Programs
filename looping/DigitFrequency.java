import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int d = 0;d<=9;d++)
        {
            int temp =num;
            int count =0;
            while(temp>0)
            {
                if(temp%10==d)
                {
                    count++;
                }
                temp = temp/10;
            }
            if(count>0)
            {
                System.out.println(d+"->"+" "+count);
            }

        }}
        }

        