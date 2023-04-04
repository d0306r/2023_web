package sec04.exam02;

public class KeyCodeExample {
    public static void main(String[] args) throws Exception { // 예외가 발생되면 무시한다는 의미
        int keyCode;
        keyCode = System.in.read();
        System.out.println("keyCode = " + keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode = " + keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode = " + keyCode);
    }
}
