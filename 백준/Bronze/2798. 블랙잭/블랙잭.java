import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 카드의 개수
        int M = Integer.parseInt(st.nextToken()); // 기준 수

        st = new StringTokenizer(br.readLine());
        int[] card = new int[N];
        for (int i=0; i <N; i++) card[i] = Integer.parseInt(st.nextToken());
        br.close();

        int sum = 0;

        for (int i = 0; i < N - 2; i++) {
            if(card[i] > M) continue;

            for (int j=i+1; j < N - 1; j++) {
                if(card[j] > M) continue;

                for (int k= j+1; k <N; k++) {
                    int temp = card[i] + card[j] + card[k];
                    if (temp == M) {
                        sum = temp;
                    } else if (sum < temp && temp <M){
                        sum = temp;
                    }
                }
            }
        }
        System.out.print(sum);
    }
}
