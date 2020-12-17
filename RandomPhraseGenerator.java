public class RandomPhraseGenerator {
	public static void main (String[] args) {
	
		//String array of words
		String[] listWordOne = {"jefe","patron","genio","machine gun","smart", "backend","web-based"};
		String[] listWordTwo = {"capo","flaco","perdido","copado","hermano","focused","cooperative"};
		String[] listWordThree = {"capital","strategy","mission","space","process","architecture"};

		//declares integer with the length of each array
		int oneLength = listWordOne.length;
		int twoLength = listWordTwo.length;
		int threeLength = listWordThree.length;
/*
		//prints array length
		System.out.println(oneLength);
		System.out.println(twoLength);
		System.out.println(threeLength);
*/	
		//declares integer of random number
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
/*
		//prints integer random number
		System.out.println(rand1);
		System.out.println(rand2);
		System.out.println(rand3);
*/
		//declares string to make a phrase
		String phrase = listWordOne[rand1] + " " + listWordTwo[rand2] + " " + listWordThree[rand3];

		//prints the phrase
		System.out.println("What we need is a " + phrase);

	}
}
