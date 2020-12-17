public class BottlesOfBeer {
	public static void main (String[] args) {
	
		int numBottles = 99;
		String word = "bottles"; //plural

		while (numBottles > 0) {
		
			System.out.println(numBottles + " " + word + " of beer on the wall, " + numBottles + " " + word + " of beer!");
			numBottles--;

			//para que sea correctamente singular o plural la palabra
			if (numBottles == 1) {
				word = "bottle"; //singular
			}

			if (numBottles != 0) {
				System.out.println("Take one down, pass it around, " + numBottles + " " + word + " of beer on the wall");
			} 
			else {
				System.out.println("Take one down, pass it around, no more bottles of beer on the wall!");
			}

		}//end while
		
		//when numBottles = 0 end of the song, end of the loop
		System.out.println("No more bottles of beer on the wall, no more bottles of beer!");
		System.out.println("Go to the store, buy some more, 99 more bottles of beer on the wall");

	}//end main method
}//end class
