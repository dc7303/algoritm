package ���α׷��ӽ�_������ȣ;
/**
 * ���� ����
� ������ �� ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� �ٲٴ� ��ȣȭ ����� ���� ��ȣ��� �մϴ�. 
���� ��� AB�� 1��ŭ �и� BC�� �ǰ�, 3��ŭ �и� DE�� �˴ϴ�. 
z�� 1��ŭ �и� a�� �˴ϴ�. ���ڿ� s�� �Ÿ� n�� �Է¹޾� s�� n��ŭ �� ��ȣ���� ����� �Լ�, solution�� �ϼ��� ������.

���� ����
������ �ƹ��� �о �����Դϴ�.
s�� ���ĺ� �ҹ���, �빮��, �������θ� �̷���� �ֽ��ϴ�.
s�� ���̴� 8000�����Դϴ�.
n�� 1 �̻�, 25������ �ڿ����Դϴ�.
����� ��
s   n   result
AB  1   BC
z   1   a
a B z
 * @author mark
 *
 */
public class CaesarCode {
    // 51 - 26 = 25 +1 = 26 
    public static void main(String[] args) {
        CaesarCode c = new CaesarCode();
        String result = c.solution("zZ", 1);
        System.out.println(result);
        int i = 'A';
        int j = 'Z';
        System.out.println(i + " || " + j);
    }
    
    public String solution(String s, int n) {
        String answer = "";
        n = n % 26;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)){
                ch = (char)((ch - 'a' + n) % 26 + 'a');
                answer += ch;
            }else if(Character.isUpperCase(ch)) {
                ch = (char)((ch - 'A' + n) % 26 + 'A');
                answer += ch;
            }else {
                answer += ch;
            }
        }
        
        return answer;
    }
}





