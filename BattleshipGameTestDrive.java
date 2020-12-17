class BattleshipGame {
	int[] locationCells;
	int numOfHits = 0;
	
	public void setLocationCells (int[] locs) {
		locationCells = locs;
	}
	
	public String checkYourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";

		for (int cell : locationCells) {
			if (guess == cell) {
				result = "hit";
				numOfHits++;
				break;
			}
		}
		
		if (numOfHits == locationCells.length) {
			result = /*"hit\n*/"kill";
		}
		System.out.println(result);
			return result;
	}
}

public class BattleshipGameTestDrive {
	public static void main (String[] args) {
	
		BattleshipGame dot = new BattleshipGame();
		
		int[] locations = {2, 3, 4};
		dot.setLocationCells(locations);
		String userGuess = "2"; //fake user guess
		String result = dot.checkYourself(userGuess);
		String testResult = "failed";
		
		if (result.equals("hit")) {
			testResult = "passed";
		}
		
		System.out.println(testResult); 
	}
}
