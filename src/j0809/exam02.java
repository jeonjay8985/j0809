package j0809;

public class exam02 {
	
	static int Fac(int i) {
		if(i==1) {
			return 1;
		}else {
			return i * Fac(i-1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fact = Fac(5);
		System.out.printf("5!=%d\n", fact);
	}

}
