import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    static int n;
    static int s;
    static int count = 0;
    static List<Integer> sequence;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Stream.of(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        n = input[0];
        s = input[1];

        sequence = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        dfs(0,0,0);

        System.out.println(count);
    }
    private static void dfs(int start, int sum, int size){
        if(start == n){
            if(sum == s && size > 0){
                count++;
            }
            return;
        }
        dfs(start + 1, sum + sequence.get(start), size + 1);
        dfs(start + 1, sum, size);
    }
}