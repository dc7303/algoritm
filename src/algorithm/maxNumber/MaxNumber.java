package algorithm.maxNumber;

import java.util.ArrayList;
import java.util.List;

public class MaxNumber {
	/*
	 * 0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.

예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.

0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.

제한 사항
numbers의 길이는 1 이상 100,000 이하입니다.
numbers의 원소는 0 이상 1,000 이하입니다.
정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
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
