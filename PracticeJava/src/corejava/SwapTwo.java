package corejava;

public class SwapTwo {
	public static void main(String[] args) {
		int a = 10, b = 20;
//		int t = 0;
//
//		t = a;
//		a = b;
//		b = t;

		a = a + b; // 30
		b = a - b; // 10
		a = a - b;// 20
		System.out.println("a:" + a);
		System.out.println("b:" + b);
	}
}
