package ���α׷��ӽ�_���ڿ���_������_�ٲٱ�;
/**
 * ���ڿ� s�� ���ڷ� ��ȯ�� ����� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���.

���� ����
s�� ���̴� 1 �̻� 5�����Դϴ�.
s�� �Ǿտ��� ��ȣ(+, -)�� �� �� �ֽ��ϴ�.
s�� ��ȣ�� ���ڷθ� �̷�����ֽ��ϴ�.
s�� 0���� �������� �ʽ��ϴ�.
����� ��
������� str�� 1234�̸� 1234�� ��ȯ�ϰ�, -1234�̸� -1234�� ��ȯ�ϸ� �˴ϴ�.
str�� ��ȣ(+,-)�� ���ڷθ� �����Ǿ� �ְ�, �߸��� ���� �ԷµǴ� ���� �����ϴ�.
 * @author mark
 *
 */
public class StringChangeToNumber {

    public static void main(String[] args) {
        StringChangeToNumber sn = new StringChangeToNumber();
        String s = "-1234";
        int result = sn.solution(s);
        System.out.println(result);
    }

    public int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
    }
}
