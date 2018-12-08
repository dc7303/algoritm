package 프로그래머스_124나라;

import java.util.ArrayList;
import java.util.List;

public class State124 {
	//124나라
	public String solution(int n) {	
	    String answer = "";
	    int[] arr = {4, 1, 2};
	    int a;
	    while (n > 0) {
	        a = n % 3;
	        n = n / 3;
	        if (a == 0) {
	            n -= 1;
	        }
	        answer = arr[a] + answer;
	    }
	    return answer;
	}
	
	//2진수
	public String solution2(int n) {	//5
		String answer ="";
		int[] arr = {0, 1};
		int a;
		while(n > 0) {
			a = n%2;
			n = n/2;
			answer = arr[a] + answer;
		}
	
		return answer;
	}
	
	//3진수
	public String soluttion3(int n) {
		String answer = "";
		int[] arr = {0, 1, 2};
		int a;
		while(n > 0) {
			a = n%3;
			n = n/3;
			answer = arr[a] + answer;
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		State124 st = new State124();
		String result = st.solution(5050);
		System.out.println(result);
		
		String result2 = st.solution2(10);
		System.out.println(result2);
		
		String result3 = st.soluttion3(100);
		System.out.println(result3);
		
	}
}

/*
 * 	1 = 1
 *  2 = 2
 *  3 = 4
 *  4 = 11
 *  5 = 12
 *  6 = 14
 *  7 = 21
 *  8 = 22
 *  9 = 24
 *  10 = 41
 *  11 = 42
 *  12 = 44
 *  13 = 111
 */


