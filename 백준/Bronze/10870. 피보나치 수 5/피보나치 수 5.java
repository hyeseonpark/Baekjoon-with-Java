import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.print(fibonacci(N));
    }

    public static int fibonacci(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        while(list.size() - 1 < n) {
            list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
        }

        return list.get(n);
    }
}
