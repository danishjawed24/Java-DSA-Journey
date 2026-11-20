package Conditionals;
import java.util.Scanner;
public class divisiblebythreeandfive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if(num%5==0 && num%3==0){
            System.out.println("the number is divisible by 5 and 3");
        }
        else{
            System.out.println("the number is not divisible by 5 and 3");
        }

    }
}
