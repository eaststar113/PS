import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class Main {

    static Long a;
    static Long b;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        a = (long) Integer.parseInt(input[0]);
        b = (long) Integer.parseInt(input[1]);

        int resultOfBfs = bfs(a);

        int ans = -1;
        if (resultOfBfs != -1) {
            ans = resultOfBfs + 1;
        }
        System.out.println(ans);
    }

    private static int bfs(Long a) {
        Deque<Long> deque = new ArrayDeque<>();
        int cnt = 0;
        int ans = 0;
        deque.add(a);
//2 4 21 8 41 42 211 16 81 82 411 84 422
        while (!deque.isEmpty()) {

            int size = deque.size();

            for (int i = 0; i < size; i++) {
                Long number = deque.poll();
                if (Objects.equals(number, b)) {
                    return cnt;
                }
                if (number * 2 <= b) {
                    deque.add(number * 2);
                }
                if (number * 10 + 1 <= b) {
                    deque.add(number * 10 + 1);
                }
            }
            cnt++;
        }
        return -1;
    }
}