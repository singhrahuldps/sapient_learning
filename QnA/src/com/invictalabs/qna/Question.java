package com.invictalabs.qna;

import java.util.Scanner;

class TakeInput implements Runnable {

	Question question;
	Scanner scanner;

	TakeInput(Question question, Scanner scanner) {
		this.question = question;
		this.scanner = scanner;
	}

	@Override
	public void run() {
		System.out.println(this.question.ques);
		System.out.println("1. " + this.question.opt1);
		System.out.println("2. " + this.question.opt2);
		System.out.println("3. " + this.question.opt3);
		System.out.println("4. " + this.question.opt4);
		System.out.print("Enter 1, 2, 3 or 4 : ");
		scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		if (input == this.question.correctOpt) {
			System.out.println("Correct Answer!");
		} else {
			System.out.println("Wrong Answer!");
		}
	}

}

public class Question {

	String ques;
	String opt1, opt2, opt3, opt4;
	int correctOpt;
	int input;

	public Question(String ques, String opt1, String opt2, String opt3, String opt4, int correctOpt) {
		super();
		this.ques = ques;
		this.opt1 = opt1;
		this.opt2 = opt2;
		this.opt3 = opt3;
		this.opt4 = opt4;
		this.correctOpt = correctOpt;
	}

	@SuppressWarnings("unused")
	int show() {
		
		// ExecutorService executorService = Executors.newFixedThreadPool(2);
		// Thread wait10Seconds = new Thread(new Wait10Seconds());
		Scanner scanner = null;
		Thread takeInput = new Thread(new TakeInput(this, scanner));
		takeInput.setDaemon(true);
		// List<Thread> tasks = List.of(wait10Seconds, takeInput);
		takeInput.start();
		int result = 1;
		try {
			takeInput.join(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (takeInput.isAlive()) {
			result = 0;
		}

		takeInput.interrupt();

		if (scanner != null) {
			scanner.close();
		}
		return result;
	}

}
