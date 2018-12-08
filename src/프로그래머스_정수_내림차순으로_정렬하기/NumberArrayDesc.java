package 프로그래머스_정수_내림차순으로_정렬하기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 함수 solution은 정수 n을 매개변수로 입력받습니다. 
 * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.

제한 조건
n은 1이상 8000000000 이하인 자연수입니다.
입출력 예
n   return
118372  873211
 * @author mark
 *
 */
public class NumberArrayDesc {
    public static void main(String[] args) {
        NumberArrayDesc a = new NumberArrayDesc();
        long n = 118372;
        long result = a.solution(n);
        System.out.println(result);
    }

    public long solution(long n) {
        /*String str = Long.toString(n);
        String s = "";
        long answer = 0;
        long temp = 0;
        long[] list = new long[str.length()];
        for(int i = 0; i < str.length(); i++) {
            list[i] = Long.parseLong(String.valueOf(str.charAt(i)));
        }
        
        for(int i = 0; i < list.length-1; i++) {
            for(int j = i + 1; j < list.length; j++) {
                if(list[i] < list[j]) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
            s += list[i];
            if(i == list.length-2) {
                s += list[i+1];
            }
        }
        answer = Long.parseLong(s);
        return answer;*/
        long answer = 0;
        String s = Long.toString(n);
        char[] ch = s.toCharArray();
        char temp = 'a';
        for(int i = 0; i < ch.length-1; i++) {
            for(int j = i + 1; j < ch.length; j++) {
                if(ch[i] < ch[j]) {
                    temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        answer = Long.parseLong(String.valueOf(ch));
        
        return answer;
    }
}
