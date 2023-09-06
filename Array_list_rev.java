import java.util.ArrayList;
import java.util.Scanner;

public class jp1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<Integer>();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the your number count:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int val=sc.nextInt();
            arr.add(val);
        }
        System.out.println(arr.size());
        for(int i=arr.size()-1;i>=0;i--)
        {
            System.out.println(arr.get(i));
        }


    }
}
