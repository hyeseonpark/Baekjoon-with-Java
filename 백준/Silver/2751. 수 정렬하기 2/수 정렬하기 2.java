import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        for(int i=0; i < N; i++) {
            list.add(Integer.valueOf(br.readLine()));
        }
        
        /* Collections.sort()은 Object type arrays에 대해 Merge Sort 보다 향상된
        Tim Sort를 수행한다. Tim sort란 합병정렬의 최악의 경우와 삽입정렬의 최선의 경우를
        짬뽕한 알고리즘으로 시간복잡도는 O(n) ~ O(nlogn)을 보장한다.*/
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        // TODO 출력으로 StringBuilder를 사용하는 것이 성능면에서 더 좋다
        // StringBuilder는 String과 문자열을 더할 때 새로운 객체를 생성하는 것이 아니라,
        // 기존의 데이터에 더하는 방식을 사용하기 때문에 속도도 빠르며 상대적으로 부하가 적다.

        for (Integer value : list) {
            sb.append(value+"\n");
        }
        System.out.print(sb);
    }
}
