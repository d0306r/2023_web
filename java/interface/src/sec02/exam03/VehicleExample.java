package sec02.exam03;

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
//        vehicle.checkFare(); <- vehivle에는 check fare가 없으므로 강제 타입 변환이 필요

        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}
