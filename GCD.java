package javaapplication1;
import java.util.Scanner;

public class GCD {
    
static Scanner sc = new Scanner(System.in);

public static void  main(String [] args)
{
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the first number:");
    int b = input.nextInt();
    System.out.println("Enter the second number:");
    int d = input.nextInt();
    System.out.println("The GCD of " + b + " and " + d + " is " +  getGcd(b,d) + ".");
}

public static int getGcd(int b, int d)
{
    int gcd = 1;

    if(b>d){
        for(int i = d; i >=1; i--){
           if(b%i==0 && d%i ==0){
             return i;
            }
        }
    }
    else{
        for(int j = b; j >=1; j--){
            if(b%j==0 && d% j==0){
              return j;
            }
        }
    }   
    return gcd;
}
}