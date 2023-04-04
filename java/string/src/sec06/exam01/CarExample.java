package sec06.exam01;

public class CarExample {
    public static void main(String[] args) {
        // 클래스가 생성자가 명시적으로 선언됐을 때 기본 생성자가 없으면 사용할 수 없다 .
        Car myCar = new Car("그랜저", "검정", 300);
        //Car myCar = new Car(); <- 기본 생성자를 호출할 수 없음

    }
}
