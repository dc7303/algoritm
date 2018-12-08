package algorithm.charSearch;

public class CharSearch {
	
	public String solution(String s) {
		char[] values = s.toCharArray();
		
		String answer = String.valueOf(values[values.length / 2]);
		if(values.length%2==0) {
			answer = String.valueOf(values[values.length / 2 - 1]) + String.valueOf(values[values.length / 2]);
			return answer;
		}
		
		
		return answer;
	}
		    
	public static void main (String [] args) {
		CharSearch cs = new CharSearch();
		String result = cs.solution("cloudS");
		System.out.println(result);
	}
	
}
