package Conditionals;
import java.util.Scanner;
public class nestedthreeandfive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if(num%5==0){
            if(num%3==0){
                System.out.println("The number is divisible by 3 and 5 both");
            }
            else{
                System.out.println("Not divisible");
            }
        }
        else{
            System.out.println("Not divisible");
        }
    }
}
