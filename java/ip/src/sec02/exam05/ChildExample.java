package sec02.exam05;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.field1 = "Data";
        parent.method1();
        parent.method2();

        // 참조 변수 타입 parent에는 filed 2번과 method3번에 대한 정보가없음
//        parent.field2 = "Data2";
//        parent.method3();


    }
}
