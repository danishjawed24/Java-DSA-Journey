package Basicofjava;

public class MultipleVariables {
    public static void main(String[] args) {
        int x = 5, y = 8, z = 10;
        System.out.println("The value of x is " + x);
        System.out.println("The value of y is " + y);
        z = 10;
        z = x / y;
        System.out.println("The value of z is " + z);
        System.out.println(x+y+z);
    }
}
