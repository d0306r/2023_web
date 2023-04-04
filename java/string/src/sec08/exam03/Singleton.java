package sec08.exam03;

public class Singleton {
    // private는 외부에서 객체 생성 불가능
    // 내부 클래스에서만 객체 생성 가능
    private Singleton() {
    }
    // private 접근 제한자를 사용하면 singletone 외부 클래스에서 접근 불가능
    // 내부 클래스에서만 쓸 수 있는 변수
    private static Singleton singleton = new Singleton();
    // static method를 통해 단 하나의 객체에 대한 주소값을 받을 수 있다.
    static Singleton getInstance(){
        return singleton;
    }
}
