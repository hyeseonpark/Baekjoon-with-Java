import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i=0; i < S.length(); i++) {
            for (int j=i+1; j <= S.length(); j++) {
                String value = S.substring(i, j);
                hashMap.put(value, hashMap.getOrDefault(value, 0) + 1);
            }
        }
        System.out.print(hashMap.size());
    }
}
