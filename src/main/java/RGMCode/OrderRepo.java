package RGMCode;

import java.util.HashMap;
import java.util.Map;

public class OrderRepo {

    Map<Integer, Order> orders = new HashMap<>();
    ProductRepo productRepo = new ProductRepo();

    public void list(){

    }

    public void get(){

    }

    public Map<Integer, Order> add(){
        orders.put(1, new Order(1,productRepo.list()));
        orders.put(2, new Order(2,productRepo.list()));

        return orders;
    }

}
