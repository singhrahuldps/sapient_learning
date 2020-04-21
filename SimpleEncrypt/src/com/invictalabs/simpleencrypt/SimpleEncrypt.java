package com.invictalabs.simpleencrypt;

public class SimpleEncrypt {

	private String[] key;

	private String getString(int i) {
		if (i < 10)
			return String.valueOf(i);
		if (i >= 10 && i < 16)
			return Character.toString((char) ('A' + i - 10));
		return getString(i / 16) + getString(i % 16);
	}

	public void generateKeys() {
		key = new String[26];

		int n = 200;
		boolean prime[] = new boolean[n + 1];
		for (int i = 0; i < n; i++)
			prime[i] = true;

		for (int p = 2; p * p <= n; p++) {
			if (prime[p] == true) {
				for (int i = p * 2; i <= n; i += p)
					prime[i] = false;
			}
		}

		int j = 2;
		for (int i = 0; i < 26; i++) {
			while (prime[j] == false)
				j++;
			key[i] = getString(j++);
		}
	}

	private String encryptChar(char a) {
		if (a == ' ')
			return "  ";
		if (!Character.isAlphabetic(a))
			return "_ ";
		int index = Character.toUpperCase(a) - 'A';
		return key[index] + " ";
	}

	public String encrypt(String msg) {
		String cipherText = "";
		for (int i = 0; i < msg.length(); i++) {
			cipherText += encryptChar(msg.charAt(i));
		}
		return cipherText;
	}
}
