
public class jp1{
    public static int linearSearch(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String a[]){
        int[] a1= {12,4,7,5,3,32,77,43};
        int key = 12;
        System.out.println(key+" Index: "+linearSearch(a1, key));
    }
}



/*
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
*/
