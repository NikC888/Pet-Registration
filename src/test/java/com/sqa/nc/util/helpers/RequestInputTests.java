/**
 *   File Name: RequestInputTests.java<br>
 *
 *   Cui, Nicolas<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 30, 2016
 *
 */
package com.sqa.nc.util.helpers;

import java.util.*;

import org.junit.*;

/**
 * RequestInputTests //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Cui, Nicolas
 * @version 1.0.0
 * @since 1.0
 */
public class RequestInputTests {

	static private String question;

	static private Scanner scanner;

	static private String username;

	static private Object userValue;

	@AfterClass
	public static void farewellUser () {
		// System.out.println("Thank you " + username + " for executing my
		// RequestInput tests.\nHave a great day!");
		System.out.println("Thanks for executing the RequestInput tests");
		scanner.close();
	}

	@BeforeClass
	public static void welcomeUser () {
		// TODO Auto-generated method stub
		System.out.println("Welcome to my Request Input Tests");
		// System.out.print("Could you please provide me your name: ");
		// scanner = new Scanner(System.in);
		// username = scanner.nextLine();
	}

	@Before
	public void clearVariables () {
		userValue = "";
		question = "";
	}

	@After
	public void displayOutput () {
		System.out.println("For the question \"" + question + "\", you have given the value of (" + userValue + ")");
	}

	@Test
	@Ignore
	public void testGetChar () {
		question = "Please give me the best character: ";
		userValue = RequestInputNC.getChar(question, 'a', 'n', 'c', 'z');
	}

	@Test
	@Ignore
	public void testGetDouble () {
		question = "Please give me your lucky DOUBLE: ";
		userValue = RequestInputNC.getDouble(question);
	}

	@Test
	@Ignore
	public void testGetInt () {
		question = "Please give me your lucky number: ";
		userValue = RequestInputNC.getInt(question, 1, 2, 3, 4, 5, 6, 7, 8);
	}

	@Test
	@Ignore
	public void testGetIntWithRange () {
		question = "Please give me a number within my range: ";
		userValue = RequestInputNC.getIntWithRange(question, 0, 10);
	}

	@Test
	public void testGetString () {
		question = "Please give me your favorite color: ";
		userValue = RequestInputNC.getString(question, "red", "white", "blue");
	}
}
