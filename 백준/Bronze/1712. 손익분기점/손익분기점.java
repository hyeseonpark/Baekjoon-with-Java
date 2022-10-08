import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int CB = C-B;
        double cnt = 0;

        if (CB <= 0) {
            cnt = -1;
        } else {
            cnt = (double)A/CB;

            if (cnt - (int)cnt == 0) {
                cnt++;
            } else {
                cnt = Math.ceil(cnt);
            }
        }

        System.out.println((int)cnt + "");
    }
}
