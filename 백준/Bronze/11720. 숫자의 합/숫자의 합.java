import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        br.readLine();

        char[] values = br.readLine().toCharArray();
        br.close();

        int sum = 0;
        for (int value: values) {
            sum += value - 48;
        }

        bw.write(sum + "");
        bw.flush();
        bw.close();
    }
}
