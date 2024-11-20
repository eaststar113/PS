import java.util.Scanner;
import java.io.FileInputStream;
import java.util.StringTokenizer;
import java.io.BufferedReader; 
import java.io.InputStreamReader; 

class Solution
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int test_case = 1; test_case <= 10; test_case++)
		{
        	int num = Integer.parseInt(br.readLine());
            if (num < 5) {
                System.out.println("#" + test_case + " 0");
                continue;
            }
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int[] apt = new int[num];
        	for(int i = 0;i<num;i++){
            	apt[i] = Integer.parseInt(st.nextToken());
        	}
        	int ans = 0;
        	for(int i = 2;i<num-2;i++){
            	int lMax = Math.max(apt[i-1],apt[i-2]);
            	int rMax = Math.max(apt[i+1],apt[i+2]);
            	if (apt[i] > lMax && apt[i] > rMax) {
                    ans += apt[i] - Math.max(lMax, rMax);
                }
        	}
            System.out.println("#"+test_case+" "+ans);
		}
	}
}