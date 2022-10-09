import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int cross_cnt = 1; // 해당 대각선의 칸 개수
        int prev_cnt_sum = 0; // 직전 대각선 칸들의 합

        while (true) {
            //  해당 대각선의 칸 개수 + 직전 대각선 칸들의 합 이용한 범위 판별
            if (X <= cross_cnt + prev_cnt_sum) {

                if (cross_cnt % 2 == 1) { // 대각선의 칸 개수가 홀수라면
                    // T = cross_cnt + 1
                    // 분자는 큰 수부터 시작
                    // 분모는 작은 수부터 시작
                    System.out.print(
                            (cross_cnt - (X - prev_cnt_sum - 1))
                            + "/"
                            + (X - prev_cnt_sum));

                } else { // 대각선의 개수가 짝수라면
                    System.out.print(
                            (X - prev_cnt_sum)
                                    + "/"
                                    + (cross_cnt - (X - prev_cnt_sum - 1)));
                }
                break;
            } else {
                prev_cnt_sum += cross_cnt;
                cross_cnt++;
            }
        }
    }

}
