package 프로그래머스_3의배수와5의배수_합;

public class MultiplesOf3and5 {
	
	public static void main(String[] args) {
		int a = 0;
		for(int i = 0; i < 1000; i++) {
			if(i%3==0 || i%5==0) {
				a += i;
			}
		}
		System.out.println(a);
	}
}
