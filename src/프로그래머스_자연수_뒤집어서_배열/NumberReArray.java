package ���α׷��ӽ�_�ڿ���_�����_�迭;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * �ڿ��� n�� ������ �� �ڸ� ���ڸ� ���ҷ� ������ �迭 ���·� �������ּ���. ������� n�� 12345�̸� [5,4,3,2,1]�� �����մϴ�.

���� ����
n�� 10,000,000,000������ �ڿ����Դϴ�.
����� ��
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
