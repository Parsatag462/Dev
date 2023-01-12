import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sn.nextInt();
        System.out.println("Enter another number:");
        int b = sn.nextInt();
        System.out.println("The sum of numbers "+a+" and "+b+" is: "+(a+b));
    }
}
