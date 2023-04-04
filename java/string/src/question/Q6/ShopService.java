package question.Q6;

import sec08.exam03.Singleton;

public class ShopService {
    private static ShopService singleton = new ShopService();
    private ShopService(){}

    static ShopService getInstance() {
        return singleton;
    }

}
