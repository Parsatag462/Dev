import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Input a string:");
        String r = sn.next();
        StringBuilder rn = new StringBuilder(r);
        System.out.println("Original: "+r);
        System.out.println("Reversed: "+rn.reverse());
    }
}
