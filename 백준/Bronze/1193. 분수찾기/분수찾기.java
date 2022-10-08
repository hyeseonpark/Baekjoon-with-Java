import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int other = 0;
        int time = 1;

        while(true) {
            if ( X - forValue(time) > 0 ) {
                time++;
            } else {
                other = X - forValue(time - 1);
                break;
            }
        }

        int[] arr = new int[time];
        for (int i=0; i < time; i++) {
            arr[i] = i + 1;
        }

        if (time % 2 == 0) { // 짝수
            System.out.println(arr[other -1] + "/" + arr[arr.length - other]);
        } else {
            System.out.println(arr[arr.length - other] + "/" + arr[other -1]);
        }
    }

    public static int forValue(int value) {
        int returnValue = 0;
        for (int i=value; i > 0 ; i--) {
            returnValue += i;
        }

        return returnValue;
    }
}
