package com.JSd;

import java.util.Scanner;

public class ran_gen{
    public static void main(String[] args)
    {
        int num=55;


        for(int i=1;i<=5;i++)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your number");
            int num1=sc.nextInt();
            if(num==num1)
            {
                System.out.println("Win the game");
                break;
            }
            else if(num>num1)
            {
                System.out.println(" Enter the small number");
            }
            else
            {
                System.out.println("Enter the big number");
            }
        }

    }
}
