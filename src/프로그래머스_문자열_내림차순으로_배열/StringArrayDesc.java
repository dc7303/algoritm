package 프로그래머스_문자열_내림차순으로_배열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

제한 사항
str은 길이 1 이상인 문자열입니다.
입출력 예
s           return
Zbcdefg     gfedcbZ
 * @author mark
 *
 */
public class StringArrayDesc {
    public static void main(String[] args) {
        StringArrayDesc sad = new StringArrayDesc();
        String s = "Zbcdefg";
        String result = sad.solution(s);
        System.out.println(result);
    }

    public String solution(String s) {
        String answer = "";
        char temp = 'a';
        char[] ch = s.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            for(int j = i + 1; j < ch.length; j++) {
                if(ch[i] < ch[j]) {
                    temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
            answer += ch[i];
        }
        return answer;
    }
}
