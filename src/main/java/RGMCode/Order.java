package RGMCode;

import java.util.Map;

public class Order {

    private int id;
    private Map<Integer, Product> products;

    public Order(int id, Map<Integer, Product> products) {
        this.id = id;
        this.products = products;
    }

    public Order() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<Integer, Product> getProducts() {
        return products;
    }

    public void setProducts(Map<Integer, Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", products=" + products +
                '}' + '\n' ;
    }

}
