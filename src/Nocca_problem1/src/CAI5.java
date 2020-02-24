import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
public class CAI5 {


		private static double AskQuestion(int multiplier,int type) {
			Random levelGeneration = new Random();
			int num1 = levelGeneration.nextInt(multiplier);
			int num2 = levelGeneration.nextInt(multiplier);
			if(type == 5 ) {
				type = 1+levelGeneration.nextInt(4);
			}
			question(num1,num2,questionType(type));
		
			double CorrectAnswer = typeAnswer(num1,num2,type);
			return CorrectAnswer;
		}
		
		public static double typeAnswer(int num1,int num2,int type){
			double Answer=0;
			switch(type) {
			case 1 : return num1 + num2;
			case 2 : return num1 * num2;
			case 3 : return num1 - num2;
			case 4 : if(num2 == 0) {return 0;}
				return num1 / num2;
			}
			
			return Answer;
		}
		
		public static String questionType(int type){
			String Operand = " ";
			switch(type) {
			case 1 :Operand = "plus";break;
			case 2 :Operand = "times";break;
			case 3 :Operand = "minus";break;
			case 4 :Operand = "divided by";break;
			}
			return Operand;
		}
		
		public static void question(int num1,int num2,String typeString) {
			
			
			System.out.println("What is "+num1+" "+typeString+" " +num2+" ");
		}
		
		
		
		public static int readDifficulty() {
			
			System.out.println("What level of difficulty would you like to have answer? 1,2,3,or 4?");
			int Difficulty = (int)readResponse();
			while (Difficulty >4 || Difficulty <1) {
				System.out.println("Please enter a level between 1 and 4");
				Difficulty =(int) readResponse();
			}
			
			return Difficulty;
		}
		
		public static int readPorblemType() {
			System.out.println("Would you like addition(Enter 1), Multiplication(Enter 2), Subtraction(Enter 3), Division(Enter 4), or a random subset of all 4(5)");
			int type =0;
			type =(int) readResponse();
			while (type >5 || type <1) {
				System.out.println("Please enter a type between 1 and 5");
				type=(int) readResponse();
			}
			return type;
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
		public static double readResponse(){
			Scanner in = new Scanner(System.in);
			
			double Response = in.nextDouble();
			return Response;
		}
		
		public static int IsAnswerCorrect(double Answer) {
			double StuAnswer = (double) readResponse();
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
			int type = readPorblemType();
			int total =0;
			for (int counter = 0; counter <10; counter++)
				{
			
				total += IsAnswerCorrect(AskQuestion(level,type));
				}
			displayCompletitionMessage(total);
		}
		
		public static void main(String[] args) {
			quiz();
			
		}
		
	}

