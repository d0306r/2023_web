package sec02.exam06;

import sec02.exam06.Parent;

public class InstanceofExample {
    public static void method1(Parent parent) {
        if (parent instanceof Child) {
            Child child = (Child) parent;
            System.out.println("변환 성공");
        } else {
            System.out.println("변환 실패");
        }
    }

    public static void method2(Parent parent) {
        Child child = (Child) parent;
        System.out.println("변환 성공");
    }
    public static void main(String[] args) {
        Parent parent = new Child();
        method1(parent);
        method2(parent);

        Parent parent1 = new Parent();
        method1(parent1);
        method2(parent1); // Class case exception 발생
    }
}
