package Conditionals;
import java.util.Scanner;
public class divisiblebythreeorfive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if(num%5==0 || num%3==0){
            System.out.println("the number is divisible by either 5 or 3");
        }
        else{
            System.out.println("the number is not divisible by either 5 or 3");
        }

    }
}


