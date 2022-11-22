package hash;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

//181356kb	1268ms
public class bakjoon_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cardCnt  = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> cardMap =  new HashMap<>(cardCnt);
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < cardCnt; ++i)
        {
            // 이미 있으면
            int cardNum = Integer.parseInt(st.nextToken());
            if(cardMap.containsKey(cardNum)) {
                int incCnt = cardMap.get(cardNum)+1;
                cardMap.put(cardNum, incCnt);
            }
            else {
                cardMap.put(cardNum, 1);
            }
        }

        int k = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < k; ++i)
        {
            Integer value = cardMap.get(Integer.parseInt(st.nextToken()));
            if(null == value)
                bw.write(0 +" ");
            else
                bw.write(String.valueOf(value) +" ");
        }

        bw.flush();
        br.close();
        bw.close();

    }
}
