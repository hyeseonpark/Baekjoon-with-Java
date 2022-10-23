import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        HashMap<Integer, Integer> set = new HashMap<>();

        for (int i=0; i < N; i++) {
            int key = Integer.parseInt(st.nextToken());
            set.put(key, set.getOrDefault(key, 0) + 1);
        }
        System.out.print(set.getOrDefault(Integer.parseInt(br.readLine()), 0));
    }
}
