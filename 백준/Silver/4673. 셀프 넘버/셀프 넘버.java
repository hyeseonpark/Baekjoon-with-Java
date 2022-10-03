import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int value = 1;
        List<Integer> dArray = new ArrayList<Integer>();

        while(value <= 10000) {
            dArray.add(d(value++));
        }
        for (int i=1; i < 10000; i++){
            if (!dArray.contains(i)) {
                System.out.println(i);
            }
        }
    }

    public static int d(int n) {
        int sum = n;

        while(n != 0) {
            sum += n%10;
            n = n/10;
        }

        return sum;
    }
}
