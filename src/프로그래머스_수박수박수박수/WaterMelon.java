package ���α׷��ӽ�_���ڼ��ڼ��ڼ�;

/**
 * ���̰� n�̰�, ���ڼ��ڼ��ڼ�....�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. ������� n�� 4�̸�
 * ���ڼ����� �����ϰ� 3�̶�� ���ڼ��� �����ϸ� �˴ϴ�.
 * 
 * ���� ���� n�� ���� 10,000������ �ڿ����Դϴ�. ����� �� n return 3 ���ڼ� 4 ���ڼ���
 * 
 * @author mark
 *
 */
public class WaterMelon {

    public static void main(String[] args) {
        WaterMelon w = new WaterMelon();
        String result = w.solution(5);
        System.out.println(result);
    }

    public String solution(int n) {
        String answer = "";

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                answer += "��";
            }else {
                answer += "��"; 
            }
        }
        return answer;
    }

}
