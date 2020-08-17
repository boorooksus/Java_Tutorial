import java.util.Scanner;

public class Main {
	public static int runner(int[] burgers, int[] drinks) {
		int min_burger = 2000, min_drink = 2000;
		for(int i = 0; i < 3; i++) {
			if(burgers[i] < min_burger) {
				min_burger = burgers[i];
			}
		}
		for(int i = 0; i < 2; i++) {
			if(drinks[i] < min_drink) {
				min_drink = drinks[i];
			}
		}
		return min_burger + min_drink - 50;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] burgers = new int[3];
		int[] drinks = new int[2];
		for(int i = 0; i < 3; i++) {
			burgers[i] = sc.nextInt();
		}
		for(int i = 0; i < 2; i++) {
			drinks[i] = sc.nextInt();
		}
		System.out.println(runner(burgers, drinks));
		sc.close();

	}

}