import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.Iterator;

class Solution
{
	public static void main(String args[]) throws Exception
	{	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int test_case = 1; test_case <= 10; test_case++)
		{
            StringBuilder sb = new StringBuilder();
            int num = Integer.parseInt(br.readLine());
            Queue<Integer> queue = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            for(int i = 0;i<8;i++){
                queue.add(Integer.valueOf(st.nextToken()));
            }
            while(true){
                int dec = 1;
                boolean checkNegative = false;
                for(int i =0;i<5;i++){
                    int temp;
                    temp = queue.poll() - dec;
                    if(temp<=0){
                    	queue.add(0);
                        checkNegative = true;
                        break;
                    }
                    dec++;
                    queue.add(temp);
            	}
                if(checkNegative){
                	break;
                }
        	}
            sb.append("#").append(test_case).append(" ");
            for (int valueInQ : queue) {
                sb.append(valueInQ).append(" ");
            }
            System.out.println(sb);
		}
	}
}