import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.print(factorial(N));
    }

    public static int factorial(int value) {
        if (value > 1) {
            return value * factorial(value-1);
        } else {
            return 1;
        }
    }
}
