package com.invictalabs.qna;

public class QuestionsRunner {

	public static void main(String[] args) {
		
		int returnCode;
		Question q[] = new Question[10];

		q[0] = new Question("What is the capital of India?", "Mumbai", "Delhi", "Indore", "Bengaluru", 2);
		q[1] = new Question("Smallest prime number?", "0", "1", "2", "3", 3);
		q[2] = new Question("Highest peak fo the world?", "Kenchenjunga", "Mt. Everest", "Mt. Rushmore", "K2", 2);
		q[3] = new Question("President of USA?", "Netanyahu", "Donald Trump", "Justin Trudeau", "Karl Marx", 2);
		q[4] = new Question("Largest Ocean?", "Indian Ocean", "Antarctic Ocean", "Arctic Ocean", "Pacific Ocean", 4);

		for (int i = 0; i < q.length; i++) {
			returnCode = q[i].show();
			if (returnCode == 0) {
				System.out.println("Failed to answer in 10 sec! Game exited.");
				break;
			}
		}
	}

}
