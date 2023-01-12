import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a sentence: ");
//        StringBuilder sn = new StringBuilder(sc.nextLine());
        String sn = sc.nextLine();
        for (int i=0; i<sn.length(); i++){
            if (sn.charAt(i) == ' '){
                sn.toUpperCase(charAt(i+1));
            }
        }
        System.out.println(sn);
    }
}
