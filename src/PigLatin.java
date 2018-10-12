import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {

		/*
		 * Prompt the user to input an English word. Create Scanners for input.
		 * Translate if / else statements (if vowel/ consenant) While loop to continue/
		 * translate another word.
		 * Add splits and turn each split into a word that can be processed thru the translator.
		 * put a validating if statement in the while loop to protect against invalid inputs
		 */
		System.out.println("Welcome to the Pig Latin translator!");

		Scanner scan = new Scanner(System.in);

		String contPrompt;

		do {

			System.out.println("Please insert an English word:");

			String engWord = scan.nextLine();
			
			engWord = engWord.toLowerCase();
			
//			split(engWord);

			translate(engWord);

			System.out.println("Would you like to continue?");

			contPrompt = scan.nextLine();

		} while (contPrompt.equalsIgnoreCase("Y"));

	}

//	private static void split(String engWord) {
//	
//		String[] engArray = engWord.split(" ");
//		
//		System.out.println();
//		
//	}

	private static void translate(String engWord) {

		char startLetter = engWord.charAt(0);
		char secondLetter = engWord.charAt(1);
		char thirdLetter = engWord.charAt(2);
		char fourthLetter = engWord.charAt(3);

		String pigLatinWord;
		String noFirstLetter;
		String subString;

		if (startLetter == 'a' || startLetter == 'e' || startLetter == 'i' || startLetter == 'o'
				|| startLetter == 'u') {
			pigLatinWord = engWord.concat("way");
			System.out.println(pigLatinWord);
		} else if (secondLetter == 'a' || secondLetter == 'e' || secondLetter == 'i' || secondLetter == 'o'
				|| secondLetter == 'u') {
			subString = engWord.substring(0, 1);
			noFirstLetter = engWord.replace(subString, " ");
			pigLatinWord = noFirstLetter.concat(subString + "ay");
			System.out.println(trim(pigLatinWord));
		} else if (thirdLetter == 'a' || thirdLetter == 'e' || thirdLetter == 'i' || thirdLetter == 'o'
				|| thirdLetter == 'u') {
			subString = engWord.substring(0, 2);
			noFirstLetter = engWord.replace(subString, " ");
			pigLatinWord = noFirstLetter.concat(subString + "ay");
			System.out.println(trim(pigLatinWord)); 
		} else if (fourthLetter == 'a' || fourthLetter == 'e' || fourthLetter == 'i' || fourthLetter == 'o'
				|| fourthLetter == 'u') {
			subString = engWord.substring(0, 3);
			noFirstLetter = engWord.replace(subString, " ");
			pigLatinWord = noFirstLetter.concat(subString + "ay");
			System.out.println(trim(pigLatinWord));
		}
	}

	private static String trim(String pigLatinWord) {

		return pigLatinWord.trim();

	}
}