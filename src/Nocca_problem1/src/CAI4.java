import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
public class CAI4 {


		private static int AskQuestion(int multiplier) {
			Random levelGeneration = new Random();
			int num1 = levelGeneration.nextInt(multiplier);
			int num2 = levelGeneration.nextInt(multiplier);
			System.out.println("What is "+num1+" times " +num2+" ");
		
			int CorrectAnswer = num1 * num2;
			return CorrectAnswer;
		}
		
		public static int readDifficulty() {
			
			System.out.println("What level of difficulty would you like to have answer? 1,2,3,or 4?");
			int Difficulty = readResponse();
			while (Difficulty >4 || Difficulty <1) {
				System.out.println("Please enter a level between 1 and 4");
				Difficulty = readResponse();
			}
			
			return Difficulty;
		}
		
		public static int GenerateQuestionArgument(int multiplier) {
			double multiplierDouble = (int) multiplier;
			double ten = 10;
			int multiplierFinal  = (int)Math.pow(ten, multiplierDouble);
			
			
			return multiplierFinal;
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
			double percentage = (double )total/10;
			
			System.out.println("Your score is %" +percentage*100+ "");
			if (percentage >= 0.75) {
				System.out.println("Congratulations! you are ready to go to the next level");
			}
			else if (percentage < 0.75){
				System.out.println("Please ask your teacher for extra help");
			}
		}

		public static void quiz() {
			int  level = GenerateQuestionArgument(readDifficulty());
			int total =0;
			for (int counter = 0; counter <10; counter++)
				{
			
				total += IsAnswerCorrect(AskQuestion(level));
				}
			displayCompletitionMessage(total);
		}
		
		public static void main(String[] args) {
			quiz();
			
		}
		
	}

