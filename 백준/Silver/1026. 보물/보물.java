import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> arrayListA = inputArrayList(br,n);
        ArrayList<Integer> arrayListB = inputArrayList(br,n);

        Collections.sort(arrayListA);
        Collections.sort(arrayListB,Comparator.reverseOrder());

        int result = 0;
        for(int i = 0;i<n;i++){
            result += arrayListA.get(i)*arrayListB.get(i);
        }
        System.out.println(result);
    }
    private static ArrayList<Integer> inputArrayList(BufferedReader br, int n) throws IOException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i<n;i++){
            arrayList.add(Integer.valueOf(st.nextToken()));
        }
        return arrayList;
    }
}