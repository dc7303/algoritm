package ���α׷��ӽ�_����_������_�Ǻ�;
/**
 * ������ ���� n�� ����, n�� � ���� x�� �������� �ƴ��� �Ǵ��Ϸ� �մϴ�.
n�� ���� x�� �����̶�� x+1�� ������ �����ϰ�, n�� ���� x�� ������ �ƴ϶�� -1�� �����ϴ� �Լ��� �ϼ��ϼ���.

���� ����
n�� 1�̻�, 50000000000000 ������ �����Դϴ�.
����� ��
n   return
121 144
3   -1
����� �� ����
����� ��#1
121�� ���� 11�� �����̹Ƿ�, (11+1)�� ������ 144�� �����մϴ�.

����� ��#2
3�� ������ ������ �ƴϹǷ�, -1�� �����մϴ�.
 * @author mark
 *
 */
public class Soultion {
    public static void main(String[] args) {
        Soultion s = new Soultion();
        long n = 121;
        long result = s.solution(n);
        System.out.println(result);
        
    }

    public long solution(long n) {
/*        long answer = 0;
        for(int i = 1; i < n; i++) {
            if(i == n/i) {
                answer = (i + 1) * (i + 1);
                return answer;
                
            }
            answer = -1;
        }*/
        long answer = 0;
        long x = (long)Math.sqrt(n);
        if(n == x*x) {
            answer = (long)Math.pow(x+1, 2);
            return answer;
        }
        return -1;
    }
}
