package laba4;
public class Random {
	
	public static int Random(){
		int min = 50; // ����������� ����� ��� ���������
	    int max = 95; // ������������ ����� ��� ���������}
	    max -= min;
	    int out = (int) (Math.random() * ++max) + min;
	    return out;
	}
}



