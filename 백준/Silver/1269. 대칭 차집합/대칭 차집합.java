import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> map = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i=0; i < A; i++) {
            int value = Integer.parseInt(st.nextToken());
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        st = new StringTokenizer(br.readLine());
        for (int i=0; i < B; i++) {
            int value = Integer.parseInt(st.nextToken());
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        int cnt = 0;
        for (Integer value : map.values()) {
            if (value > 1) {
                cnt++;
            }
        }

        System.out.print(A - cnt + B - cnt);
    }

}
