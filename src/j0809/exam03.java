package j0809;

public class exam03 {
	
	static void printHello() {
		System.out.println("HelloWorld!!");
		printHello();
	}

	public static void main(String[] args) {
		// 재귀 호출 오류 - 무한호출
		
		printHello();
		
		/*
         HelloWorld!!
         HelloWorld!!
         HelloWorld!!
         Exception in thread "main" java.lang.StackOverflowError
         */
	}

}
