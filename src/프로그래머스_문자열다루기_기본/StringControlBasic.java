package ���α׷��ӽ�_���ڿ��ٷ��_�⺻;
/**
 * ���ڿ� s�� ���̰� 4Ȥ�� 6�̰�, ���ڷθ� �������ִ��� Ȯ�����ִ� �Լ�, solution�� �ϼ��ϼ���.
������� s�� a234�̸� False�� �����ϰ� 1234��� True�� �����ϸ� �˴ϴ�.

���� ����
s�� ���� 1 �̻�, ���� 8 ������ ���ڿ��Դϴ�.
����� ��
s   return
a234    false
1234    true
 * @author mark
 *
 */
public class StringControlBasic {
    public static void main(String[] args) {
        StringControlBasic scb = new StringControlBasic();
        String s = "1a213141";
        boolean result = scb.solution(s);
        if(result) {
            System.out.println("���ڷθ� �Ǿ��ֽ��ϴ�.");
        }else {
            System.out.println("���ڰ� �����ֽ��ϴ�.");
        }
    }

    public boolean solution(String s) {
        
        boolean answer = true;
        for(int i = 0; i < s.length(); i++) {
            String str = s.charAt(i) + "";
            try {
                Integer.parseInt(str);
            } catch(NumberFormatException e) {
                return false;
            }
        }
        return answer;
    }

}











