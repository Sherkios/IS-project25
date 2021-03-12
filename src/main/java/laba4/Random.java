package laba4;
public class Random {
	
	public static int Random(){
		int min = 50; // Минимальное число для диапазона
	    int max = 95; // Максимальное число для диапазона}
	    max -= min;
	    int out = (int) (Math.random() * ++max) + min;
	    return out;
	}
}



