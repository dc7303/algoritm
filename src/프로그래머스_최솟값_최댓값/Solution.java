package ���α׷��ӽ�_�ּڰ�_�ִ�;
/*
 * ���� ����
���ڿ� s���� �������� ���е� ���ڵ��� ����Ǿ� �ֽ��ϴ�. 
str�� ��Ÿ���� ���� �� �ּҰ��� �ִ밪�� ã�� �̸� (�ּҰ�) (�ִ밪)������ ���ڿ��� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���.
������� s�� 1 2 3 4��� 1 4�� �����ϰ�, -1 -2 -3 -4��� -4 -1�� �����ϸ� �˴ϴ�.

���� ����
s���� �� �̻��� ������ �������� ���еǾ� �ֽ��ϴ�.
����� ��
s               return
1 2 3 4         1 4
-1 -2 -3 -4     -4 -1
-1 -1           -1 -1
 */
public class Solution {
    public static void main(String[] args) {
        String s = "1 2 3 4";
        Solution solution = new Solution();
        String result = solution.solution(s);
        System.out.println(result);
    }
    public String solution(String s) {
        String answer = "";
        String[] splitResult = s.split(" ");
        for(int i = 0; i < splitResult.length; i++) {
            
        }
        return answer;
    }
}
