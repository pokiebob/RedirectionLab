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
		if (! isLetter(s.charAt(s.length() - 1)) ) {
			punctuation = s.charAt(s.length() - 1);
			str = str.substring(0, str.length() - 1);
		}
		
		String[] digraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
		String vowels = "aeiou";

		if (! isLetter(str.charAt(0))) {
			result = str;
		} else if (contains(digraphs, s.substring(0,2))) {
			result = str.substring(2, str.length()) + str.substring(0, 2) + "ay";
		} else if (vowels.indexOf(str.charAt(0)) != -1) {
			result = str + "hay";
		} else {
			result = str.substring(1, str.length()) + str.charAt(0) + "ay";
		}
		if (punctuation != ' ') {
			return result + punctuation;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(pigLatinSimple("mock"));
		System.out.println(pigLatinSimple("pie"));
		System.out.println(pigLatinSimple("david"));
		System.out.println(pigLatinSimple("aaron"));

		System.out.println(pigLatin("the"));
		System.out.println(pigLatin("check"));
		System.out.println(pigLatin("skee"));
		System.out.println(pigLatin("emu"));
		System.out.println(pigLatin("grade"));

		System.out.println(pigLatinBest("*emu"));
		System.out.println(pigLatinBest("4chan"));
		System.out.println(pigLatinBest("fish!"));
		System.out.println(pigLatinBest("fish"));
		System.out.println(pigLatinBest("the."));
		System.out.println(pigLatinBest("cat!"));
		System.out.println(pigLatinBest("amazing?"));
		System.out.println(pigLatinBest("apple%"));
	}
}