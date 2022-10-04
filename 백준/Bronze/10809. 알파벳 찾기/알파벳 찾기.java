
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        StringBuilder sb = new StringBuilder();


        for (char temp = 'a'; temp <= 'z'; temp++) {
            for (int i=0; i < S.length(); i++) {
                if (temp == S.charAt(i)) {
                    sb.append(i + " ");
                    break;
                }

                if (i == S.length() - 1){
                    sb.append(-1 + " ");
                }
            }
        }

        System.out.println(sb.toString().trim());
    }
}
