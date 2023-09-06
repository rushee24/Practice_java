import java.util.ArrayList;
import java.util.Scanner;

public class jp1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr1= new ArrayList<Integer>();
        ArrayList<Integer> arr2= new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> arr3= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the your first array size:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int val=sc.nextInt();
            arr1.add(val);
        }
        System.out.print("Enter the your  are second array size:");
        int n1=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int val=sc.nextInt();
            arr2.add(val);
        }
        arr3.add(arr1);
        arr3.add(arr2);
        System.out.println(arr3);




    }
}
