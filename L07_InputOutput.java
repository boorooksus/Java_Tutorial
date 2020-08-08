import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L07_InputOutput {

	public static void main(String[] args) {
		int x = 1;
		for(;;) {
			if(x > 10) {
				break;
			}
			x += 1;
		}
		// ���� �ݺ���
		
		// �����
		//Scanner class import �ؾ���
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է�: ");
		int i = sc.nextInt();
		System.out.println("���: " + i);
		sc.close();
		
		File file = new File("input.txt");
		try {
			Scanner sc2 = new Scanner(file);
			while(sc2.hasNextInt()) {
				System.out.println(sc2.nextInt() * 100);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("error!!");
		}
	}

}
