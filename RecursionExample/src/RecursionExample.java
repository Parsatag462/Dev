public class RecursionExample {
    public static void main(String[] args) {
        recursiveMethod(4);
        factorial(5);
        System.out.println(fibonacci(5));
    }

    public static double fibonacci(double d){
        if (d<2)
            return d;
        else
            return fibonacci(d - 1) + fibonacci(d - 2);
    }

    public static double factorial(double d){
        if (d<=1)
            return 1;
        else
            return d * factorial(d-1);
    }

    static void recursiveMethod(int num){
        if (num==0)
            return;
        else {
            System.out.println("Hello "+num);
            recursiveMethod(--num);
            System.out.println(""+num);
            return;
        }
    }
}
