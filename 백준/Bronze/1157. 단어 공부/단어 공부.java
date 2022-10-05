import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] valueArray = br.readLine().toCharArray();
        Map<Character, Integer> checkChar = new HashMap<>();

        for (char value : valueArray) {
            if (value >= 'a') {
                value = (char)(value - 32);
            }
            checkChar.put(value, checkChar.getOrDefault(value, 0) + 1);
        }

        int maxValue = Collections.max(checkChar.values());
        int time = 0;

        for (Map.Entry<Character, Integer> value : checkChar.entrySet()) {
            if (value.getValue() == maxValue)
                time++;
        }

        Comparator<Map.Entry<Character, Integer>> comparator
                = Map.Entry.comparingByValue();

        if (time > 1) {
            System.out.print("?");
        } else {
            System.out.print(Collections.max(checkChar.entrySet(), comparator).getKey());
        }
    }
}
