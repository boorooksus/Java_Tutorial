
public class L04_Operatot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int y  = 7;
		
		System.out.println("Max: " + max(x, y));
		
		double a = Math.pow(3.0, 20.0);
		
		System.out.println("3ÀÇ 20Á¦°ö: " + (int)a);
		
	}
	
	static int max(int a, int b) {
		int result = (a > b)? a: b;
		return result;
	}

}
