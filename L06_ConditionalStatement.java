
public class L06_ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World!";
		
		if(str.equals("hello world!")) {
			System.out.println("true");
		}
		
		else if(str.equalsIgnoreCase("hello world!")){
			System.out.println("true if ignore case");
		}
		
		else {
			System.out.println("false");
		}
		
		
		
	}

}
