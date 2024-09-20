package home.Assign;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num=6;
		int num1=0;
		int num2=1;
		int num3;
		System.out.println(num1);
		System.out.println(num2);
		for (int i=1; i<=num; i++) {
			num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.println(num3);
		}
	}
}
	
	