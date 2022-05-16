import java.util.*;

public class Watermelon {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int kilos = s.nextInt();
		Kilos k = new Kilos();
		String result = k.divideEqually(kilos);
		System.out.print(result);
	}
}

class Kilos {
	String divideEqually(int kilos) {
		if(kilos % 2 == 0) {
			return "YES";
		}else {
			return "NO";
		}
	}
}

Link: https://codeforces.com/problemset/problem/4/A
