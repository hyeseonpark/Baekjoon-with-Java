import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());

        for (int i=0; i < C; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken(" "));

            float totalScore = 0;
            int[] valueArray = new int[N];

            for (int j=0; j < N ; j++) {
                valueArray[j] = Integer.parseInt(st.nextToken(" "));
                totalScore += valueArray[j];
            }
            float avg = totalScore/N;

            float aboveAvgCnt = 0;
            for (int j=0; j < N; j++) {
                if (valueArray[j] > avg) {
                    ++aboveAvgCnt;
                }
            }

            System.out.println(String.format("%.3f",aboveAvgCnt/N * 100)+ "%");
        }
    }
}
