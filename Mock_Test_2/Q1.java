
public class Q1 {

	public static void main(String[] args) {

		int no = 4;

		System.out.println(sqrt(no));
	}

	public static double sqrt(double x) {
		if (x == 0 || x == 1) {
			return x;
		}

		double left = 0;
		double right = x;
		int result = 0;

		while (left <= right) {
			double mid = (left + right) / 2;
			if (mid * mid == x) {
				return mid;
			} else if (mid * mid < x) {
				left = mid + 1;
				result = (int) mid;
			} else {
				right = mid - 1;
			}
		}
		return result;
	}
}
