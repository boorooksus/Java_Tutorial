import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �����ϼ���:");
		System.out.println("1. ����");
		System.out.println("2. ����");
		
		int x = sc.nextInt();
		if(x == 1) {
			Character character = new Worrior();
			character.desc();
		}
		else if ( x == 2) {
			Character character = new Wizard();
			character.desc();
		}
		
		sc.close();

	}

}
