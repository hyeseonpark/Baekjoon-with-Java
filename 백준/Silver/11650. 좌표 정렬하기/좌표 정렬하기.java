import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int[] tempArr = {x, y};
            list.add(tempArr);
        }

        Comparator<int[]> cp = (o1, o2) -> {
            if (o1[0] > o2[0]) {
                return 1;
            } else if (o1[0] == o2[0]) {
                if ( o1[1] > o2[1]) {
                    return 1;
                }
            }
            return -1;
        };
        Collections.sort(list, cp);

        for (int[] item : list) {
            System.out.println(item[0] + " " + item[1]);
        }
     }
}
