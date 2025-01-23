/**
 * This class aims to implement ciphers taught in class Math 445
 * @author Ian Yim
 */

package main;

public class Cipher {
	private static int a = 'a';
	private static int A = 'A';
	
	public static void main(String[] args) {
		System.out.println(CaesarCipher("ehihiai", false));
		System.out.println(CaesarCipher("BEFEFXF", true));		
	}
	
	public static String CaesarCipher(String x, boolean invert) {
		/**
		 * Implements CaesarCipher (a shift cipher by 23)
		 */
		
		String y = "";
		for(int i = 0; i < x.length(); i++) {
			if(!invert) {
				y += (char) (((int) x.charAt(i) + 23 - a) % 26 + A);
			} else {
				y += (char) (((int) x.charAt(i) + 3 - A) % 26 + a);
			}
		}
		return y;
	}
}
