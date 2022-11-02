import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int M = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i < M; i++) {
            int value = Integer.parseInt(st.nextToken());
            map.put(value, map.getOrDefault(value, 0 )+ 1);
        }

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i=0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());
            bw.write(map.getOrDefault(value, 0).toString());
            if (st.hasMoreTokens()) {
                bw.write(" ");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
