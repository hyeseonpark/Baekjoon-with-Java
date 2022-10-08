import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = new Scanner(System.in).nextInt();

        N= N-1;
        int cnt = 1;

        while(N > 0) {
            N = N - 6 * cnt++;
        }

        System.out.print(cnt +"");
    }
}
