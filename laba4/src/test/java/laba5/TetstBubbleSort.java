package laba5;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import laba4.BubbleSort;
import laba4.randomMassiv;

public class TetstBubbleSort {
	static Integer[] mass;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		mass = BubbleSort.BubbleSort(randomMassiv.randomMass());
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		boolean correct = true;
		for (int i = 0; i < mass.length -1 ; i++) {
			if (mass[i] > mass[i + 1]) {
				correct = false;
			}
		}
		assertTrue(correct);
	}

}
