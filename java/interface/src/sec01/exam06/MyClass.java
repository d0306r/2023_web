package sec01.exam06;

public class MyClass {
    RemoteControl rc = new Television();

    public MyClass() {
    }

    public MyClass(RemoteControl rc) {
        this.rc = rc;
        rc.turnOn();
        rc.setVolume(5);
    }

    void methodA() {
        // 로컬 변수로 사용
        RemoteControl rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
    }

    void methodB(RemoteControl rc) {
        // 매개 변수로 사용
        rc.turnOn();
        rc.setVolume(5);
    }
}
