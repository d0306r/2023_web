package sec07.exam03;

public class Car {
    int gas;

    void setGas(int gas) {
        this.gas = gas;
    }

    Boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("가스가 없습니다.");
            return false;
        } else {
            System.out.println("가스가 있습니다.");
            return true;
        }
    }

    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println("달립니다. 가스 잔량: " + gas);
                gas -= 1;
            } else {
                System.out.println("멈춥니다. 가스 잔량: " + gas);
                return;
            }
        }
    }
}
