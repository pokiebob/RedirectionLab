import java.util.Scanner;

public class PigLatin {

	public static String pigLatinSimple(String s) {
		String str = s.toLowerCase();
		
		String vowels = "aeiou";

		if (vowels.indexOf(str.charAt(0)) != -1) {
			return str + "hay";
		} else {
			return str.substring(1, str.length()) + str.charAt(0) + "ay";
		}
	}
	
	private static boolean contains(String[] arr, String str) {
		for (String s : arr) {
			if (str.equals(s)) {
				return true;
			}
		}
		return false;
	}
	public static String pigLatin(String s) {
		String str = s.toLowerCase();
		
		String[] digraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
		String vowels = "aeiou";

		if (contains(digraphs, s.substring(0,2))) {
			return str.substring(2, str.length()) + str.substring(0, 2) + "ay";
		} else if (vowels.indexOf(str.charAt(0)) != -1) {
			return str + "hay";
		} else {
			return str.substring(1, str.length()) + str.charAt(0) + "ay";
		}
	}

	//only for lowercase
	private static boolean isLetter(char c) {
		return c >= 'a' && c <= 'z';
	}

	public static String pigLatinBest(String s) {
		String str = s.toLowerCase();
		String result;
		char punctuation = ' ';
		if (! isLetter(str.charAt(s.length() - 1)) ) {
			punctuation = str.charAt(str.length() - 1);
			str = str.substring(0, str.length() - 1);
		}
		
		String[] digraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
		String vowels = "aeiou";

		if (! isLetter(str.charAt(0))) {
			result = str;
		} else if (vowels.indexOf(str.charAt(0)) != -1 ) {
			result = str + "hay";
		} else if (contains(digraphs, str.substring(0,2))) {
			result = str.substring(2, str.length()) + str.substring(0, 2) + "ay";
		} else {
			result = str.substring(1, str.length()) + str.charAt(0) + "ay";
		}
		if (punctuation != ' ') {
			return result + punctuation;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = new String();
		while (s.hasNextLine()) {
			Scanner ls = new Scanner(s.nextLine());
			str = new String();
			while (ls.hasNext()) {
				str += pigLatinBest(ls.next());
				if (ls.hasNext()) {
					str += " ";
				}
			}
			if (s.hasNextLine()) {
				System.out.println(str);
			}
		}
		System.out.print(str);
		s.close();
	}
}