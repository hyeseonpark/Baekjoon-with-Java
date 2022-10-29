import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] sArr = new String[N];
        String[] checkArr = new String[M];

        for (int i=0; i < N; i++) {
            sArr[i] = br.readLine();
        }
        for (int i=0; i < M; i++) {
            checkArr[i] = br.readLine();
        }
        int count = 0;
        for (int i=0 ; i < checkArr.length; i++) {
            if (Arrays.asList(sArr).contains(checkArr[i])) {
                count++;
            }
        }
        System.out.print(count);
    }

}
