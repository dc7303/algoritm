package ���α׷��ӽ�_�����_��;
/**
 * �ڿ��� n�� �Է¹޾� n�� ����� ��� ���� ���� �����ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
n�� 0 �̻� 3000������ �ڿ����Դϴ�.
����� ��
n   return
12  28
5   6
����� �� ����
����� �� #1
12�� ����� 1, 2, 3, 4, 6, 12�Դϴ�. �̸� ��� ���ϸ� 28�Դϴ�.

����� �� #2
5�� ����� 1, 5�Դϴ�. �̸� ��� ���ϸ� 6�Դϴ�.
 * @author mark
 *
 */
public class SumAliquot {
    
    public static void main(String[] args) {
        SumAliquot sa = new SumAliquot();
        int n = 12;
        int result = sa.solution(n);
        System.out.println(result);
    }
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n/2; i++) {
            if(n%i==0) {
                answer += i;
            }
        }
        return answer + n;
    }
}
