import java.util.Random;
import java.util.Scanner;
public class CAI1 {


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
			System.out.println("Very good!");
		}
		public static void displayIncorrectResponse() {
			System.out.println("No, please try again");
		}
		public static int readResponse(){
			Scanner in = new Scanner(System.in);
			
			int Response = in.nextInt();
			return Response;
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
		
		
		public static void quiz() {
			IsAnswerCorrect(AskQuestion());
		}
		
		public static void main(String[] args) {
			quiz();
			
		}
		
	}

