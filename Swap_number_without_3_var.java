class Swap_number_without_3_var{
  public static void main(String[] args){
    int a = 20;
    int b = 5;

    System.out.println("This is the number Before Swapping:");
    System.out.println("num1 = " + a);
    System.out.println("num2 = " + b);

    a  = a + b;
    b = a - b;
    a = a - b;

    System.out.println("Then:");
    System.out.println("num1 = " + a);
    System.out.println("num2 = " + b);
   

}
};
