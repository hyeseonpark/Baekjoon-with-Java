import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = reverse(sc.nextInt());
        int B = reverse(sc.nextInt());

        System.out.print(Math.max(A, B));

    }

    private static int reverse(int value) {
        return value/100 + (value%100)/10 * 10 + value%10 * 100;
    }
}
