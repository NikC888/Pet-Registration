package com.sqa.nc.petreg;

import java.util.*;

import com.sqa.nc.util.helpers.*;

/**
 *   File Name: PetRegistration.java<br>
 *
 *   Cui, Nicolas<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 2, 2016
 *
 */
/**
 * PetRegistration //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Cui, Nicolas
 * @version 1.0.0
 * @since 1.0
 */
public class PetRegistration {

	public enum Pet {
		BIRD, CAT, DOG, FISH, HORSE, REPTILE
	}

	private static String appName = "Pet Registration 101";
	private static int numOfActualPetRegistrations;
	private static int numOfRequestPetRegistrations;
	private static int[] petAges;
	private static char[] petGenders;
	private static boolean[] pethasRabiesShots;
	private static String[] petNames, petAddresses;
	private static String[] petTypes;
	private static double[] petYearlyFees;
	private static String regPetsString = "";
	private static Scanner scanner;
	private static double totalPetRegPrice;
	private static String username;

	/**
	 * @param args
	 */
	/*
	 * ask how many pets to register
	 * for each pet, ask what type
	 * if not valid, let user know
	 * ---but if valid, then confirm price with user
	 * after CONFIRMING to register for 1 year, use switch to determine
	 * price
	 * if user follow through enter -> name (String), address(String),
	 * ---age(int), rabies Shot (boolean),
	 * ---yearly Pet Fees(double), and Gender (char)
	 * upon exiting echo all pet details to user
	 */
	// welcomeUser
	// requestPetNumber();
	// enterPetTypes();
	// enterPetDetails();
	// echoPetInfo();
	// farewellUser
	public static void registerPets () {
		welcomeUser();
		numOfRequestPetRegistrations = retrievePetRegistrationCount();
		numOfActualPetRegistrations = requestTypeOfPetAndPriceConfirmation();
		requestPetDetails();
		displayPetRegistrationInformation();
		farewellUser();
	}

	/**
	 * @param resultString
	 * @return
	 */
	private static boolean checkIfUserCanAfford (String resultString) {
		double petRegPrice;
		boolean canAfford = false;
		switch (resultString) {
			case "BIRD":
				petRegPrice = 17.75;
				break;
			case "CAT":
				petRegPrice = 35.00;
				break;
			case "DOG":
				petRegPrice = 45.00;
				break;
			case "FISH":
				petRegPrice = 5.50;
				break;
			case "HORSE":
				petRegPrice = 1200.00;
				break;
			case "REPTILE":
				petRegPrice = 22.22;
				break;
			default:
				petRegPrice = 0;
				break;
		}
		totalPetRegPrice += petRegPrice;
		canAfford = RequestInput.getBoolean(
				String.format("It costs $%,.2f to register a %s, would you like to continue registering it?? ",
						petRegPrice, resultString.toLowerCase()));
		return canAfford;
	}

	/**
	 *
	 */
	private static void displayPetRegistrationInformation () {
		System.out.println("Request: " + numOfRequestPetRegistrations);
		System.out.println("Actual: " + numOfActualPetRegistrations);
		System.out.println("Pets " + regPetsString);
		System.out.println("Total price: " + totalPetRegPrice);
		for (int i = 0; i < numOfActualPetRegistrations; i++) {
			System.out.println("Pet #" + (i + 1) + "'s ...");
			System.out.println("Age is: " + petAges[i]);
			System.out.println("\tGender is: " + petGenders[i]);
			System.out.println("\tHas had its Rabies Shots: " +
					pethasRabiesShots[i]);
			System.out.println("\tName is: " + petNames[i]);
			System.out.println("\tAddres is: " + petAddresses[i]);
			System.out.println("\tType is: " + petTypes[i]);
			System.out.println("\tYearly Fee is: " + petYearlyFees[i]);
		}
	}

	/**
	 *
	 */
	private static void farewellUser () {
		AppBasics.farewellUser(username, appName);
	}

	/**
	 *
	 */
	private static void requestPetDetails () {
		petTypes = regPetsString.split(":");
		// petAges = new int [petTypes.length()];
		petAges = new int[numOfActualPetRegistrations];
		petGenders = new char[numOfActualPetRegistrations];
		pethasRabiesShots = new boolean[numOfActualPetRegistrations];
		petNames = new String[numOfActualPetRegistrations];
		petAddresses = new String[numOfActualPetRegistrations];
		// petTypes = new String[numOfActualPetRegistrations];
		petYearlyFees = new double[numOfActualPetRegistrations];
		// int age;
		// boolean rabiesShots;
		// double yearlyFees;
		// scanner = new Scanner(System.in);
		// String i nput;
		for (int i = 0; i < numOfActualPetRegistrations; i++) {
			System.out.println("Registration for " + petTypes[i].toLowerCase() + ": ");
			petNames[i] = RequestInput.getString("\tWhat is your " + petTypes[i].toLowerCase() + "'s name: ");
			petAges[i] = RequestInput.getInt("\tHow old is " + petNames[i] + "? ");
			petGenders[i] = RequestInput.getChar("\tWhat is " + petNames[i] + "'s gender (M/F)? ", 'm', 'f');
			pethasRabiesShots[i] = RequestInput.getBoolean("\tHas " + petNames[i] + " gotten his/her rabies shot? ");
			petAddresses[i] = RequestInput.getString("\tCould you give me " + petNames[i] + "'s current address? ");
			petYearlyFees[i] = RequestInput.getDouble("\tHow much on average does " + petNames[i]
					+ "cost roughly a year? ");
			// System.out.print("Please enter Pet #" + (i + 1) + "'s Age: ");
			// input = scanner.nextLine();
			// age = Integer.parseInt(input);
			// petAges[i] = age;
			// System.out.print("Please enter Pet #" + (i + 1) + "'s Gender: ");
			// input = scanner.nextLine();
			// if (Character.compare(input.charAt(0), 'm') == 0)
			// petGenders[i] = input.charAt(0);
			// else
			// petGenders[i] = 'f';
			// System.out.print("Please enter Pet whether #" + (i + 1) + " has
			// had rabies shots or not: ");
			// input = scanner.nextLine();
			// if (input.equalsIgnoreCase("y"))
			// pethasRabiesShots[i] = true;
			// else
			// pethasRabiesShots[i] = false;
			// System.out.print("Please enter Pet #" + (i + 1) + "'s name: ");
			// input = scanner.nextLine();
			// petNames[i] = input;
			// System.out.print("Please enter Pet #" + (i + 1) + "'s address:
			// ");
			// input = scanner.nextLine();
			// petAddresses[i] = input;
			// System.out.print("Please enter Pet #" + (i + 1) + "'s yearly
			// fees: ");
			// input = scanner.nextLine();
			// yearlyFees = Double.parseDouble(input);
			// petYearlyFees[i] = yearlyFees;
		}
	}

	/**
	 * @param numOfRequestPetRegistrations2
	 * @return
	 */
	private static int requestTypeOfPetAndPriceConfirmation () {
		String resultString = "";
		int registrationCount = 0;
		boolean canAfford = false;
		int registrationCounter = 0;
		for (int i = 0; i < numOfRequestPetRegistrations; i++) {
			resultString = RequestInput.getString("Can you give me the type of Pet #" + (i + 1) + "?",
					"Would you like to cancel registration for your %s?", Pet.values());
			if (resultString.length() > 0) {
				canAfford = checkIfUserCanAfford(resultString);
				if (canAfford) {
					if (regPetsString.length() > 1) {
						regPetsString += ":" + resultString;
					} else {
						regPetsString += resultString;
					}
					registrationCounter++;
				}
			}
		}
		return registrationCounter;
	}

	/**
	 * @return
	 */
	private static int retrievePetRegistrationCount () {
		return RequestInput.getInt("How many pets would you like to register into the system: ",
				"Sorry, You can only register %d and %d pets at a time", 1, 5);
	}

	private static void welcomeUser () {
		username = AppBasics.welcomeUserAndGetUsername(appName);
	}
}
