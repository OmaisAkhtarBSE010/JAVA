package sp17bse010;
import static org.junit.Assert.*;
import org.junit.Test;
public class Counting {
	@Test
	public void allAreSmallCharacter() {
		int result = Main.countOccurance("this is a book");
		assertEquals(1, result);
	}
	@Test
	public void allAreBigCharacter() {
		int result = Main.countOccurance("This is A book");
		assertEquals(1, result);
	}
	@Test
	public void none() {
		int result = Main.countOccurance("this is my book");
		assertEquals(0, result);
	}
	@Test
	public void characterAtStart() {
		int result = Main.countOccurance("AaAthis is my book");
		assertEquals(3, result);
	}
	@Test
	public void characterAtEnd() {
		int result = Main.countOccurance("this is my bookAaA");
		assertEquals(3, result);
	}	
	@Test
	public void onlyDigit() {
		int result = Main.countOccurance("03178104592");
		assertEquals(0, result);
	}	
	@Test
	public void noCharacter() {
		int result = Main.countOccurance("");
		assertEquals(-1, result);
	}
}
