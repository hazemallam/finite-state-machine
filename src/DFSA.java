import java.util.Scanner;

public class DFSA {

	 public static char [][] transitionTable ={{' ','i','f','m','p','o','r','t','n','l','a'},
				{0,1,10,0,0,0,0,0,0,0,0},
				{1,0,2,3,0,0,0,0,8,0,0},
				{2,0,0,0,0,0,0,0,0,0,0},
				{3,0,0,0,4,0,0,0,0,0,0},
				{4,0,0,0,0,5,0,0,0,0,0},
				{5,0,0,0,0,0,6,0,0,0,0},
				{6,0,0,0,0,0,0,7,0,0,0},
				{7,0,0,0,0,0,0,0,0,0,0},
				{8,0,0,0,0,0,0,9,0,0,0},
				{9,0,0,0,0,0,0,0,0,0,0},
				{10,0,0,0,0,11,0,0,0,13,0},
				{11,0,0,0,0,0,12,0,0,0,0},
				{12,0,0,0,0,0,0,0,0,0,0},
				{13,0,0,0,0,14,0,0,0,0,0},
				{14,0,0,0,0,0,0,0,0,0,15},
				{15,0,0,0,0,0,0,16,0,0,0},
				{16,0,0,0,0,0,0,0,0,0,0}
				
};

	static int numberOfStates = 18;
	static int numberOfLanguageAlphabet = 11;
	
	
	
//	public static void getTransitionTable() {
//		
//		
//	
//		
////		Scanner input = new Scanner(System.in);
////		System.out.println("Enter the number of states : ");
////		numberOfStates = input.nextInt() + 1;
//		System.out.println("Enter the number of the language alphapet: ");
//		numberOfLanguageAlphabet = input.nextInt() + 1;
//		//transitionTable = new char[numberOfStates][numberOfLanguageAlphabet];
//		System.out.println("Enter all states in the transition table ");
//		
//		
//	}
//		
//		
		
		/**
		 * storing states into transition table
		 */
		
//		for (int i = 0; i<numberOfStates; i++) {
//			for(int j = 0; j<numberOfLanguageAlphabet; j++) {
//				if(i == 0 && j == 0) {
//					transitionTable[i][j] = ' ';
//					j+=1;
//				}
//				transitionTable[i][j] = input.next().charAt(0);
//			}
//		}
//		
//	}
	/**
	 * test if the transition table is empty or not
	 * @return boolean value 
	 */
	public static boolean isEmpty() {
		if(transitionTable == null) 
			return true;
		else {
			return false;
		}	
		
	}
	
	/**
	 * 
	 * @return start state 
 	 */
	public static char getInitialState() {
		return transitionTable[1][0];
	}
	/**
	 * 
	 * @param currentState of the transition table
	 * @param currentChar in the transition table
	 * @return move step by step to return next state
	 */
	public static char nextState(char currentState, char currentChar) {
		for (int i = 1; i<numberOfStates; i++) {
			if(currentState == transitionTable[i][0]) {
			for (int j = 1; j<numberOfLanguageAlphabet; j++) {
				if(currentChar == transitionTable[0][j]) {
					return transitionTable[i][j];
				}
				
			}
		}
		}
		return '#';
	}
	/**
	 * 
	 * @return accepted states
	 */
	 public static char floatAcceptState() {
		 return transitionTable[17][0];
	 }
	 
	 public static char ifAcceptState() {
		 return transitionTable[3][0];
	 }
	 public static char importAcceptState() {
		 return transitionTable[8][0];
	 }
	 public static char intAcceptState() {
		 return transitionTable[10][0];
	 }
	 public static char forAcceptState() {
		 return transitionTable[13][0];
	 }
}
