package ���α׷��ӽ�_����_������������_�����ϱ�;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * �Լ� solution�� ���� n�� �Ű������� �Է¹޽��ϴ�. 
 * n�� �� �ڸ����� ū�ͺ��� ���� ������ ������ ���ο� ������ �������ּ���. 
 * ������� n�� 118372�� 873211�� �����ϸ� �˴ϴ�.

���� ����
n�� 1�̻� 8000000000 ������ �ڿ����Դϴ�.
����� ��
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
