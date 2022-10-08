import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        N= N-1;
        int cnt = 1;

        while(N > 0) {
            N = N - 6 * cnt++;
        }

        System.out.print(cnt +"");
    }
}
