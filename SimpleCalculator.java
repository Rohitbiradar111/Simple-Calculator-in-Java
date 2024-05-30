//This is a Simple Calculator Program in Java

import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String args[])
    {
        System.out.println("Enter below operation"+"\n"+
                           "Press 1 for Addition operation\n"+
                           "Press 2 for subtraction operation\n"+
                           "Press 3 for Multiplication operation\n"+
                           "Press 4 for Division operation\n"+
                           "Press 5 for Modulus operation\n");
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        if(operation!=1 && operation!=2 && operation!=3 && operation!=4 && operation!=5)
        {
            System.out.println("INVALID OPERATION ENTERED,PLEASE TRY AGAIN");
        }
        else
        {
        System.out.print("Enter 1st number = ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number = ");
        int b = sc.nextInt();

        if(operation == 1)
        {
            System.out.println("Addition operation of a and b = "+(a+b));
        }
        else if(operation == 2)
        {
            System.out.println("Subtraction operation of a and b = "+(a-b));
        }
        else if(operation == 3)
        {
            System.out.println("Multiplication operation of a and b = "+(a*b));
        }
        else if(operation == 4)
        {
            if(b!=0)
            System.out.println("Division operation of a and b = "+(a/b));
            else
            System.out.println("2nd number cannot be zero");
        }
        else
        {
            if(b!=0)
            System.out.println("Modulus operation of a and b = "+(a%b));
            else
            System.out.println("2nd number cannot be zero");
        }
        sc.close();
        }
    }
}