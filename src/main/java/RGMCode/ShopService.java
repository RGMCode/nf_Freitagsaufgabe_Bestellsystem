package RGMCode;

import java.util.Map;

public class ShopService {

    ProductRepo productRepo = new ProductRepo();
    OrderRepo orderRepo = new OrderRepo();

    public Product getProduct(int id){
        return productRepo.get(id);
    }

    public Map<Integer, Product> listProducts(){
        return productRepo.list();
    }

    public Map<Integer, Order> addOrder(){
        return orderRepo.add();
    }

    public void getOrders(){

    }

    public void listOrders(){

    }

}
