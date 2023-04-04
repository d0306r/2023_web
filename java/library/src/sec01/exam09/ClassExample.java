package sec01.exam09;

public class ClassExample {
    public static void main(String[] args) throws Exception {
        Class clazz = Car.class;

//        Class clazz = Class.forName("sec01.exam09.Car");
//
//        Car car = new Car();
//        Class clazz = car.getClass();

        System.out.println("clazz.getName() = " + clazz.getName());
        System.out.println("clazz.getSimpleName() = " + clazz.getSimpleName());
        System.out.println("clazz.getPackage().getName() = " + clazz.getPackage().getName());

    }
}
