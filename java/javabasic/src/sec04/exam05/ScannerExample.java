package sec04.exam05;

import java.util.Scanner;

public class ScannerExample  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputData;  // 입력 값을 담을 변수

        while(true) {
            inputData = scanner.nextLine();
            System.out.println("입력된 문자열 = " + inputData);
            if (inputData.equals("q")) {   //String inputData는 equals 메서드 활용해서 비교
                break;
            }
        }
        System.out.println("종료");
    }
}
