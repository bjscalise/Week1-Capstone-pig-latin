import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {

		System.out.println("Welcome to the Pig Latin translator!"); // User prompt.

		Scanner scan = new Scanner(System.in);

		String contPrompt; // Declaring the variable that will be used to indicate that user wants to continue.

		do { // The do/while will execute once and then continue as long as the user hits Y.

			System.out.println("Please insert an English sentence:");

			String engWord = scan.nextLine();
			
			engWord = engWord.toLowerCase(); // Turns the input to lowercase.
			
			String[] engArray = engWord.split(" "); // Splits the input after each space. Separates the words in the sentence.
			
			for (int i = 0; i < engArray.length; i++) { // This for loop will find take the amount of words in the sentence and sent them to the translate method.
				
				translate(engArray[i]); // Calls the translate method and sends an array as a parameter.
			}

			System.out.println("\n Would you like to continue?");

			contPrompt = scan.nextLine();

		} while (contPrompt.equalsIgnoreCase("Y"));

	}



//	private static void split(String engWord) {
//	
//		String[] engArray = engWord.split(" ");
//		
//		for (int i = 0; i < engArray.length(); i++) {
//			
//			translate(engArray(i));
//			
//		}
//		
//	}

	public static void translate(String engWord) {

		char startLetter = engWord.charAt(0); // These index the first, second, third etc. These are used to find vowels.
		char secondLetter = engWord.charAt(1);
		char thirdLetter = engWord.charAt(2);
		char fourthLetter = engWord.charAt(3);

		String pigLatinWord;
		String noFirstLetter;
		String subString;
		
		if (engWord.length() == 1) {
			System.out.println(engWord);
		} else if (startLetter == 'a' || startLetter == 'e' || startLetter == 'i' || startLetter == 'o'
				|| startLetter == 'u') {
			pigLatinWord = engWord.concat("way");
			System.out.print(pigLatinWord + " ");
		} else if (secondLetter == 'a' || secondLetter == 'e' || secondLetter == 'i' || secondLetter == 'o'
				|| secondLetter == 'u') {
			subString = engWord.substring(0, 1);
			noFirstLetter = engWord.replace(subString, " ");
			pigLatinWord = noFirstLetter.concat(subString + "ay");
			System.out.print(trim(pigLatinWord) + " ");
		} else if (thirdLetter == 'a' || thirdLetter == 'e' || thirdLetter == 'i' || thirdLetter == 'o'
				|| thirdLetter == 'u') {
			subString = engWord.substring(0, 2);
			noFirstLetter = engWord.replace(subString, " ");
			pigLatinWord = noFirstLetter.concat(subString + "ay");
			System.out.print(trim(pigLatinWord) + " "); 
		} else if (fourthLetter == 'a' || fourthLetter == 'e' || fourthLetter == 'i' || fourthLetter == 'o'
				|| fourthLetter == 'u') {
			subString = engWord.substring(0, 3);
			noFirstLetter = engWord.replace(subString, " ");
			pigLatinWord = noFirstLetter.concat(subString + "ay");
			System.out.print(trim(pigLatinWord) + " ");
		}
	}
	
	/* This find the position of the first vowel and turn the preceding letters into a substring. These are then removed from 
	 * the word and attached to the end and concated with 'ay'. When they are removed, they are replaced with white space.
	 */

	private static String trim(String pigLatinWord) {

		return pigLatinWord.trim(); // This trims the white space.

	}
}