import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sn.nextInt();
        System.out.println("Enter another number:");
        int b = sn.nextInt();
        System.out.println(a+" added to "+b+" is: "+(a+b));
        System.out.println(a+" subtracted by "+b+" is: "+(a-b));
        System.out.println(a+" multiplied by "+b+" is: "+(a*b));
        System.out.println(a+" divded by "+b+" is: "+(a/b));
        System.out.println(a+" mod "+b+" is: "+(a%b));
    }
}
