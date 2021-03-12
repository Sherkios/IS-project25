package laba4;

public class randomMassiv {
	public static Integer [] randomMass() {
		Integer [] mass = new Integer[7];
		for (int i = 0; i < mass.length; i++ ) {
		mass[i] = Random.Random();
		}
		return mass;
}
}