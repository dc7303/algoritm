package ���α׷��ӽ�_���ڿ�_������������_�迭;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ���ڿ� s�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
s�� ���� ��ҹ��ڷθ� �����Ǿ� ������, �빮�ڴ� �ҹ��ں��� ���� ������ �����մϴ�.

���� ����
str�� ���� 1 �̻��� ���ڿ��Դϴ�.
����� ��
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
