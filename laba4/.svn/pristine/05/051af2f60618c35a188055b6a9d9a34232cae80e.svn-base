package laba5;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import laba4.Random;

public class SubTest {

	static boolean test = false;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		int random = Random.Random();
		if ((random >= 50) && (random <= 95)) {
			test = true;
		};
	}
	
	@Test
	public void test() {
		assertTrue(test);
	}
}
