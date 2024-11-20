import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
		for(int test_case = 1; test_case <= 10; test_case++)
		{
            int num = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] list = new int[1001];
            for(int i = 0 ;i<1000;i++){
                list[i] = Integer.parseInt(st.nextToken());
            }
            int answer = 0;
            Arrays.sort(list);
            int max = list[list.length-1];
            int count[] = new int[max+1];
            for(int i=0; i<list.length; i++) {
                count[list[i]]++;
            }

            int maxCount = count[0];
            for(int i=1; i<count.length; i++) {
                if(maxCount < count[i]) {
                    maxCount = count[i];
                    answer = i;
                } else if(maxCount == count[i]) {
                    answer = i;
                }
            }
            System.out.printf("#%d ",test_case);
            System.out.println(answer);
        }
	}
}