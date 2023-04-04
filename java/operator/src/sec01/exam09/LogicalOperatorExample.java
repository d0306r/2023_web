package sec01.exam09;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        int charCode = 'A';

        // 대문자 체크
        if ((charCode >= 65) && (charCode <= 90)) {
            System.out.println("대문자이군요");
        }

        // 소문자 체크
        if ((charCode >= 97) && (charCode <= 122)) {
            System.out.println("소문자이군요");
        }

        // 숫자 체크, 반전으로 범위 설정
        if (!(charCode < 48) && !(charCode > 57)) {
            System.out.println("숫자이군요");
        }
    }
}
