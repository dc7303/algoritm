package ���α׷��ӽ�_���ڿ���������������ϱ�;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ���ڿ��� ������ ����Ʈ strings��, ���� n�� �־����� ��, �� ���ڿ��� �ε��� n��° ���ڸ� �������� �������� �����Ϸ� �մϴ�. 
 * ���� ��� strings�� [sun, bed, car]�̰� n�� 1�̸� �� �ܾ��� �ε��� 1�� ���� u, e, a�� strings�� �����մϴ�.

���� ����
strings�� ���� 1 �̻�, 50������ �迭�Դϴ�.
strings�� ���Ҵ� �ҹ��� ���ĺ����� �̷���� �ֽ��ϴ�.
strings�� ���Ҵ� ���� 1 �̻�, 100������ ���ڿ��Դϴ�.
��� strings�� ������ ���̴� n���� Ů�ϴ�.
�ε��� 1�� ���ڰ� ���� ���ڿ��� ���� �� ���, ���������� �ռ� ���ڿ��� ���ʿ� ��ġ�մϴ�.
����� ��
strings n   return
[sun, bed, car] 1   [car, bed, sun]
[abce, abcd, cdx]   2   [abcd, abce, cdx]
����� �� ����
����� �� 1
sun, bed, car�� 1��° �ε��� ���� ���� u, e, a �Դϴ�. �̸� �������� strings�� �����ϸ� [car, bed, sun] �Դϴ�.

����� �� 2
abce�� abcd, cdx�� 2��° �ε��� ���� c, c, x�Դϴ�. ���� ���� �Ŀ��� cdx�� ���� �ڿ� ��ġ�մϴ�. 
abce�� abcd�� ���������� �����ϸ� abcd�� �켱�ϹǷ�, ���� [abcd, abce, cdx] �Դϴ�.
 * @author mark
 *
 */
public class MyStringArray {
    
    public static void main(String[] args) {
        MyStringArray m = new MyStringArray();
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;
        String[] result = m.solution(strings, n);
        /*for(int i = 0; i < result.length; i++) {
            System.out.println(result.length);
        }*/
        System.out.println(Arrays.toString(m.solution(strings, n)));
        
    }
    
    public String[] solution(String[] strings, int n) {
        List<String> list = new ArrayList();
        
        for(int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(list);
        
        String[] answer = new String[list.size()];
        for(int i = 0; i < strings.length; i++) {
            answer[i] = list.get(i).substring(1, list.get(i).length());
        }
        
        return answer;
    }
}
