package main;

public class Cipher {
	private static int a = 'a';
	private static int A = 'A';
	
	public static void main(String[] args) {
		System.out.println(CaesarCipher("ehihiai", false));
	}
	
	public static String CaesarCipher(String x, boolean reverse) {
		String y = "";
		for(int i = 0; i < x.length(); i++) {
			y += (char) (((int) x.charAt(i) + 23 - a) % 26 + A);
		}
		return y;
	}
}
