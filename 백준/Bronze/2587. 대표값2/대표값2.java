import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int sum = 0;

        for (int i=0; i < 5 ;i++) {
            list.add(Integer.parseInt(br.readLine()));
            sum += list.get(i);
        }
        Collections.sort(list);
        System.out.println(sum/5);
        System.out.print(list.get(2));
    }
}
