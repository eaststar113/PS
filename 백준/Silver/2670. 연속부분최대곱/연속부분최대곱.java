import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Double> arrayList = new ArrayList<>();
        for(int i = 0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arrayList.add(Double.valueOf(st.nextToken()));
        }

        double currentSum = 0;
        double maxSum = 0;
        for(int i = 0;i<n;i++){
            currentSum = Math.max(arrayList.get(i),arrayList.get(i)*currentSum);
            maxSum = Math.max(currentSum,maxSum);
        }
        String result = String.format("%.3f", maxSum);
        System.out.println(result);
    }
}