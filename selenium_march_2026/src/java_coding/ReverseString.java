package java_coding;

public class ReverseString {

	public static void main(String[] args) {

		String s = "Selenium";
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {

			reverse = reverse + s.charAt(i);
		}

		System.out.println("Reverse String is " + reverse);

		char[] ch = s.toCharArray();
		String reverse2 = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			reverse2 = reverse2 + ch[i];
		}
		System.out.println(reverse2);

		// approach 2
		StringBuffer rev = new StringBuffer(s).reverse();
		System.out.println(rev);

		StringBuilder reverse1 = new StringBuilder(s).reverse();
		System.out.println(reverse1);

		String str = "Automation";
		StringBuffer sb=new StringBuffer();;
		char c[] = str.toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {
				sb.append(c[i]);
		}
		System.out.println(sb);

	}

}
