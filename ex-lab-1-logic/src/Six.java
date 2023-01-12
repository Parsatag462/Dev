import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sn.nextInt();
        System.out.println("Enter another number:");
        int b = sn.nextInt();
        System.out.println("Enter another another number:");
        int c = sn.nextInt();
        System.out.println("Enter another another another number:");
        int d = sn.nextInt();
        System.out.println("Enter another another another another number:");
        int e = sn.nextInt();
        System.out.println("The average of numbers "+a+", "+b+", "+c+", "+d+", and "+e+" is: "+((a+b+c+d+e)/5));
    }
}
