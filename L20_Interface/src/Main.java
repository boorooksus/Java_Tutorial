
public class Main implements Employee, Student {

	public static void main(String[] args) {
		Main main = new Main();
		main.name();
		main.school();
		main.workplace();

	}

	@Override
	public void school() {
		System.out.println("Inha Univ");
		
	}

	@Override
	public void name() {
		System.out.println("Boo");
		
	}

	@Override
	public void workplace() {
		System.out.println("Cafe");
		
	}

}
