import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int num = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] list = new int[101];
			for(int i = 0 ;i<100;i++){
    			list[i] = Integer.parseInt(st.nextToken());
			}
			int dump = 0;
			while(dump<=num){
    			Arrays.sort(list);
    			if(list[list.length - 1] - list[0] <= 1){
        			break;
    			}
    			list[0] += 1;
    			list[list.length - 1] -= 1;
    			dump++;
			}
            System.out.printf("#%d ",test_case);
            System.out.println(list[list.length - 1] - list[0] + 1);
		}
	}
}