package sec08.exam04;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("123456-1234567", "홍길동");
        System.out.println("p1.nation = " + p1.nation);
        System.out.println("p1.ssn = " + p1.ssn);
        System.out.println("p1.name = " + p1.name);

        // fianl은 초기화 끝났으면 재할당 불가
//      p1.nation = "USA";
//      p1.ssn = "!23343=-3412"
        p1.name = "이몽룡";

        System.out.println("p1.nation = " + p1.nation);
        System.out.println("p1.ssn = " + p1.ssn);
        System.out.println("p1.name = " + p1.name);


    }
}
