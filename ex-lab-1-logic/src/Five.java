import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double a = sn.nextDouble();
        System.out.println("The diameter of the circle is: "+(a*2));
        System.out.println("The perimeter of the circle is: "+(2*a*3.14159));
        System.out.println("The area of the circle is: "+(a*3.14159*a));
    }
}
