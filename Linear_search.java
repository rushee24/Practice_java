import java.util.Scanner;

public class jp1 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int  key=sc.nextInt();
        for(int i=0;i<=arr.length;i++)
        {
            if(arr[i]==key)
            {
                System.out.println("YES Present "+ arr[i]);
                break;
            }
        }
    }
}
