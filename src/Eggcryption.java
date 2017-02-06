/**
 * http://www.foxtrot.com/comics/2010-04-04-f046d15b.gif
 */
public class Eggcryption {

	public static void main(String[] args) {
		int[][] words = { 
				{ 16, 12, 5, 1, 19, 5 },
				{ 19, 20, 5, 1, 12 },
				{ 13, 25 },
				{ 3, 1, 14, 4, 25 },
				{ 2, 1, 19, 11, 5, 20 }, 
		};
		for (int[] word : words) {
			for (int i : word) {
				char c = getCharacter(i);
				System.out.print(c);
			}
			System.out.print(' ');
		}
	}

	public static char getCharacter(int index) {
		char alpha = 'a', omega = 'z';
		char[] range = range(alpha, omega);
		return range[index - 1];
	}

	public static char[] range(char alpha, char omega) {
		char[] key = new char[omega - alpha + 1];
		for (int i = 0; i < key.length; i++) {
			key[i] = alpha++;
		}
		return key;
	}

};