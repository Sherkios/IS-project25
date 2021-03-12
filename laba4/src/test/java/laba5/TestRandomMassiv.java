package laba5;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import laba4.randomMassiv;

public class TestRandomMassiv {
static Integer [] mass;
@BeforeClass
public static void setUpBeforeClass() throws Exception {
mass = randomMassiv.randomMass();
}

@Test
public void test() {
boolean b = false;
if (mass.length == 7) {
b = true;
}
for (int i=0; i<mass.length; i++) {
if (mass[i]==null) {
b = false;
}

}
assertTrue(b);
}


}