import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ring = new int[n];
		for(int i = 0; i < n; i++) {
			ring[i] = sc.nextInt();
		}
		
		for(int i = 1; i < n; i++) {
			rotation(ring[0], ring[i]);
		}
		
		sc.close();
	}
	
	private static void rotation(int x, int y) {
		if(x % y == 0) {
			System.out.println((x / y) + "/1");
		}
		else if(y % x == 0) {
			System.out.println("1/" + (y / x));
		}
		else {
			int gcd = 1;
			for(int i = 2; i < x && i < y; i++) {
				if(x % i == 0 && y % i == 0) {
					gcd = i;
				}
			}
			System.out.println((x / gcd) + "/" + (y / gcd));
		}
	}

}
