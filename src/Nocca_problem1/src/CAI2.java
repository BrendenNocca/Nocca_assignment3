import java.util.Random;
import java.util.Scanner;
public class CAI2 {


		private static int AskQuestion() {
			Random firstNum = new Random();
			Random secondNum = new Random();
			int firstNumValue = firstNum.nextInt(10);
			int secondNumValue = secondNum.nextInt(10);
			
			System.out.println("What is "+firstNumValue+" times " +secondNumValue+" ");
		
			int CorrectAnswer = firstNumValue * secondNumValue;
			return CorrectAnswer;
		}
		

		public static void IsAnswerCorrect(int Answer) {
			Scanner in = new Scanner(System.in);
			int StuAnswer = readResponse();
			while (StuAnswer != Answer) {
				displayIncorrectResponse();
				StuAnswer = readResponse();
				
			}
			displayCorrectResponse(); 
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
		
		public static void quiz() {
			IsAnswerCorrect(AskQuestion());
		}
		
		public static void main(String[] args) {
			quiz();
			
		}
		
	}

