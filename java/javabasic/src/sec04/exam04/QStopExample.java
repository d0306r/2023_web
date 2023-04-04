package sec04.exam04;

public class QStopExample {
    public static void main(String[] args) throws Exception {
        int keyCode;

        while (true) {
            keyCode = System.in.read();
            System.out.println("keyCode = " + keyCode);
            if(keyCode == 113) { // 113번 키코드는 q이다.
                break;
            }
        }
        System.out.println("종료");
    }
}
