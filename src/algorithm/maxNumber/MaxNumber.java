package algorithm.maxNumber;

import java.util.ArrayList;
import java.util.List;

public class MaxNumber {
	/*
	 * 0 �Ǵ� ���� ������ �־����� ��, ������ �̾� �ٿ� ���� �� �ִ� ���� ū ���� �˾Ƴ� �ּ���.

���� ���, �־��� ������ [6, 10, 2]��� [6102, 6210, 1062, 1026, 2610, 2106]�� ���� �� �ְ�, ���� ���� ū ���� 6210�Դϴ�.

0 �Ǵ� ���� ������ ��� �迭 numbers�� �Ű������� �־��� ��, ������ ���ġ�Ͽ� ���� �� �ִ� ���� ū ���� ���ڿ��� �ٲپ� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���� ����
numbers�� ���̴� 1 �̻� 100,000 �����Դϴ�.
numbers�� ���Ҵ� 0 �̻� 1,000 �����Դϴ�.
������ �ʹ� Ŭ �� ������ ���ڿ��� �ٲپ� return �մϴ�.
	 */
	public String solution(int[] numbers) {
        String answer = "";
        String str;
        List<Integer> sortList = new ArrayList<>();
        char temp;
        
        for(int i = 0; i < numbers.length; i++) {
			str = numbers[i] + "";
        }
        
        char[] chList = answer.toCharArray();
        
        
        for(int i = 0; i < chList.length; i++) {
        	for(int j = 0; j < chList.length -1; j++) {
        		if(chList[i] < chList[j+1]) {
        			temp = chList[i];
        			chList[i] = chList[j+1];
        			chList[j+1] = temp;
        		}
        	}
        }
        
        String result = chList.toString();
        
        
        return result;
    }
	public static void main(String[]args) {
		MaxNumber mn = new MaxNumber();
		int[] arr = {6, 10, 2};
		String answer = mn.solution(arr);
		System.out.println(answer);
	}
}
