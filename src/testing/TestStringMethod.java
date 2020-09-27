package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import utility.StringMethod;

public class TestStringMethod {
	StringMethod sm = new StringMethod();

	@Test
	public void testSetInputsMethod() {
		sm.setInput("Java");
		assertEquals("Java", sm.getInput());
		try {
			sm.setInput(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testLowerMethod() {
		assertEquals("hai", sm.lowercase("HaI"));
		assertEquals("1234", sm.lowercase("1234"));
		assertEquals("hai&hello", sm.lowercase("hai&HELLO"));
		assertEquals("welcome", sm.lowercase("welcome"));
		try {
			sm.lowercase("");
		} catch (IllegalArgumentException e) {
			// System.out.println("No input is given");
			e.printStackTrace();
		}
	}

	@Test
	public void testUpperMethod() {
		assertEquals("HAI", sm.uppercase("HAI"));
		assertEquals("1234", sm.uppercase("1234"));
		assertEquals("HAI&HELLO", sm.uppercase("hai&HELLO"));
		assertEquals("WELCOME", sm.uppercase("welcome"));
		try {
			sm.uppercase("");
		} catch (IllegalArgumentException e) {
			// System.out.println("No input is given");
			e.printStackTrace();
		}
	}

	@Test
	public void testFirstCharacterMethod() {
		assertEquals("1", sm.firstCharacter("1.hai"));
		assertEquals("@", sm.firstCharacter("@hai"));
		assertEquals(" ", sm.firstCharacter(" hai"));
		assertEquals("h", sm.firstCharacter("hai"));
		try {
			sm.firstCharacter(" ");
		} catch (IllegalArgumentException e) {
			// System.out.println("No input is given");
			e.printStackTrace();
		}
	}

	@Test
	public void testLengthMethod() {
		assertEquals("0", sm.length(""));
		assertEquals("15", sm.length(" WelcomeToJava "));
		assertEquals("4", sm.length("123 "));
		assertEquals("1", sm.length("."));
		try {
			sm.length("");
		} catch (IllegalArgumentException e) {
			// System.out.println("No input is given");
			e.printStackTrace();
		}
	}

	@Test
	public void testTrimMethod() {
		assertEquals("Java", sm.trim(" Java "));
		assertEquals("Ja va", sm.trim("Ja va "));
		assertEquals("Java", sm.trim("  Java  "));
		try {
			sm.trim("");
		} catch (IllegalArgumentException e) {
			// System.out.println("No input is given");
			e.printStackTrace();
		}
	}
}
