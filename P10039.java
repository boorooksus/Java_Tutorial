import java.util.Scanner;

public class P10039 {
	
	public static int getAvg(int[] scores) {
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			if(scores[i] < 40) {
				sum += 40;
			}
			else {
				sum += scores[i];
			}
		}
		return sum / 5;
	}

	public static void main(String[] args) {
		int[] scores = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0;  i< 5; i++) {
			scores[i] = sc.nextInt();
		}
		System.out.println(getAvg(scores));
		sc.close();
	}

}
