package 프로그래머스_문자열다루기_기본;
/**
 * 문자열 s의 길이가 4혹은 6이고, 숫자로만 구성되있는지 확인해주는 함수, solution을 완성하세요.
예를들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.

제한 사항
s는 길이 1 이상, 길이 8 이하인 문자열입니다.
입출력 예
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
            System.out.println("숫자로만 되어있습니다.");
        }else {
            System.out.println("문자가 섞여있습니다.");
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











