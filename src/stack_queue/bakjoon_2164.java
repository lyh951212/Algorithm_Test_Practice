package stack_queue;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
//29540kb,	220ms
public class bakjoon_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> numQ = new ArrayDeque<>();
        for(int i = 0 ; i < n; ++i)
            numQ.add(i+1);

        while(true)
        {
            // 하나 남아있으면 바로 출력
            if(numQ.size() == 1) {
                bw.write(String.valueOf(numQ.peek()));
                break;
            }

            // 큐에 남은게 있다면
            //  1. 맨 위에 있는거 빼기 - 뺀 후 마지막 하나 남아있으면 그대로 break
            int front = numQ.poll();
            if(numQ.size() == 1) {
                bw.write(String.valueOf(numQ.peek()));
                break;
            }
            // 2. 맨 위에 있는거 빼고 남은게 2개 이상이면 맨 위에 있던 카드 맨 뒤로 보냄
            numQ.add(numQ.poll());

        }

        bw.flush();
        br.close();
        bw.close();
    }
}
