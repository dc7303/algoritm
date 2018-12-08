package ���α׷��ӽ�_�ڸ���_���ϱ�;
/**
 * �ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ��� ����� �ּ���.
������� N = 123�̸� 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.

���ѻ���
N�� ���� : 100,000,000 ������ �ڿ���
����� ��
N   answer
123 6
987 24
����� �� ����
����� �� #1
������ ���ÿ� �����ϴ�.

����� �� #2
9 + 8 + 7 = 24�̹Ƿ� 24�� return �ϸ� �˴ϴ�.
 * @author mark
 *
 */
public class SumNumberOfNumber {
    public static void main(String[] args) {
        SumNumberOfNumber s = new SumNumberOfNumber();
        int n = 123;
        int result = s.solution(n);
        System.out.println(result);
    }

    public int solution(int n) {
 /*       int answer = 0;
        String str = Integer.toString(n);
        for(int i = 0; i < str.length(); i++) {
            int a = Integer.parseInt(String.valueOf(str.charAt(i)));
            answer += a;
        }
        return answer;*/
        int answer = 0;
        while(n > 0) {
            answer += n%10;
            n /= 10;
        }
        return answer;
    }
}
