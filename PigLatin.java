public class PigLatin {

	public static String pigLatinSimple(String s) {
		String str = s.toLowerCase();
		
		String vowels = "aeiou";

		if (vowels.indexOf(str.charAt(0)) != -1) {
			return str + "ay";
		} else {
			return str.substring(1, str.length()) + str.charAt(0) + "ay";
		}
	}

	public static void main(String[] args) {
		System.out.println(pigLatinSimple("mock"));
		System.out.println(pigLatinSimple("pie"));
		System.out.println(pigLatinSimple("david"));
		System.out.println(pigLatinSimple("aaron"));
	}
}