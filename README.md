# QnA

A timed quiz which waits for input for 10 secs and then closes the quiz. **QuestionsRunner.java** executes the quiz. We create a new thread for asking the question and waiting for input and wait for the thread to complete for 10 secs using the **thread.join(10000)** command. If the thread is still alive we kill it and end the quiz otherwise we go to the next question.

## Code Output

```bash
What is the capital of India?
1. Mumbai
2. Delhi
3. Indore
4. Bengaluru
Enter 1, 2, 3 or 4 : 2
Correct Answer!
Smallest prime number?
1. 0
2. 1
3. 2
4. 3
Enter 1, 2, 3 or 4 : 3
Correct Answer!
Highest peak fo the world?
1. Kenchenjunga
2. Mt. Everest
3. Mt. Rushmore
4. K2
Enter 1, 2, 3 or 4 : 2
Correct Answer!
President of USA?
1. Netanyahu
2. Donald Trump
3. Justin Trudeau
4. Karl Marx
Enter 1, 2, 3 or 4 : 4
Wrong Answer!
Largest Ocean?
1. Indian Ocean
2. Antarctic Ocean
3. Arctic Ocean
4. Pacific Ocean
Enter 1, 2, 3 or 4 : Failed to answer in 10 sec! Game exited.
```
