import java.util.Scanner;

public class Main {
	public static int isHansoo(int x) {
		int is_hansoo = 1;
		int cur = x % 10;
		x /= 10;
		int gap = cur - (x % 10);
		while(x / 10 != 0) {
			cur = x % 10;
			x /= 10;
			if(cur - (x % 10) != gap) {
				is_hansoo = 0;
				break;
			}
		}

		return is_hansoo;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int x = sc.nextInt();
		for(int i = 1; i <= x; i++) {
			if(isHansoo(i) == 1) {
				//System.out.println(i);
				cnt++;
			}
		}
		sc.close();
		System.out.println(cnt);
	}

}
