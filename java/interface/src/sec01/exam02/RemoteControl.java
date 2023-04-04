package sec01.exam02;

public interface RemoteControl {
    public static final int MAX_VOLUME = 10;
    // static fianl을 생략하면 자동으로 상수 필드로 붙여준다.
    // 인터페이스에 선언된 필드는 무조건 public static final의 특성을 갖는다. ㅣ
    public int MIN_VOLUME = 0;
}
