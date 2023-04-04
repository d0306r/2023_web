package sec09.exam01.mycompany;

import sec09.exam01.hankook.SnowTire;
import sec09.exam01.hyundai.Engine;
import sec09.exam01.kumho.BigWidthTire;

public class Car {
    Engine engine = new Engine();
    SnowTire snowtire = new SnowTire();
    BigWidthTire bigWidthTire = new BigWidthTire();

    // 앞에 package를 명시해주어 어떤 class에 해당되는지 정확히 표현
    sec09.exam01.kumho.Tire tire1 = new sec09.exam01.kumho.Tire();
    sec09.exam01.hankook.Tire tire2 = new sec09.exam01.hankook.Tire();
}
