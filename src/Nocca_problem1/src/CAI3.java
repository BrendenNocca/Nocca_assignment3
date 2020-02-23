import java.util.Random;
import java.util.Scanner;
public class CAI3 {


		private static int AskQuestion() {
			Random firstNum = new Random();
			Random secondNum = new Random();
			int firstNumValue = firstNum.nextInt(10);
			int secondNumValue = secondNum.nextInt(10);
			
			System.out.println("What is "+firstNumValue+" times " +secondNumValue+" ");
		
			int CorrectAnswer = firstNumValue * secondNumValue;
			return CorrectAnswer;
		}
		
		public static void displayCorrectResponse() {
			Random selection = new Random();
			int selectionNum = selection.nextInt(4);

			switch (selectionNum) {
			
			case 0: System.out.println("Very good!");break;
			case 1: System.out.println("Excellent!");break;
			case 2: System.out.println("Nice Work!");break;
			case 3: System.out.println("Keep up the good work!");break;
			
			}
		}
		public static void displayIncorrectResponse() {
			Random selection = new Random();
			int selectionNum = selection.nextInt(4);

			switch (selectionNum) {
			
			case 0: System.out.println("No. Please try again.");break;
			case 1: System.out.println("Wrong. Try once more");break;
			case 2: System.out.println("Don't give up");break;
			case 3: System.out.println("No. Keep trying");break;
			
			}
		}
		public static int readResponse(){
			Scanner in = new Scanner(System.in);
			
			int Response = in.nextInt();
			return Response;
		}
		
		public static int IsAnswerCorrect(int Answer) {
			Scanner in = new Scanner(System.in);
			int StuAnswer = readResponse();
			if (StuAnswer != Answer) {
				displayIncorrectResponse();
				return 0;
			}
			displayCorrectResponse(); 
			return 1;
		}
		
		
		public static void displayCompletitionMessage(int total) {
			
			double percentage = total/10;
			System.out.println("Your score is" +percentage+ "");
			if (percentage >= 0.75) {
				System.out.println("Congratulations! you are ready to go to the next level");
			}
			else if (percentage < 0.75){
				System.out.println("Please ask your teacher for extra help");
			}
		}

		public static void quiz() {
			int total =0;
			for (int counter = 0; counter <=10; counter++)
				{
			
				total += IsAnswerCorrect(AskQuestion());
				}
			displayCompletitionMessage(total);
		}
		
		public static void main(String[] args) {
			quiz();
			
		}
		
	}

