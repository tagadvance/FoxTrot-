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
		Eggcryption eggcryption = new Eggcryption();
		CharSequence message = eggcryption.decrypt(words);
		System.out.println(message);
	}

	public Eggcryption() {

	}

	public CharSequence decrypt(int[][] words) {
		StringBuilder sb = new StringBuilder();
		for (int[] word : words) {
			if (sb.length() > 0) {
				sb.append(' ');
			}
			for (int i : word) {
				char c = getCharacter(i);
				sb.append(c);
			}
		}
		return sb;
	}

	private char getCharacter(int index) {
		char alpha = 'a', omega = 'z';
		char[] range = range(alpha, omega);
		return range[index - 1];
	}

	private char[] range(char alpha, char omega) {
		char[] key = new char[omega - alpha + 1];
		for (int i = 0; i < key.length; i++) {
			key[i] = alpha++;
		}
		return key;
	}

};
