package ���α׷��ӽ�_�̻���_����_�����;
/**
 * ���ڿ� s�� �� �� �̻��� �ܾ�� �����Ǿ� �ֽ��ϴ�. �� �ܾ�� �ϳ� �̻��� ���鹮�ڷ� ���еǾ� �ֽ��ϴ�. 
 * �� �ܾ��� ¦����° ���ĺ��� �빮�ڷ�, Ȧ����° ���ĺ��� �ҹ��ڷ� �ٲ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.

���� ����
���ڿ� ��ü�� ¦/Ȧ�� �ε����� �ƴ϶�, �ܾ�(������ ����)���� ¦/Ȧ�� �ε����� �Ǵ��ؾ��մϴ�.
����� ��
s                   return
try hello world     TrY HeLlO WoRlD
����� �� ����
try hello world�� �� �ܾ� try, hello, world�� �����Ǿ� �ֽ��ϴ�. 
�� �ܾ��� ¦����° ���ڸ� �빮�ڷ�, Ȧ����° ���ڸ� �ҹ��ڷ� �ٲٸ� TrY, HeLlO, WoRlD�Դϴ�. 
���� TrY HeLlO WoRlD �� �����մϴ�.
 * @author mark
 *
 */
public class OddStringMake {
    public static void main(String[] args) {
        OddStringMake os = new OddStringMake();
        String s = "try hello world";
        String result = os.solution(s);
        System.out.println(result);
    }
    
    public String solution(String s) {
        String answer = "";
        String[] st = s.split(" ");
        char[] ch = null;
        for(int i = 0; i < st.length; i++) {
            for(int j = 0; j < st[i].length(); j++) {
                if(j==0 || j%2==0) {
                    ch = st[i].toCharArray();
                    ch[j] = (char)(st[i].charAt(j) - 'a' + 'A');
                    answer += ch[j];
                }else {
                    answer += ch[j];
                }
            }
            answer += " ";
        }
        return answer;
    }
}
