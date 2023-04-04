package prac;

import java.util.Scanner;

public class Practice09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 값을 입력하세요 : ");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.print("두번째 값을 입력하세요 : ");
        double num2 = Double.parseDouble(scanner.nextLine());

        double result = num1 / num2;
        if (num2 == 0 || num2 == 0.0) {
            System.out.println("결과 :무한대");
        } else {
            System.out.println("결과: " + result);
        }
    }
}
