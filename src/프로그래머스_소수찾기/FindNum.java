package ���α׷��ӽ�_�Ҽ�ã��;
/**
 * 1���� �Է¹��� ���� n ���̿� �ִ� �Ҽ��� ������ ��ȯ�ϴ� �Լ�, solution�� ����� ������.

�Ҽ��� 1�� �ڱ� �ڽ����θ� ���������� ���� �ǹ��մϴ�.
(1�� �Ҽ��� �ƴմϴ�.)

���� ����
n�� 2�̻� 1000000������ �ڿ����Դϴ�.
����� ��
n   result
10  4
5   3
����� �� ����
����� �� #1
1���� 10 ������ �Ҽ��� [2,3,5,7] 4���� �����ϹǷ� 4�� ��ȯ

����� �� #2
1���� 5 ������ �Ҽ��� [2,3,5] 3���� �����ϹǷ� 3�� ��ȯ
 * @author mark
 *
 */
public class FindNum {
    public static void main(String[] args) {
        FindNum fn = new FindNum();
        int n = 1000;
        int result = fn.solution(n);
        System.out.println(result);
    }

    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i <= n; i++) {
            if(i%2 != 0 && i%3 != 0) {
                answer += 1;
            }else if (i == 2 || i == 3) {
                answer += 1;
            }
        }
        return answer;
    }
}
