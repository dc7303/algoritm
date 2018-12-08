package 프로그래머스_자연수_뒤집어서_배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
n은 10,000,000,000이하인 자연수입니다.
입출력 예
n   return
12345   [5,4,3,2,1]
 * @author mark
 *
 */
public class NumberReArray {
    public static void main(String[] args) {
        NumberReArray r = new NumberReArray();
        long n = 12345;
        int[] result = r.solution(n);
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(long n) {
/*        String str = Long.toString(n);
        char[] ch = str.toCharArray();
        int[] answer = new int[ch.length];
        int cnt = 0;
        for(int i = str.length() -1; i >= 0; i--) {
            answer[i] = Integer.parseInt(String.valueOf(ch[cnt]));
            cnt ++;
        }
        return answer;
    }*/
        String a = Long.toString(n);
        int[] answer = new int[a.length()];
        int cnt=0;

        while(n>0) {
            answer[cnt]=(int)(n%10);
            n/=10;
            System.out.println(n);
            cnt++;
        }
      return answer;
    }
}
