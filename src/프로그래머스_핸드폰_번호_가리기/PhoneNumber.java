package ���α׷��ӽ�_�ڵ���_��ȣ_������;
/**
 * ���α׷��ӽ� ������� �������� ��ȣ�� ���� �������� ���� �� ������ ��ȭ��ȣ�� �Ϻθ� �����ϴ�.
��ȭ��ȣ�� ���ڿ� phone_number�� �־����� ��, ��ȭ��ȣ�� �� 4�ڸ��� ������ ������ ���ڸ�
 ���� *���� ���� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
s�� ���� 4 �̻�, 20������ ���ڿ��Դϴ�.
����� ��
phone_number    return
01033334444 *******4444
027778888   *****8888
 * @author mark
 *
 */
public class PhoneNumber {

    public static void main(String[] args) {
        PhoneNumber p = new PhoneNumber();
        String phone_number = "01033334444";
        String result = p.solution(phone_number);
        System.out.println(result);
    }

    public String solution(String phone_number) {
        String answer = "";
        char[] ch = phone_number.toCharArray();
        for(int i = 0; i < ch.length-4; i++) {
            ch[i] = '*';
        }
        answer = String.valueOf(ch);
        return answer;
    }
}
