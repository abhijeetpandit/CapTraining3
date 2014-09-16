package randomtests;

public class TestFloats {
	public static void main(String[] args) {
		float f = 123.33f;
		f = f/0;
		float f2 = 0;
		float f3 = f+f2;
		System.out.println(f3);
		
		int i=20;
		i=i/0;
		System.out.println(i);
	}
}
