package com.invictalabs.simpleencrypt;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {

		SimpleEncrypt se = new SimpleEncrypt();

		se.generateKeys();

		Scanner sc = new Scanner(System.in);
		String msg = sc.nextLine();
		sc.close();

		String cipherText = se.encrypt(msg);

		System.out.println(cipherText);
	}

}
