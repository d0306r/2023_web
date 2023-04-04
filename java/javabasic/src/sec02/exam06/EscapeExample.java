package sec02.exam06;

public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("번호\t이름\t직업");
        System.out.print("행 단위 출력 \n"); // 개행 문자(ln) 없이 줄을 바꿔서 출력
        System.out.println("행 단위 출력 \n");
        System.out.println("우리는 \"개발자\"입니다."); // 문장 안에 따옴표 넣기
        System.out.println("봄\\여름\\가을\\겨울");  //문장 안에 역슬래시 넣기
    }
}
