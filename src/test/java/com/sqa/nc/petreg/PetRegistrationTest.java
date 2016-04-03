/**
 *   File Name: PetRegistrationTest.java<br>
 *
 *   Cui, Nicolas<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 2, 2016
 *
 */
package com.sqa.nc.petreg;

import org.junit.*;

/**
 * PetRegistrationTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Cui, Nicolas
 * @version 1.0.0
 * @since 1.0
 */
public class PetRegistrationTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass () throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass () throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp () throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown () throws Exception {
	}

	/**
	 * Test method for {@link com.sqa.nc.petreg.PetRegistration#registerPets()}.
	 */
	@Test
	public void testRegisterPets () {
		PetRegistration.registerPets();
	}
}
