import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(st.nextToken()); // 달팽이가 낮동안 올라갈 수 있는 길이
        int B = Integer.parseInt(st.nextToken()); // 밤에 떨어지는 길이
        int V = Integer.parseInt(st.nextToken()); // 나무 막대 길이

        int day = (V - B) / (A - B);
        
        if ((V-B)%(A-B) != 0) {
            day++;
        }
        System.out.println(day);
    }
}
