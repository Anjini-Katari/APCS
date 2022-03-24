public class Greet {
	public static void main( String[] args ) {
        	String greeting;

		BigSib richard = new BigSib("richard");
		greeting = richard.greet("freshman");
		System.out.println(greeting);
		System.out.println(richard.whatsmyname());

        	BigSib Anjini = new BigSib("anjini");
		greeting = Anjini.greet("Dr. Spaceman");
		System.out.println(greeting);

		BigSib Ruby = new BigSib("ruby");
		greeting = Ruby.greet("Kong Fooey");
		System.out.println(greeting);
		System.out.println(Ruby.helloMsg);

		BigSib Watson = new BigSib("watson");
		greeting = Watson.greet("mom");
		System.out.println(greeting);

	}
}

