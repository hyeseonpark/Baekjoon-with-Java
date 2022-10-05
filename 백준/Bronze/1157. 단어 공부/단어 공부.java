import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int c = System.in.read();
        int[] arr = new int[26];
        
        while (c > 64) { // 알파벳을 입력받는 동안
            if (c <97) { // 대문자의 경우
                arr[c - 65]++;
            } else { // 소문자의 경우
                arr[c - 97]++;
            }
            
            c = System.in.read(); // 다음 알파벳 새로 입력
        }
        
        int max = -1;
        char ch = '?';
        
        for (int i=0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 'A');
                
            } else if (arr[i] != 0 && arr[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
