package com.invictalabs.translator;

import java.util.Scanner;

public class TranslatorRunner {

	public static void main(String[] args) {
		
		Translator translator = new Translator();

		translator.addPhrase("Good Monring");

		translator.addTranslation("Good Morning", "Shubhodaya");
		translator.addTranslation("Good Morning", "Shubhohday");
		translator.addTranslation("Good Morning", "Bonjour");
		
		Scanner scanner = new Scanner(System.in);
		boolean isAvailable;
		String word, translation, input;
		do {

			System.out.println("Enter a word to see it's translations");
			word = new String(scanner.nextLine());
			isAvailable = translator.find(word);
			if (isAvailable) {
				System.out.println("The available translations are:");
				translator.show(word);
			} else {
				System.out.println("No translations found");
			}

			while (true) {
				System.out.println("Do you want to enter \"" + word + "\" translations?");
				System.out.println("Press 1 for yes, 0 for no.");
				input = new String(scanner.nextLine());
				if (input.compareTo("1") == 0) {
					System.out.println("Enter the respective translation: ");
					translation = new String(scanner.nextLine());
					translator.addTranslation(word, translation);
				} else {
					break;
				}
			}

			System.out.println("Do you want to view more translations?");
			System.out.println("Press 1 for yes, 0 for no.");
			input = new String(scanner.nextLine());

		} while (input.compareTo("1") == 0);

		scanner.close();
	}

}
