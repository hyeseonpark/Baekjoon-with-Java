import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());

        for (int i=0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            int H = Integer.parseInt(st.nextToken()); // 호텔의 층 수
            int W = Integer.parseInt(st.nextToken()); // 방 수
            int N = Integer.parseInt(st.nextToken()); // 몇번째 손님

            int floor = (N%H) == 0? H : (N%H);
            int num = (N%H) == 0 ? N/H : N/H + 1;

            System.out.println(String.format("%d%02d", floor, num));
        }
    }
}
