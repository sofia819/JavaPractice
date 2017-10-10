/*
 * Count from a to b without using loop.
 * */

public class CountUp {
	public static void main(String[] args) {
		count(0, 5);
	}
	
	public static void count (int a, int b) {
		System.out.println(a);
		if(b != a)
			count(a + 1, b);
	}
}
