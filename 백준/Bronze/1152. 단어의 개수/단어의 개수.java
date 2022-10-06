import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputString = new BufferedReader(new InputStreamReader(System.in)).readLine().trim();
        if (inputString.length() == 0) {
            System.out.print(0+"");
        } else {
            String[] arr = inputString.split(" ");
            System.out.print(arr.length);
        }
    }
}
