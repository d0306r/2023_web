package sec02.exam02;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous annoy = new Anonymous();
        annoy.filed.turnOn();
        annoy.filed.turnOff();
        annoy.method1();
        annoy.method2(new RemoteControl() {
            // 한 번 사용하고 말 객체 구현
            @Override
            public void turnOn() {
                System.out.println("Smart TV를 켭니다.");
            }
            @Override
            public void turnOff() {
                System.out.println("Smart TV를 끕니다.");
            }
        }
        );
    }
}
