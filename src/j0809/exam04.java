package j0809;

class Car{
	String model;
	String color;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	Car() {
		
	}
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public void show() {
		System.out.printf("모델 : %10s  색상 : %10s%n", getModel(), getColor());
	}
}

public class exam04 {

	public static void main(String[] args) {
		// 객체 배열 생성
		
		Car car[] = new Car[5];
		car[0] = new Car("아반떼", "흰색");
		car[1] = new Car("모닝", "검정색");
		car[2] = new Car("소나타", "빨간색");
		car[3] = new Car("SM3", "회색");
		car[4] = new Car("BMW", "은색");
		
		for(Car arr : car) {           //for-each문 사용하면 끝나는 조건 지정안해도 ok
			System.out.println(arr.model);
			arr.show();                //
		}
		
		/*for(int i=0; i<car.length; i++) {
			car[i].show();
		}*/
		

	}

}
