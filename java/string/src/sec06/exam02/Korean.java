package sec06.exam02;

public class Korean {
    //Fields
    String nation = "대한민국";
    String name;
    String ssn;

    // 생성자
    public Korean (String name, String ssn) {
        // 객체 자신의 참조, python self와 같은기능
        this.name = name;
        this.ssn = ssn;
    }
}
