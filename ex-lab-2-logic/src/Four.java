import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int n = sc.nextInt();
        if (n%2==0)
            System.out.println("1 it is even");
        else
            System.out.println("0 it is odd");
    }
}
