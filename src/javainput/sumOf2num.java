package javainput;
import java.util.Scanner;
public class sumOf2num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int x =  sc.nextInt();
        System.out.println("enter second number");
        int y = sc.nextInt();
        int sum = x+y;
        System.out.println("the sum is:"+sum);

    }
}