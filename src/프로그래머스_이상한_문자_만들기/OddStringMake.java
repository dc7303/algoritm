package 프로그래머스_이상한_문자_만들기;
/**
 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 
 * 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

제한 사항
문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
입출력 예
s                   return
try hello world     TrY HeLlO WoRlD
입출력 예 설명
try hello world는 세 단어 try, hello, world로 구성되어 있습니다. 
각 단어의 짝수번째 문자를 대문자로, 홀수번째 문자를 소문자로 바꾸면 TrY, HeLlO, WoRlD입니다. 
따라서 TrY HeLlO WoRlD 를 리턴합니다.
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
