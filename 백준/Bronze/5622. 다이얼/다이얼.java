import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] ch = new BufferedReader(new InputStreamReader(System.in)).readLine().split("");
        String[] array = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        int time = 0;

        for (int i=0; i < ch.length; i++) {
            for (int j=0; j < array.length; j++) {
                if (array[j].contains(ch[i])) {
                    time += 2 + (j+1);
                }
            }
        }

        System.out.print(time+"");
    }
}
