package ���α׷��ӽ�_LV2_��ȭ��ȣ���;
/**
 * ��ȭ��ȣ�ο� ���� ��ȭ��ȣ ��, �� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 �ִ��� Ȯ���Ϸ� �մϴ�.
��ȭ��ȣ�� ������ ���� ���, ������ ��ȭ��ȣ�� �������� ��ȭ��ȣ�� ���λ��Դϴ�.

������ : 119
���ؿ� : 97 674 223
������ : 11 9552 4421
��ȭ��ȣ�ο� ���� ��ȭ��ȣ�� ���� �迭 phone_book �� solution �Լ��� �Ű������� �־��� ��, 
� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 ������ false�� �׷��� ������ true�� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���� ����
phone_book�� ���̴� 1 �̻� 1,000,000 �����Դϴ�.
�� ��ȭ��ȣ�� ���̴� 1 �̻� 20 �����Դϴ�.
����� ����
phone_book  return
[119, 97674223, 1195524421] false
[123,456,789]   true
[12,123,1235,567,88]    false
����� �� ����
����� �� #1
�տ��� ������ ���� �����ϴ�.

����� �� #2
�� ��ȣ�� �ٸ� ��ȣ�� ���λ��� ��찡 �����Ƿ�, ���� true�Դϴ�.

����� �� #3
ù ��° ��ȭ��ȣ, ��12���� �� ��° ��ȭ��ȣ ��123���� ���λ��Դϴ�. ���� ���� false�Դϴ�.
 * @author mark
 *
 *
 *
 *
 *http://n1tjrgns.tistory.com/132
 */
public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] phone_book = {"119", "97674223", "1195524421"};
        boolean result = s.solution(phone_book);
        System.out.println(result);
    }
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        int strLength = phone_book[0].length();  //substring�� ����� length
        int index = 0;  //���̰� ���� ���� ���� ��ġ
        for(int i = 0; i < phone_book.length -1; i++) {
            if(phone_book[index].length() > phone_book[i+1].length()) {
                strLength = phone_book[i+1].length();
                index = i+1;
            }
        }
        
        for(int i = 0; i < phone_book.length-1; i++) {
            if(i == index) {}
            else if(phone_book[index].equals(phone_book[i+1].substring(0, strLength))){
                answer = false;
                return answer;
            }
        }
        return answer;
    }
}
