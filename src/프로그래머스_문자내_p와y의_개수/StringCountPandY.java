package ���α׷��ӽ�_���ڳ�_p��y��_����;
/**
 * �빮�ڿ� �ҹ��ڰ� �����ִ� ���ڿ� s�� �־����ϴ�. 
 * s�� 'p'�� ������ 'y'�� ������ ���� ������ True, �ٸ��� False�� return �ϴ� solution�� �ϼ��ϼ���. 
 * 'p', 'y' ��� �ϳ��� ���� ���� �׻� True�� �����մϴ�. ��, ������ ���� �� �빮�ڿ� �ҹ��ڴ� �������� �ʽ��ϴ�.

������� s�� pPoooyY�� true�� return�ϰ� Pyy��� false�� return�մϴ�.

���ѻ���
���ڿ� s�� ���� : 50 ������ �ڿ���
���ڿ� s�� ���ĺ����θ� �̷���� �ֽ��ϴ�.
����� ��
s           answer
pPoooyY     true
Pyy         false
����� �� ����
����� �� #1
'p'�� ���� 2��, 'y'�� ���� 2���� �����Ƿ� true�� return �մϴ�.

����� �� #2
'p'�� ���� 1��, 'y'�� ���� 2���� �ٸ��Ƿ� false�� return �մϴ�.
 * @author mark
 *
 */
public class StringCountPandY {
    
    public static void main(String[] args) {
        StringCountPandY sc = new StringCountPandY();
        String s = "pPopyooyY";
        boolean result = sc.solution(s);
        if(result) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }

    boolean solution(String s) {
        boolean answer = true;
        int pCnt = 0;
        int yCnt = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if('p' == s.charAt(i) || 'P' == s.charAt(i)) {
                pCnt++;
            }else if('y' == s.charAt(i) || 'Y' == s.charAt(i)) {
                yCnt++;
            }
        }
        if(pCnt == yCnt) {
            answer = true;
        }else {
            answer = false;
        }

        return answer;
    }
}
