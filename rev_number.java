import java.util.Scanner;

public class jds1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        System.out.println("This is input number" + n);
        int rev=0;
        int sum=0;
        while(n!=0)
        {
            int temp=n%10;
            rev= rev*10+temp;
            sum+=temp;
            n=n/10;

        }
        System.out.println("rev="+rev);
        System.out.println("sum="+ sum);
    }
}
