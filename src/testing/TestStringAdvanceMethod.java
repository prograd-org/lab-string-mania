package testing;

// Uncomment the below code to test your application

import static org.junit.Assert.*;
import org.junit.Test;

import utility.StringAdvanceMethod;

public class TestStringAdvanceMethod {
	StringAdvanceMethod sam = new StringAdvanceMethod();

	@Test
	public void testSetInputsMethod() {
		sam.setStr1("Java");
		sam.setStr2("Program");
		assertEquals("Java", sam.getStr1());
		assertEquals("Program", sam.getStr2());
		try {
			sam.setStr1(null);
			sam.setStr2(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testConcatMethod() {
		assertEquals("JavaProgram", sam.Concatenate("Java", "Program"));
		assertEquals("Java@Program", sam.Concatenate("Java@", "Program"));
		assertEquals("Java  Program", sam.Concatenate("Java ", " Program"));
		try {
			sam.Concatenate(null, null);
			sam.Concatenate("Java", null);
			sam.Concatenate(null, "Java");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testSplitMethod() {
		assertEquals("Java  rogram", sam.Split("Javaprogram", "p"));
		assertEquals("Ja  a@", sam.Split("Java@", "v"));
		try {
			sam.Split("Java", "");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testIndexOfMethod() {
		assertEquals("4", sam.IndexOf("Javaprogram", "p"));
		assertEquals("1", sam.IndexOf("Java@", "a"));
		assertEquals("4", sam.IndexOf("Java ", " "));
		try {
			sam.IndexOf("", "");
			sam.IndexOf("Java", "");
			sam.IndexOf("", "Java");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
}

