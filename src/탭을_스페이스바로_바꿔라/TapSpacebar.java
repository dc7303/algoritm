package ����_�����̽��ٷ�_�ٲ��;

public class TapSpacebar {
	public static void main(String [] args) {
		String str = "abc\tabc\tabc";
		System.out.println(str);
		
		String result = TapSpacebar.replace(str);
		System.out.println(result);
	}
	
	public static String replace(String str) {
		String result = str.replaceAll("\t", "    ");
		
		return result;
	}
}
