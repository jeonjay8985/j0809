package j0809;

public class exam01 {
	
	static void Hello(int num) {
		if(num>0) {
			System.out.println("HelloWorld!!" +num);
			Hello(num-1);
		}
	}

	public static void main(String[] args) {
		// JAVA 재귀 호출
		
		Hello(5);  //int num=5;->4->3->2->1->0(호출중지), 자기자신을 5번을 호출

	}

}
