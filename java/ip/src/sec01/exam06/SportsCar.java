package sec01.exam06;

public class SportsCar extends Car {
    @Override
    public void sppedUp() {
        speed += 10;
    }
//    public void stop() <- final method는 오버라이드 할 수 없다.
}
