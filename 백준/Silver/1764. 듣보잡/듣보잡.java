import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new TreeMap<>();

        for (int i =0 ; i <N + M; i++) {
            String value = br.readLine();
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for (String value: map.keySet()) {
            if(map.get(value) == 2) {
                cnt++;
                sb.append("\n"+value);
            }
        }
        sb.insert(0, cnt);

        System.out.print(sb);
    }
}
