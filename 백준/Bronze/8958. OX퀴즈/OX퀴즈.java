import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        for (int i=0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            char[] ox = st.nextToken().toCharArray();

            //계산 시작
            int score = 0;
            int continueScore = 1;
            for (int j=0; j < ox.length; j++ ){
                if (ox[j] == 'O') {
                    score += continueScore++;
                } else {
                    continueScore = 1;
                }
            }
            System.out.println(score +"");
        }
    }
}
