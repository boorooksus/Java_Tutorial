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
		// 무한 반복문
		
		// 입출력
		//Scanner class import 해야함
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		int i = sc.nextInt();
		System.out.println("출력: " + i);
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
