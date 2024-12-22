import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i<num;i++){
            arrayList.add(Integer.valueOf(st.nextToken()));
        }

        int currentSum = 0;
        int maxSum = -1000;
        for(int i = 0;i<num;i++){
            currentSum = Math.max(arrayList.get(i),arrayList.get(i)+currentSum);
            maxSum = Math.max(currentSum,maxSum);
        }
        System.out.println(maxSum);
    }
}