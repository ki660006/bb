
public class Ex05 {

	static boolean isNumber(String str) {
		if (str == null || str.equals("")) {
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			char ab = str.charAt(i);
			if (ab < '0' || ab > '9') {
				return false;
			}
		} 
		return true;
	}

	public static void main(String[] args) {
		String str = "123";

		System.out.println("str 은 숫자 입니까? " + isNumber(str));

		str = "123ㅇ";
		System.out.println("str 은 숫자 입니까? " + isNumber(str));
	}
}
