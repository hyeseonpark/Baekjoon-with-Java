import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(sb.readLine());
        int cnt = time;

        for (int i=0; i < time; i++) {
            int[] arr = new int[26];
            char[] str = sb.readLine().toCharArray();

            for (int j=0; j < str.length; j++) {
                if (j+1 == str.length || str[j] != str[j+1]) {
                    arr[str[j] - 'a']++;
                }
            }

            for (int k=0; k < arr.length; k++) {
                if (arr[k] > 1) {
                    --cnt;
                    break;
                }
            }
        }
        System.out.println(cnt + "");
    }
}
