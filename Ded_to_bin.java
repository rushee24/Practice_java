import java.util.Scanner;

public class jds1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        int binary = 0;
        int base = 1;

        while (decimal > 0) {
            int remainder = decimal % 2;
            //System.out.println(remainder);
            binary += remainder * base;
            base *= 10;
            decimal /= 2;
        }

        System.out.println("Binary : " + binary);
    }
}



