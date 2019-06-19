import java.util.Scanner;

public class Processing {
	static char currentChar;
	static char currentState;
	static char [] tape;
	static int tapeIndex = 0;

	public static void main(String[] args) {
		
		
		
		
		
		
		/////////////////////////////////////////////////
		
		Scanner input = new Scanner (System.in);
		
		//DFSA.getTransitionTable();
		
		boolean accept = false;
		while(!accept) {
			System.out.println("Enter your String: ");
			String userString = input.nextLine();
			String []arraySource = userString.split(" ", 0);
			if(userString.contentEquals("close"))
				break;
			else {
				for(int i = 0; i<arraySource.length; i++) {
					//System.out.println(arraySource[i]);
					tape = arraySource[i].toCharArray();
					tapeIndex = 0;
					dfsa();
			}
			
//			}
//			if(userString.contentEquals("close"))
//				break;
//			else {
//				tape = userString.toCharArray();
//				tapeIndex = 0;
//				dfsa();
			}
		}

	}
	/**
	 * deterministic finite state automata
	 */
	private static void dfsa() {
		currentState  = DFSA.getInitialState(); //start state
		currentChar = nextChar();       //next character in tape
        while(currentChar != '#'){
            currentState = moveStep(currentState,currentChar); //move one step 
            currentChar = nextChar();   // next character in tape
        } 
        
        System.out.println(acceptStateChecker());
		
	}
	/**
	 * 
	 * @return next char in tape
	 */
	private static char nextChar() {
		if(tape == null || tapeIndex == tape.length) {
			return '#';
		}
		else {
			return tape[tapeIndex++];
		}
		
		
	}
	/**
	 * 
	 * @param currentState in transition table
	 * @param currentChar  in transition table
	 * @return next state
	 */
	private static char moveStep(char currentState, char currentChar) {
		return DFSA.nextState(currentState, currentChar);
	}
	
	/**
	 * 
	 * @return the state of the input is accepted or rejected
	 */
	private static String acceptStateChecker() {
        if(DFSA.intAcceptState()==currentState) {
            return "keyword ---> int";
        }
        else if(DFSA.floatAcceptState()==currentState) {
            return "keyword ---> float";
        }
        else if(DFSA.importAcceptState()==currentState) {
            return "keyword ---> import";
        }
        else if(DFSA.forAcceptState()==currentState) {
            return "keyword ---> for";
        }
        else if(DFSA.ifAcceptState()==currentState) {
            return "keyword ---> if";
        }
        else if (DFSA.isEmpty()) {
        	return "Rejected";
        }
        else {
        	return "Rejected";
        }
        	
          
    }

}
