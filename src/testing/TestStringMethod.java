package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import utility.StringMethod;

public class TestStringMethod {
	StringMethod sm = new StringMethod();

	@Test
	public void testSetInputsMethod() {
		sm.setStr("Java");
		assertEquals("Java", sm.getStr());
		try {
			sm.setStr(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testLowerMethod() {
		assertEquals("hai", sm.ToLower("HaI"));
		assertEquals("1234", sm.ToLower("1234"));
		assertEquals("hai&hello", sm.ToLower("hai&HELLO"));
		assertEquals("welcome", sm.ToLower("welcome"));
		try {
			sm.ToLower("");
		} catch (IllegalArgumentException e) {
			// System.out.println("No input is given");
			e.printStackTrace();
		}
	}

	@Test
	public void testUpperMethod() {
		assertEquals("HAI", sm.ToUpper("HAI"));
		assertEquals("1234", sm.ToUpper("1234"));
		assertEquals("HAI&HELLO", sm.ToUpper("hai&HELLO"));
		assertEquals("WELCOME", sm.ToUpper("welcome"));
		try {
			sm.ToUpper("");
		} catch (IllegalArgumentException e) {
			// System.out.println("No input is given");
			e.printStackTrace();
		}
	}

	@Test
	public void testFirstCharacterMethod() {
		assertEquals("1", sm.FirstCharacter("1.hai"));
		assertEquals("@", sm.FirstCharacter("@hai"));
		assertEquals(" ", sm.FirstCharacter(" hai"));
		assertEquals("h", sm.FirstCharacter("hai"));
		try {
			sm.FirstCharacter(" ");
		} catch (IllegalArgumentException e) {
			// System.out.println("No input is given");
			e.printStackTrace();
		}
	}

	@Test
	public void testLengthMethod() {
		assertEquals("0", sm.StringLength(""));
		assertEquals("15", sm.StringLength(" WelcomeToJava "));
		assertEquals("4", sm.StringLength("123 "));
		assertEquals("1", sm.StringLength("."));
		try {
			sm.StringLength("");
		} catch (IllegalArgumentException e) {
			// System.out.println("No input is given");
			e.printStackTrace();
		}
	}

	@Test
	public void testTrimMethod() {
		assertEquals("Java", sm.Trim(" Java "));
		assertEquals("Ja va", sm.Trim("Ja va "));
		assertEquals("Java", sm.Trim("  Java  "));
		try {
			sm.Trim("");
		} catch (IllegalArgumentException e) {
			// System.out.println("No input is given");
			e.printStackTrace();
		}
	}
}
